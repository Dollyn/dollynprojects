package flow.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import flow.diagram.part.FlowVisualIDRegistry;

/**
 * @generated
 */
public class FlowNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof FlowNavigatorItem) {
			FlowNavigatorItem item = (FlowNavigatorItem) element;
			return FlowVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
