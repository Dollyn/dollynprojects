package org.eclipse.wst.xml.ui.internal.tabletree;

import org.w3c.dom.Element;

public class XMLElementAttirbuteDescriptor {

	public static final String NAME_ATTR_NAME = "Name";       
	public static final String EMPTY_ATTR_NAME = "...";          
	public static final String NULL_ATTR_NAME = "";
	
	private String attrName;
	private boolean nameAttr;
	private Element[] elements;
	
	public static XMLElementAttirbuteDescriptor createEmptyDescriptor() {
		return new XMLElementAttirbuteDescriptor(EMPTY_ATTR_NAME);
	}
	
	public static XMLElementAttirbuteDescriptor createNullDescriptor() {
		return new XMLElementAttirbuteDescriptor(NULL_ATTR_NAME);
	}
	
	public XMLElementAttirbuteDescriptor(String attrName) {
		this.attrName = attrName;
	}
	
	public XMLElementAttirbuteDescriptor(String attrName, boolean nameAttr) {
		this.attrName = attrName;
		this.nameAttr = nameAttr;
	}

	public boolean isNameAttr() {
		return nameAttr;
	}

	public void setNameAttr(boolean nameAttr) {
		this.nameAttr = nameAttr;
	}

	public Element[] getElements() {
		return elements;
	}

	public void setElements(Element[] elements) {
		this.elements = elements;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttributeValue(Element element) {
		String value = element.getAttribute(attrName);
		return value;
	}
	
	public String getValueInElement(int index) {
		return getAttributeValue(elements[index]);
	}
		
}
