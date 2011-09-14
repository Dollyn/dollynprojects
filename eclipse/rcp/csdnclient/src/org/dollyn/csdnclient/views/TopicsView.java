package org.dollyn.csdnclient.views;

import java.util.List;

import net.csdn.www.Forum;

import org.dollyn.csdnclient.ModelManager;
import org.dollyn.csdnclient.dialogs.ReplyDialog;
import org.dollyn.csdnclient.model.ForumModel;
import org.dollyn.csdnclient.model.Topic;
import org.dollyn.csdnclient.model.TopicsReader;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class TopicsView extends ViewPart implements ISelectionListener{

	// The view id.
	public static final String ID = "org.dollyn.csdnclient.topicsview";
	private TableViewer viewer;
	private Forum forum;
	
	@Override
	public void createPartControl(Composite parent) {
		int style = SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL;
		Table table = new Table(parent, style);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn title = new TableColumn(table, SWT.CENTER);
		title.setWidth(500);
		title.setText("Title");
		
		TableColumn author = new TableColumn(table, SWT.CENTER);
		author.setWidth(100);
		author.setText("Author");
		
		viewer = new TableViewer(table);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new TopicLabelProvider());
		viewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				handleDoubleClick();
			}
			
		});
		
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(ForumsView.ID, this);
	}
	
	private void handleDoubleClick() {
		IStructuredSelection selection = (IStructuredSelection)viewer.getSelection();
		Topic topic = (Topic)selection.getFirstElement();
//	    HtmlCleaner cleaner = new HtmlCleaner(); 
//	    URL url;
//		try {
//			url = new URL(topic.getLink());
//			TagNode node = cleaner.clean(url.openStream(), "utf-8");
//			TagNode[] test = node.getElementsByAttValue("csdnid", "topicBody", true, false);
//			if(test.length > 0) {
//				System.out.println("帖子内如：" + test[0].getText());
//			}
//			TagNode[] reply = node.getElementsByAttValue("csdnid", "replyBody", true, false);
//			for(int i = 0; i < reply.length; i++) {
//				System.out.println("回复" + i + ": " + reply[i].getText());
//			}
//			
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		ReplyDialog dialog = new ReplyDialog(getSite().getShell(), topic);
		dialog.open();
	}

	private void refreshTopics(final Topic[] topics) {
		viewer.getTable().getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				viewer.setInput(topics);
			}
			
		});
	}
	
	@Override
	public void setFocus() {

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		ForumModel model = (ForumModel)((IStructuredSelection)selection).getFirstElement();
		forum = model.getForum();
		ModelManager.getInstance().defaultForum = forum;
		refreshTopics();
	}

	public void refreshTopics() {
		// This makes up the url of the selected rss
		String url = "http://forum.csdn.net/Rss/" + forum.getAlias() + "/UnClosedList/";
		TopicsReader reader = TopicsReader.Read(url);
		List<Topic> topics = reader.getTopics();
		refreshTopics(topics.toArray(new Topic[topics.size()]));
	}
	
}
