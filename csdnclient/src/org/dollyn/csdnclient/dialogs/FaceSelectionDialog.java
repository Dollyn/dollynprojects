package org.dollyn.csdnclient.dialogs;

import org.dollyn.csdnclient.Activator;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class FaceSelectionDialog extends PopupDialog {

	private String selection;
	
	public FaceSelectionDialog(Shell parent) {
		super(parent, SWT.NONE, true, true, true,
				false, false, "", "");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		final GridLayout compositeLayout = new GridLayout();
		compositeLayout.marginHeight = 0;
		compositeLayout.marginWidth = 0;
		composite.setLayout(compositeLayout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setBackground(parent.getBackground());
		
		Table table = new Table(composite, SWT.NONE);
		table.setLayoutData(new GridData(GridData.FILL_BOTH));
		table.setLinesVisible(true);
		
		for(int i = 0; i < 15; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(24);
			column.setText(i + "");
		}
		
		for(int i = 0; i < 7; i++) {	
			Image[] images = new Image[15];
			for(int j = 0; j < 15; j++) {
				int index = i * 15 + j;				
				images[j] = Activator.getDefault().getImage(index + ".gif");
			}
			TableItem item = new TableItem(table, SWT.NONE);
			item.setImage(images);
		}
		
		table.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(e.x);
			}
			
		});
		return composite;
	}
	
}
