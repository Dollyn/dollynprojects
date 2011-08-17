package dollyn.configure.runner;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.externaltools.internal.model.IExternalToolConstants;

public class Util {

	public static final String EXE_FILE_PATH = "exe_file_path";
	public static final String CONFIGURE_FILE_PATH = "configure_file_path";
	
	public static void start(Shell shell, boolean restart) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType programType= manager.getLaunchConfigurationType(IExternalToolConstants.ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE);
		if (programType == null) {
			return;
		}
		
		if (isAnyInstanceRunning()) {
			boolean goon = false;
			if (!restart) {
				goon = MessageDialog.openConfirm(shell, "Stop", "An instance is running, would you like to terminate it?");
			}
			
			if (goon)
				stop();
			else 
				return;
		}
			
		
		ILaunchConfiguration config = null;
		try {
			ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(programType);
			for (int i = 0; i < configurations.length; i++) {
				ILaunchConfiguration configuration = configurations[i];
				if (configuration.getName().equals(Constants.LAUNCHER_ID)) {
					config = configuration;
					break;
				}
			}
			
			ILaunchConfigurationWorkingCopy workingCopy = null;
			if (config == null) {
				workingCopy = programType.newInstance(null, Constants.LAUNCHER_ID);
			} else {
				workingCopy = config.getWorkingCopy();
			}
			
			String exePath = Util.getExeFilePath();
			File file = new File(exePath);
			File dir = file.getParentFile();
			if (dir.exists() && dir.isDirectory()) {
				workingCopy.setAttribute(IExternalToolConstants.ATTR_LOCATION, exePath);
				workingCopy.setAttribute(IExternalToolConstants.ATTR_WORKING_DIRECTORY, dir.getAbsolutePath());
				workingCopy.setAttribute(IExternalToolConstants.ATTR_TOOL_ARGUMENTS, "-f \"" + Util.getConfigureFilePath() + "\"");
				workingCopy.setAttribute(IExternalToolConstants.ATTR_BUILD_SCOPE, "${none}");
				config = workingCopy.doSave();
				
				DebugUITools.launch(config, ILaunchManager.RUN_MODE);
			}

		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void stop() {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType programType= manager.getLaunchConfigurationType(IExternalToolConstants.ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE);
		if (programType == null) {
			return;
		}
		
		for (ILaunch launch : manager.getLaunches()) {
			ILaunchConfiguration config = launch.getLaunchConfiguration();
			if (config.getName().equals(Constants.LAUNCHER_ID)) {				
				IProcess[] processes = launch.getProcesses();
				for (IProcess p : processes) {
					try {
						p.terminate();
					} catch (DebugException e) {
					}
				}
			}
		}
	}
	
	private static boolean isAnyInstanceRunning() {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType programType= manager.getLaunchConfigurationType(IExternalToolConstants.ID_PROGRAM_LAUNCH_CONFIGURATION_TYPE);
		if (programType == null) {
			return false;
		}
		
		for (ILaunch launch : manager.getLaunches()) {
			ILaunchConfiguration config = launch.getLaunchConfiguration();
			if (config.getName().equals(Constants.LAUNCHER_ID)) {
				IProcess[] processes = launch.getProcesses();
				for (IProcess p : processes) {
					if (!p.isTerminated()) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
		
	public static String getExeFilePath() {
		IDialogSettings settings = getSettings();
		return settings.get(EXE_FILE_PATH);
	}
		
	public static String getConfigureFilePath() {
		IDialogSettings settings = getSettings();
		return settings.get(CONFIGURE_FILE_PATH);
	}
		
	public static void saveSettings(String exeFilePath, String configureFilePath) {
		IDialogSettings settings = getSettings();
		settings.put(EXE_FILE_PATH, exeFilePath);
		settings.put(CONFIGURE_FILE_PATH, configureFilePath);
	}
	
	
	private static IDialogSettings getSettings() {
		return Activator.getDefault().getDialogSettings();
	}
		
}
