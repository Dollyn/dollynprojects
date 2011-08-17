package dollyn.configure.runner;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;


public class RunAction implements IWorkbenchWindowActionDelegate {

	private Shell shell;
	
	public void dispose() {
		
	}

	public void init(IWorkbenchWindow window) {
		shell = window.getShell();
	}

	public void run(IAction action) {
//		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
//		ILaunchConfigurationType programType= manager.getLaunchConfigurationType(IExternalToolConstants.ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE);
//		if (programType == null) {
//			return;
//		}
//		
//		ILaunch launches[]= manager.getLaunches();
//		for (ILaunch launch : launches) {
//			for (IProcess p : launch.getProcesses()) {
//				if (!p.isTerminated() && p.canTerminate()) {
//					try {
//						p.terminate();
//					} catch (DebugException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}
//		
//		ILaunchConfiguration config = null;
//		
//		try {
//			ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(programType);
//			for (int i = 0; i < configurations.length; i++) {
//				ILaunchConfiguration configuration = configurations[i];
//				if (configuration.getName().equals("dollynstartmain")) {
//					//config = configuration;
//					configuration.delete();
//					break;
//				}
//			}
//			
//			if (config == null) {
//				IVMInstall jre = JavaRuntime.getDefaultVMInstall();			
//				File jdkHome = jre.getInstallLocation();
//				String javaExePath = jdkHome.getPath() + "\\bin\\java.exe";
//				ILaunchConfigurationWorkingCopy workingCopy = programType.newInstance(null, "dollynstartmain");
//				workingCopy.setAttribute(IExternalToolConstants.ATTR_LOCATION, javaExePath);
//				workingCopy.setAttribute(IExternalToolConstants.ATTR_WORKING_DIRECTORY, "C:\\");
//				workingCopy.setAttribute(IExternalToolConstants.ATTR_TOOL_ARGUMENTS, "Test \"" + Util.getConfigureFilePath() + "\"");
//				config = workingCopy.doSave();
//			}
//			
//			DebugUITools.launch(config, ILaunchManager.RUN_MODE);
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}

		Util.start(shell, false);
	}

	public void selectionChanged(IAction action, ISelection selection) {
		
	}

}
