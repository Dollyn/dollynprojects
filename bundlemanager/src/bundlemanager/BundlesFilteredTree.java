package bundlemanager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

public class BundlesFilteredTree extends FilteredTree {

	protected BundlesFilteredTree(Composite parent) {
		super(parent, true);
		init(SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER | SWT.FULL_SELECTION, new PatternFilter());
	}
		
}
