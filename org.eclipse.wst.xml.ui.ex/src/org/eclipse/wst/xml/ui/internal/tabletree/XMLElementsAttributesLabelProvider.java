package org.eclipse.wst.xml.ui.internal.tabletree;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

class XMLElementsAttributesLabelProvider implements ITableLabelProvider {

	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
//		if(element instanceof XMLElementAttirbuteDescriptor) {
//			return ((XMLElementAttirbuteDescriptor)element).getValueInElement(columnIndex);
//		}
		return "err";
	}

	public void addListener(ILabelProviderListener listener) {
		
	}

	public void dispose() {
		
	}

	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	public void removeListener(ILabelProviderListener listener) {
		
	}
	
}