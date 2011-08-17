package dollyn.configure.runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Dollyn
 */
public class EditConfigureFileDialog extends Dialog {

	private String path;
	private StyledText st;
	
	/**
	 * @param parentShell
	 */
	protected EditConfigureFileDialog(Shell parentShell, String path) {
		super(parentShell);	
		this.path = path;
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
        
        Label label = new Label(client, SWT.NONE);
        label.setText("Configure File:");
        
        Text text = new Text(client, SWT.BORDER | SWT.FLAT | SWT.READ_ONLY);
        text.setText(path);
        
        st = new StyledText(client, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.horizontalSpan = 2;
        gd.minimumHeight = 300;
        gd.minimumWidth = 550;
        st.setLayoutData(gd);
        File file = new File(path);
        if (file.exists()) {
			st.setText(readFileContent(file));
        }
         
        return composite;
    }
    
    @Override
    protected void okPressed() {
    	File file = new File(path);
    	FileWriter fw;
		try {
			fw = new FileWriter(file);
	    	fw.write(st.getText());
	    	fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	super.okPressed();
    }
    
    private String readFileContent(File file) {
    	try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer content = new StringBuffer();
			String line = null;
			while ( (line = br.readLine()) != null) {
				content.append(line + "\n");
			}
			br.close();
			fr.close();
			return content.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "error occured while reading the content of file";
    }
	
}
