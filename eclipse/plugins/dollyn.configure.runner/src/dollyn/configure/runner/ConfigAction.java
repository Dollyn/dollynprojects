package dollyn.configure.runner;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class ConfigAction implements IWorkbenchWindowActionDelegate {

	private Shell shell;
	
	public void dispose() {
		
	}

	public void init(IWorkbenchWindow window) {
		shell = window.getShell();
	}

	public void run(IAction action) {
		if (shell != null) {
			ConfigDialog dialog = new ConfigDialog(shell);
			dialog.open();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		
	}

}
