package xclient;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.ViewPart;

public class TimelineView extends ViewPart {

	public static final String ID = "xclient.stream";

	private FormToolkit toolkit;
	private ScrolledForm form;

	@Override
	public void createPartControl(Composite parent) {
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Hello, Weibo!");
		
	}

	 /**
	  * Passing the focus request to the form.
	  */
	 public void setFocus() {
	  form.setFocus();
	 }

	 /**
	  * Disposes the toolkit
	  */
	 public void dispose() {
	  toolkit.dispose();
	  super.dispose();
	 }

}
