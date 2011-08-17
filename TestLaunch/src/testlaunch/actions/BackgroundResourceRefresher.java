package testlaunch.actions;


import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.model.IProcess;

/**
 * Refreshes resources as specified by a launch configuration, when 
 * an associated process terminates.
 */
public class BackgroundResourceRefresher implements IDebugEventSetListener  {

	private IProcess fProcess;
	private IResource fResoruce;
	private int fDepth;
	
	public BackgroundResourceRefresher(IProcess process, IResource resource, int depth) {
		fProcess = process;
		fResoruce = resource;
		fDepth = depth;
	}
	
	/**
	 * If the process has already terminated, resource refreshing is done
	 * immediately in the current thread. Otherwise, refreshing is done when the
	 * process terminates.
	 */
	public void startBackgroundRefresh() {
		synchronized (fProcess) {
			if (fProcess.isTerminated()) {
				refresh();
			} else {
				DebugPlugin.getDefault().addDebugEventListener(this);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.IDebugEventSetListener#handleDebugEvents(org.eclipse.debug.core.DebugEvent[])
	 */
	public void handleDebugEvents(DebugEvent[] events) {
		for (int i = 0; i < events.length; i++) {
			DebugEvent event = events[i];
			if (event.getSource() == fProcess && event.getKind() == DebugEvent.TERMINATE) {
				DebugPlugin.getDefault().removeDebugEventListener(this);
				refresh();
				break;
			}
		}
	}
	
	/**
	 * Submits a job to do the refresh
	 */
	protected void refresh() {
		Job job= new Job("Refreshings") {
			public IStatus run(IProgressMonitor monitor) {
				try {
					fResoruce.refreshLocal(fDepth, monitor);
				} catch (CoreException e) {
//					.getDefault().log(e);
					return e.getStatus();
				}	
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}
}
