package org.eclipse.gef.examples.shapes.propertysheets;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class TestPropertySheetSection extends AbstractPropertySection {
	private FormToolkit toolkit;
	private ScrolledForm form;
	
	public TestPropertySheetSection() {
		System.out.println("init");
	}

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
//		toolkit = new FormToolkit(parent.getDisplay());
//		form = toolkit.createScrolledForm(parent);
//		form.setText("test");
		Composite composite = getWidgetFactory()
		.createFlatFormComposite(parent);
		composite.setLayout(new GridLayout(2, false));
		CLabel readOnlyLabel = getWidgetFactory().createCLabel(composite,
		"isReadOnly: ");
//		readOnlyCombo = getWidgetFactory().createCCombo(composite);
//		readOnlyCombo.setItems(new String[] { "true", "false" });
//		readOnlyCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		CLabel lastModifiedLabel = getWidgetFactory().createCLabel(composite,
		"lastModifiedTime: ");
//		lastModifiedText = getWidgetFactory().createText(composite, "");
//		lastModifiedText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		super.refresh();
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		super.setInput(part, selection);
	}

}
