package org.eclipse.wst.xml.ui.internal.tabletree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wst.sse.ui.internal.contentoutline.IJFaceNodeAdapter;
import org.eclipse.wst.sse.ui.internal.contentoutline.IJFaceNodeAdapterFactory;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMDocument;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.ui.internal.contentoutline.XMLNodeActionManagerEx;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLElementEditTableViewer extends TableViewer {

	private List<TableViewerColumn> elementsColumns = new ArrayList<TableViewerColumn>();
	private TreeContentHelper treeContentHelper = new TreeContentHelper();
	private XMLTableTreeViewerEx xmlTreeViewer;
	private List<Element> elements = new ArrayList<Element>();
	
	public XMLElementEditTableViewer(Composite parent, XMLTableTreeViewerEx xmlTreeViewer) {
		super(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		getTable().setLinesVisible(true);
		getTable().setHeaderVisible(true);
		this.xmlTreeViewer = xmlTreeViewer;
		setContentProvider(new ArrayContentProvider() {
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				Object xmlTreeInput = XMLElementEditTableViewer.this.xmlTreeViewer.getInput();
				if ((oldInput != null) && (xmlTreeInput instanceof IDOMNode)) {
					IJFaceNodeAdapterFactory factory = (IJFaceNodeAdapterFactory) ((IDOMNode) xmlTreeInput).getModel().getFactoryRegistry().getFactoryFor(IJFaceNodeAdapter.class);
					if (factory != null) {
						factory.removeListener(viewer);
					}
				}
				if ((newInput != null) && (xmlTreeInput instanceof IDOMNode)) {
					IJFaceNodeAdapterFactory factory = (IJFaceNodeAdapterFactory) ((IDOMNode) xmlTreeInput).getModel().getFactoryRegistry().getFactoryFor(IJFaceNodeAdapter.class);
					if (factory != null) {
						factory.addListener(viewer);
					}
				}
			}
		});
		//setLabelProvider(new XMLElementsAttributesLabelProvider());
		TableViewerColumn column = new TableViewerColumn(this, SWT.NONE);
		column.getColumn().setWidth(70);
		column.getColumn().setText(" Ù–‘√˚");
		column.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				if(((XMLElementAttirbuteDescriptor)element).isNameAttr()) {
					return XMLElementAttirbuteDescriptor.NAME_ATTR_NAME;
				}
				return ((XMLElementAttirbuteDescriptor)element).getAttrName();
			}
		});
	}
	
	public void setElements(List<Element> elements) {
		this.elements = elements;
		for(TableViewerColumn column : elementsColumns) {
			column.getColumn().dispose();
		}
		elementsColumns.clear();
		
		final int[] i = new int[1];
		for(i[0] = 0; i[0] < elements.size(); i[0]++) {
			TableViewerColumn column = new TableViewerColumn(this, SWT.NONE);
			column.getColumn().setText(elements.get(i[0]).getNodeName());
			column.getColumn().setWidth(80);
			column.setLabelProvider(new ColumnLabelProvider() {				
				private int index;
				{
					index = i[0];
				}
				public String getText(Object ele) {
					if(((XMLElementAttirbuteDescriptor)ele).isNameAttr()) {
						return getElement2(index).getNodeName();
					}
					return ((XMLElementAttirbuteDescriptor)ele).getAttributeValue(getElement2(index));
				}
			});	
			
			column.setEditingSupport(new AbstractEditingSuport(this) {

				private int index;
				{
					index = i[0];
				}
				@Override
				protected void doSetValue(Object ele, Object value) {
					Object oldValue = getValue(ele);
					if(oldValue != null) {
						if(oldValue.equals(value)) {
							return;
						}
					} else {
						if(String.valueOf(value).equals("")) {
							return;
						}
					}
					
					XMLElementAttirbuteDescriptor descriptor = (XMLElementAttirbuteDescriptor)ele;
					if(descriptor.isNameAttr()) {
						String newName = String.valueOf(value);
						if(!newName.equals("")) {
							XMLNodeActionManagerEx nodeActionManager = new XMLNodeActionManagerEx(
									((IDOMDocument) xmlTreeViewer.getInput()).getModel(), 
									xmlTreeViewer);
							//IStructuredSelection oldSelection = (IStructuredSelection)xmlTreeViewer.getSelection();
							//final Object oldInput = getInput();
							//getElement2(i).getOwnerDocument().get
							int elementIndex = getElementIndex(getElement2(index));
							Node parent = getElement2(index).getParentNode();
							nodeActionManager.renameElement(getElement2(index), newName);
							XMLElementEditTableViewer.this.elements.set(index, (Element)parent.getChildNodes().item(elementIndex));
							//xmlTreeViewer.setSelection(oldSelection);
//							getTable().getShell().getDisplay().asyncExec(new Runnable() {
//
//								public void run() {
//									setInput(oldInput);
//								}
//								
//							});
							//element.getOwnerDocument().renameNode(element, element.getNamespaceURI(), "xxx");
							xmlTreeViewer.justRenamed = true;
							//System.out.println("Old Input: " + oldInput);
						}
						
						return;
					}
					if(getElement2(index).hasAttribute(descriptor.getAttrName())) {
						Attr attr = getElement2(index).getAttributeNode(descriptor.getAttrName());
						if(!getValue(ele).equals(value))
							treeContentHelper.setNodeValue(attr, String.valueOf(value));
					} else {
						String valueStr = String.valueOf(value);
						if(!valueStr.equals(""))
							getElement2(index).setAttribute(descriptor.getAttrName(), String.valueOf(value));
					}
						
				}

				@Override
				protected Object getValue(Object ele) {
					XMLElementAttirbuteDescriptor descriptor = (XMLElementAttirbuteDescriptor)ele;
					Object value = null;
					if(descriptor.isNameAttr()) {
						value = getElement2(index).getNodeName();
					} else {
						value = descriptor.getAttributeValue(getElement2(index));
					}					
					return value == null ? "" : value;
				}
				
			});
			elementsColumns.add(column);
		}
	}

	public int getElementIndex(Element element) {
		Node parent = element.getParentNode();
		if(parent != null) {
			NodeList children = parent.getChildNodes();
			for(int i = 0; i < children.getLength(); i++) {
				if(children.item(i).equals(element)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public Element getElement2(int index) {
		return this.elements.get(index);
	}
	
	public Object[] getElements2() {
		return this.elements.toArray();
	}
	
	@Override
	public void refresh() {
		super.refresh();
	}
		
	@Override
	public void refresh(Object o, boolean updateLabels) {
		System.out.println(getInput());
		refresh();
	}
}
