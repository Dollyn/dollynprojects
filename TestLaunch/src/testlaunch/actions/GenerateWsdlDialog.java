package testlaunch.actions;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class GenerateWsdlDialog extends Dialog{

	private String namespace;
	private String location;
	private String style;
	
	protected GenerateWsdlDialog(Shell parentShell) {
		super(parentShell);
	}

    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText("Edit File");
    }
    
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        //composite.setLayout(new GridLayout());
        Composite client = new Composite(parent, SWT.NONE);
        client.setLayout(new GridLayout(2, false));
        
        Label lb_location = new Label(client, SWT.NONE);
        lb_location.setText("Namespace:");
        
        Text tx_location = new Text(client, SWT.BORDER | SWT.FLAT);
        if (namespace != null)
        	tx_location.setText(namespace);
        tx_location.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				
			}
		});
        
        Label lb_ns = new Label(client, SWT.NONE);
        lb_ns.setText("Namespace:");
        
        Text tx_ns = new Text(client, SWT.BORDER | SWT.FLAT);
        if (namespace != null)
        	tx_ns.setText(namespace);
        tx_ns.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				
			}
		});
        
        return composite;
    }

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

    
}
