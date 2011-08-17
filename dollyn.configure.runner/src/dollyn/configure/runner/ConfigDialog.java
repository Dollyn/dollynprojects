package dollyn.configure.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ConfigDialog extends Dialog {
	
	private static final int CONFIG_BUTTON_ID = 99;
	
	// controls
//	private Button bt_UseFile;
//	private Button bt_UseSetup;
	private Text tx_ExeFile;
	private Text tx_ConfigureFile;
	
	private TableViewer setupTableViewer;
	
	private Properties properties = new Properties();
	
	boolean useCostomSetup = false;
	String exeFilePath;
	String configureFilePath;
	
	protected ConfigDialog(Shell parentShell) {
		super(parentShell);
	}
	
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText("Config");
    }
	
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        //composite.setLayout(new GridLayout());
        
        // configure file group
        Composite cp_ConfigureFilePath = new Composite(composite, SWT.NONE);
        createConfigGroup(cp_ConfigureFilePath);
               
        // setup group
        Group gp_Setup = new Group(composite, SWT.NONE);
        gp_Setup.setLayoutData(new GridData(GridData.FILL_BOTH));
        createSetupGroup(gp_Setup);
       
        String savedExePath = Util.getExeFilePath();
        if (savedExePath != null) 
        	tx_ExeFile.setText(savedExePath);
        
        String lastUsedPath = Util.getConfigureFilePath();
        if (lastUsedPath != null)
        	tx_ConfigureFile.setText(lastUsedPath);
         
        
        refreshConfigureFileContent();
        return composite;
    }
    
    private void createConfigGroup(Composite parent) {
    	parent.setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout layout = new GridLayout(3, false);
        layout.marginWidth = 0;
        parent.setLayout(layout);
        
        // exe file
        Label lb_ExeFile = new Label(parent, SWT.NONE);
        lb_ExeFile.setText("Main.exe:");
        
        tx_ExeFile = new Text(parent, SWT.BORDER | SWT.FLAT);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.minimumWidth = 300;
        tx_ExeFile.setLayoutData(gd);
        tx_ExeFile.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				exeFilePath = tx_ExeFile.getText();		
			}
        	
        });
        
        Button bt_Browse1 = new Button(parent, SWT.PUSH);
        bt_Browse1.setText("Browse...");
        bt_Browse1.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell());
				String newPath = dialog.open();
				if (newPath != null) {
					tx_ExeFile.setText(newPath);
				}
			}
        	
        });
                        
        
//        bt_UseFile = new Button(parent, SWT.RADIO);
//        bt_UseFile.setText("Configure File:");     
        // configure file
        Label label = new Label(parent, SWT.NONE);
        label.setText("Configure File:");
        
        tx_ConfigureFile = new Text(parent, SWT.BORDER | SWT.FLAT);
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.minimumWidth = 300;
        tx_ConfigureFile.setLayoutData(gd);
        tx_ConfigureFile.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				configureFilePath = tx_ConfigureFile.getText();
//				File file = new File(configureFilePath);
//
//				if (file.exists()) {
//					try {						
//						properties.load(new FileInputStream(file));
//					} catch (FileNotFoundException e1) {
//						e1.printStackTrace();
//					} catch (IOException e1) {
//						e1.printStackTrace();
//					}
//					
//				}
//				setupTableViewer.refresh();				
			}
        	
        });
                      
        Button bt_Browse = new Button(parent, SWT.PUSH);
        bt_Browse.setText("Browse...");
        bt_Browse.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell());
				String newPath = dialog.open();
				if (newPath != null) {
					tx_ConfigureFile.setText(newPath);
					refreshConfigureFileContent();
//					setupTableViewer.refresh();		
				}
			}
        	
        });
  
    }
       
    private void createSetupGroup(final Group parent) {
    	parent.setLayout(new GridLayout());
//    	bt_UseSetup = new Button(parent, SWT.RADIO);
//    	bt_UseSetup.setText("File Setup");
    	
 	
    	setupTableViewer = new TableViewer(parent, SWT.FULL_SELECTION | SWT.V_SCROLL | SWT.BORDER);
    	GridData gd = new GridData(GridData.FILL_BOTH);
    	gd.minimumHeight = 120;
    	setupTableViewer.getTable().setLayoutData(gd);
    	setupTableViewer.getTable().setLinesVisible(true);
    	setupTableViewer.getTable().setHeaderVisible(true);
    	setupTableViewer.setContentProvider(new ArrayContentProvider());
    	
    	TableViewerColumn keyColumn = new TableViewerColumn(setupTableViewer, SWT.NONE);
    	keyColumn.getColumn().setText("Key");
    	keyColumn.getColumn().setWidth(100);
    	keyColumn.setLabelProvider(new ColumnLabelProvider() {
    		@Override
    		public String getText(Object element) {
    			return String.valueOf(element);
    		}
    	});
    	
    	TableViewerColumn valueColumn = new TableViewerColumn(setupTableViewer, SWT.NONE);
    	valueColumn.getColumn().setText("Value");
    	valueColumn.getColumn().setWidth(100);
    	valueColumn.setLabelProvider(new ColumnLabelProvider() {
    		@Override
    		public String getText(Object element) {
    			if (properties != null) {
    				return properties.getProperty(String.valueOf(element), "");
    			}
    			return "";
    		}
    	});
    	
//    	valueColumn.setEditingSupport(new EditingSupport(setupTableViewer) {
//
//			@Override
//			protected boolean canEdit(Object element) {
//				return element != null;
//			}
//
//			@Override
//			protected CellEditor getCellEditor(Object element) {
//				return new TextCellEditor(setupTableViewer.getTable());
//			}
//
//			@Override
//			protected Object getValue(Object element) {
//				if (properties != null) {
//    				return properties.getProperty(String.valueOf(element), "");
//    			}
//				return "";
//			}
//
//			@Override
//			protected void setValue(Object element, Object value) {
//				if (properties != null) {
//    				properties.setProperty(String.valueOf(element), String.valueOf(value));
//    			}
//				setupTableViewer.refresh();
//			}
//    		
//    	});
    	
//    	setupTableViewer.setInput(new String[] {"name", "type", "date", "purpos"});
    	
//    	Button bt_SaveToFile = new Button(parent, SWT.PUSH);
//    	bt_SaveToFile.setText("Save To File");
//    	bt_SaveToFile.addSelectionListener(new SelectionAdapter() {
//
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				if (configureFilePath != null && configureFilePath.trim().length() != 0) {
//		    		
//		    	} else {
//		    		FileDialog dialog = new FileDialog(parent.getShell());
//		    		String path = dialog.open();
//		    		if (path != null) {
//		    			tx_ConfigureFile.setText(path);
//		    		}
//		    	}
//		    	
//		    	File file = new File(configureFilePath);
//		    	if (!file.exists()) {
//					try {
//						file.createNewFile();
//					} catch (IOException e2) {
//						e2.printStackTrace();
//					}
//		    	}
//				if (file.exists()) {
//					if (properties != null) {
//						try {
//							properties.store(new FileOutputStream(file), null);
//						} catch (IOException e1) {
//							e1.printStackTrace();
//						}
//					}
//				} else {
//				}
//				setDialogSettings();
//			}
//    		
//    	});
    	    	
    }
  
    private void refreshConfigureFileContent() {
    	properties = new Properties();
    	if (configureFilePath != null) {
        	File file = new File(configureFilePath);
    		
    		if (file.exists()) {
    			try {						
    				properties.load(new FileInputStream(file));
    			} catch (FileNotFoundException e1) {
    				e1.printStackTrace();
    			} catch (IOException e1) {
    				e1.printStackTrace();
    			}
    			
    		}
    	}
	
		setupTableViewer.setInput(properties.keySet().toArray());
    }
    
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, CONFIG_BUTTON_ID, "Edit Configure File", false);
		super.createButtonsForButtonBar(parent);
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if (CONFIG_BUTTON_ID == buttonId) {
			configButtonPressed();
		} else {
			super.buttonPressed(buttonId);
		}
	}
	
	private void configButtonPressed() {
		if (configureFilePath != null && configureFilePath.length() > 0) {
			File file = new File(configureFilePath);
			if (file.exists()) {
				EditConfigureFileDialog dialog = new EditConfigureFileDialog(getShell(), configureFilePath);
				dialog.open();
			}
		}
		refreshConfigureFileContent();
	}
    
    @Override
	protected void okPressed() {
    	setDialogSettings();
    	super.okPressed();
	}

	private void setDialogSettings() {
    	Util.saveSettings(exeFilePath, configureFilePath);
    }
    
}
