package org.dollyn.csdnclient.test;

import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TestShell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      Display display = new Display ();
	      Shell shell = new Shell (display);
//	      Label label = new Label (shell, SWT.CENTER);
//	      label.setText ("Hello_world");
//	      label.setBounds (shell.getClientArea ());
	      PopupDialog dialog = new PopupDialog(shell, SWT.NONE, false, false, false, false, false, "t", "i");
	      dialog.open();
//	      shell.open ();
	      while (!shell.isDisposed ()) {
	         if (!display.readAndDispatch ()) display.sleep ();
	      }
	      display.dispose ();
	}

}
