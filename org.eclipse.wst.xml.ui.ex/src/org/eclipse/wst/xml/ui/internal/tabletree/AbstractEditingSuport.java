package org.eclipse.wst.xml.ui.internal.tabletree;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

public abstract class AbstractEditingSuport extends EditingSupport {

	private TextCellEditor editor;

	public AbstractEditingSuport(TableViewer viewer) {
		super(viewer);
		this.editor = new TextCellEditor(viewer.getTable());
	}

	protected boolean canEdit(Object element) {
		return true;
	}

	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	protected void setValue(Object element, Object value) {
		doSetValue(element, value);
		getViewer().update(element, null);
	}

	protected abstract void doSetValue(Object element, Object value);

}
