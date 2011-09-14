package org.dollyn.csdnclient.views;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.dollyn.csdnclient.ModelManager;
import org.dollyn.csdnclient.Util;
import org.dollyn.csdnclient.model.User;
import org.dollyn.csdnclient.util.TodayInHistory;
import org.dollyn.csdnclient.util.WikiReader;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.ViewPart;

public class UsersView extends ViewPart {
	
 	public static final String ID = "org.dollyn.csdnclient.userview";
 	
 	private TableViewer viewer;

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(3, false));
		
		int style = SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL;
		Table table = new Table(parent, style);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		table.setLayoutData(gd);
		
		TableColumn column = new TableColumn(table, SWT.CENTER);
		column.setWidth(100);
		column.setText("User Name");
		
		viewer = new TableViewer(table);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new LabelProvider());
		
		createButtons(parent);
				
		refreshTable();
	}
	
	private void createButtons(Composite parent) {
		Button add = new Button(parent, SWT.NONE);
		add.setText("Add");
		add.setLayoutData(new GridData());
		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addUsers();
			}			
		});
		Button remove = new Button(parent, SWT.NONE);
		remove.setText("Remove");
		remove.setLayoutData(new GridData());
		remove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeUsers(getSelectedUsers());
			}			
		});

		
		Button collectPoint = new Button(parent, SWT.NONE);
		collectPoint.setText("CP");
		collectPoint.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// collectPoints(ModelManager.getInstance().getUsers());
				post(getSelectedUsers());
			}
		});
	}
	
	private void post(final List<User> users) {
		Job cp = new Job("cp") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				monitor.beginTask("collecting points", users.size() * 100);
				Calendar cld = new GregorianCalendar();
				int month = cld.get(Calendar.MONTH) + 1;
				int day = cld.get(Calendar.DAY_OF_MONTH);
				String key = month + "月" + day + "日";
				for(User u : users) {
					post(u, key, monitor);
				}
				monitor.done();
				return Status.OK_STATUS;
			}			
		};
		
		cp.setUser(true);
		cp.schedule();	
	}
	
	private void post(User u, String key, IProgressMonitor monitor) {
		//Util.post(u.getId(), u.getPassword(), "历史上的今天:" + key, WikiReader.readTodayInHistory(key), "a3049f56-b572-48f5-89be-4797b70d71cd");	
		//Util.reply(u.getId(), u.getPassword(), "测试\r\n换行", "http://topic.csdn.net/u/20081209/19/07add93e-3548-4d77-bffa-4e5479ae67b7.html", "a3049f56-b572-48f5-89be-4797b70d71cd");
//		System.out.println(WikiReader.readTodayInHistory(key));
//		Util.prc(u.getId(), u.getPassword(), "【历史上的今天】——" + key, "[b]以铜为镜，可以正衣冠；以古为镜，可以知兴替；以人为镜，可以明得失。[/b]", 10, WikiReader.readTodayInHistory(key), Util.FREE_ZONE);
		TodayInHistory tih = new TodayInHistory(u);
		tih.postAndReply();
		monitor.worked(100);
	}
	
	private void reply() {
		
	}
	
	private void addUsers() {
		Job add = new Job("") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("adding users", 2400);
				for(int i = 2; i < 27; i++) {
					String id = "majia" + i + "ofdollyn";
					if(ModelManager.getInstance().getUser(id) != null) continue;
					User user = new User();
					user.setId(id);
					user.setPassword("19840926");
					ModelManager.getInstance().addUser(user);
					monitor.worked(100);
				}
				
				refreshTable();
				monitor.done();
				return Status.OK_STATUS;
			}			
		};
		
		add.setUser(true);
		add.schedule();
	}
	
	private void removeUsers(final List<User> users) {
		Job remove = new Job("") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("deleting users", users.size() * 100);
				for(User u : users) {
					ModelManager.getInstance().removeUser(u);
					monitor.worked(100);
				}
				refreshTable();
				monitor.done();
				return Status.OK_STATUS; 
			}			
		};
		
		remove.setUser(true);
		remove.schedule();
	}
	
	private void collectPoints(final List<User> users) {
		Job cp = new Job("cp") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				monitor.beginTask("collecting points", users.size() * 100);
				for(User u : users) {
					//Util.prc(u.getId(), u.getPassword(), "我来赚分滴", "a3049f56-b572-48f5-89be-4797b70d71cd");		
					monitor.worked(100);
				}
				monitor.done();
				return Status.OK_STATUS;
			}			
		};
		
		cp.setUser(true);
		cp.schedule();		
	}
	
	private List<User> getSelectedUsers() {		
		ISelection s = viewer.getSelection();
		if(s instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection)s;
			return ss.toList();
		}
		return new ArrayList<User>(0);
	}
	
	private void refreshTable(){
		viewer.getTable().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				viewer.setInput(ModelManager.getInstance().getUsers().toArray());				
			}
		});		
	}
	
	@Override
	public void setFocus() {
	}

}
