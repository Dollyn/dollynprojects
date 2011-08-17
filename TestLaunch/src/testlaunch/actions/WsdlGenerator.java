package testlaunch.actions;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

public class WsdlGenerator {

	private static final String INTERFACE_NAME_PREFIX = "I";
	private static final String LAUNCHER_NAME = "GenerateWSDL";
	
	/**
	 * WSDL generation
	 * @param typeRoot Compilation Unit or Class File
	 * @param wsdlFileName the output wsdl file name, could be null
	 * @param location the location of the service, must not be null
	 * @param namespace the namespace
	 * @param style output style(DOCUMENT, RPC, or WRAPPED)
	 */
	public static void generate(ITypeRoot typeRoot, String wsdlFileName, String location, String namespace, String style) {
		IJavaProject javaProject = typeRoot.getJavaProject();
		IType type = typeRoot.findPrimaryType();
		if (type == null)
			return;
		
		String typeName = type.getElementName();
		// if didn't provide file name, compute a default name
		if (wsdlFileName == null)
			wsdlFileName = typeName.startsWith(INTERFACE_NAME_PREFIX) ? typeName.substring(1) : typeName;
			
		if (typeRoot instanceof ICompilationUnit) {
			IResource res = ((ICompilationUnit) typeRoot).getResource();
			IContainer container = res.getParent();
			IPath path = container.getFullPath().makeRelativeTo(javaProject.getPath());
			wsdlFileName = path.toString() + "/" + wsdlFileName;
		}
		
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType programType= manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
		ILaunchConfiguration config = null;
		
		try {
			ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(programType);
			for (int i = 0; i < configurations.length; i++) {
				ILaunchConfiguration configuration = configurations[i];
				if (configuration.getName().equals(LAUNCHER_NAME)) {
					config = configuration;
					break;
				}
			}
			
			ILaunchConfigurationWorkingCopy workingCopy = null;
			if (config == null) {
				workingCopy = programType.newInstance(null, LAUNCHER_NAME);
			} else {
				workingCopy = config.getWorkingCopy();
			}
			
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, javaProject.getElementName());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "org.apache.axis.wsdl.Java2WSDL");
			
			StringBuffer arguments = new StringBuffer();
			
			arguments.append("-o " + wsdlFileName + ".wsdl");
			arguments.append(" -l \"" + location + "\"");
			if (namespace != null)
				arguments.append(" -n \"" + namespace + "\"");
			
			if (style != null)
				arguments.append(" -y \"" + style + "\"");
			
			arguments.append(type.getFullyQualifiedName());
			
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, arguments.toString());
			config = workingCopy.doSave();
			
			// DebugUITools.launch(config, ILaunchManager.RUN_MODE);
			ILaunch launch = config.launch(ILaunchManager.RUN_MODE, null);
			IProcess[] processes = launch.getProcesses();
			IResource resToRefresh = null;
			if (typeRoot instanceof ICompilationUnit) {
				resToRefresh = typeRoot.getResource().getParent();
			} else {
				resToRefresh = javaProject.getProject();
			}
			if (processes.length > 0) {
				// normally, there will not be more than one process. but if there is, may have some problems here 
				BackgroundResourceRefresher refresher = new BackgroundResourceRefresher(processes[0], resToRefresh, IResource.DEPTH_ONE);
				refresher.startBackgroundRefresh();
			}
			
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}
	
}
