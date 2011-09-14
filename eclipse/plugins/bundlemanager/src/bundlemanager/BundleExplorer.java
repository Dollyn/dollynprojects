package bundlemanager;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class BundleExplorer extends ViewPart {

	public BundleExplorer() {
	}

	@Override
	public void createPartControl(Composite parent) {
		BundlesFilteredTree tree = new BundlesFilteredTree(parent);
		
		TreeViewer viewer = tree.getViewer();
		viewer.getTree().setHeaderVisible(true);
		TreeViewerColumn id = new TreeViewerColumn(viewer, SWT.NONE);
		id.getColumn().setText("ID");
		id.getColumn().setWidth(50);	
		id.setLabelProvider(new BundleColumnLabelProvider() {
			@Override
			public String getText(Bundle bundle) {
				return String.valueOf(bundle.getBundleId());
			}			
		});
		
		TreeViewerColumn state = new TreeViewerColumn(viewer, SWT.NONE);
		state.getColumn().setText("State");
		state.getColumn().setWidth(80);	
		state.setLabelProvider(new BundleColumnLabelProvider() {
			@Override
			public String getText(Bundle bundle) {
				switch (bundle.getState()) {
				case Bundle.INSTALLED:
					return "INSTALLED";
				case Bundle.RESOLVED:
					return "RESOLVED";
				case Bundle.STARTING:
					return "STARTING";
				case Bundle.ACTIVE:
					return "ACTIVE";
				case Bundle.STOPPING:
					return "STOPPING";
				case Bundle.UNINSTALLED:
					return "UNINSTALLED";

				default:
					return "UNKNOWN";
				}
			}			
		});
		
		TreeViewerColumn name = new TreeViewerColumn(viewer, SWT.NONE);
		name.getColumn().setText("Name");
		name.getColumn().setWidth(300);
		name.setLabelProvider(new BundleColumnLabelProvider() {			
			@Override
			public String getText(Bundle bundle) {
				return bundle.getSymbolicName();
			}
		});		
		
		TreeViewerColumn location = new TreeViewerColumn(viewer, SWT.NONE);
		location.getColumn().setText("Location");
		location.getColumn().setWidth(500);
		location.setLabelProvider(new BundleColumnLabelProvider() {			
			@Override
			public String getText(Bundle bundle) {
				return bundle.getLocation();
			}
		});	
		
		viewer.setContentProvider(new MyContentProvider());
		viewer.setInput(Activator.getDefault().getBundle().getBundleContext());
	}

	@Override
	public void setFocus() {
		
	}

}

abstract class  BundleColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof Bundle) {
			return getText((Bundle)element);
		}
		return super.getText(element);
	}
	
	public abstract String getText(Bundle bundle);
}

class MyContentProvider implements ITreeContentProvider {

	static Object[] NO_CHILDREN = new Object[0];
	
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof BundleContext) {
			return ((BundleContext)parentElement).getBundles();
		}
		return NO_CHILDREN;
	}

	public Object getParent(Object element) {
		return null;
	}

	public boolean hasChildren(Object element) {
		if (element instanceof BundleContext) {
			return true;
		}
		return false;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public void dispose() {
		
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}
	
}
