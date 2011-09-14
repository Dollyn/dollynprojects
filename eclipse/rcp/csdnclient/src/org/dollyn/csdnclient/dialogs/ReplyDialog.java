package org.dollyn.csdnclient.dialogs;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import net.csdn.www.Forum;

import org.dollyn.csdnclient.Activator;
import org.dollyn.csdnclient.ModelManager;
import org.dollyn.csdnclient.Util;
import org.dollyn.csdnclient.model.Topic;
import org.dollyn.csdnclient.model.User;
import org.dollyn.csdnclient.util.UBBUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

public class ReplyDialog extends Dialog {

	private Topic topic;
	private StyledText tx_Topic;
	private StyledText tx_Reply;
	
	public ReplyDialog(Shell parentShell, Topic topic) {
		super(parentShell);
		parentShell.setText("Reply");
		this.topic = topic;
		Activator.getDefault().initImages();
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		
		Composite topic = new Composite(composite, SWT.NONE);
		GridData gd = new GridData();
		gd.heightHint = 200;
		gd.widthHint = 500;
		topic.setLayout(new GridLayout());
		topic.setLayoutData(gd);
		
		tx_Topic = new StyledText(topic, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		tx_Topic.setLayoutData(new GridData(GridData.FILL_BOTH));
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				refreshTopicBody();
			}
		});	
		
		Composite tools = new Composite(composite, SWT.NONE);
		gd = new GridData();
//		gd.heightHint = 80;
//		gd.widthHint = 500;
		tools.setLayout(new GridLayout());
		tools.setLayoutData(gd);
		Button bt_Face = new Button(tools, SWT.TOGGLE);
		bt_Face.setText("F");
		bt_Face.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				FaceSelectionDialog dialog = new FaceSelectionDialog(getShell());
				dialog.open();
			}
		});
		
		Composite reply = new Composite(composite, SWT.NONE);
		gd = new GridData();
		gd.heightHint = 80;
		gd.widthHint = 500;
		reply.setLayout(new GridLayout());
		reply.setLayoutData(gd);

		tx_Reply = new StyledText(reply, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		tx_Reply.setLayoutData(new GridData(GridData.FILL_BOTH));
		tx_Reply.setText("哦.");
		
		return composite;
	}
	
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText("回复");
    }
    
	private void refreshTopicBody() {
		if(true) {
			tx_Topic.setText(topic.getDescription());
		}
	    HtmlCleaner cleaner = new HtmlCleaner(); 
	    URL url;
		try {
			url = new URL(topic.getLink());
			TagNode node = cleaner.clean(url.openStream(), "utf-8");
			TagNode[] test = node.getElementsByAttValue("csdnid", "topicBody", true, false);
			
			if(test.length > 0) {
				// System.out.println("帖子内如：" + test[0].getText());
				//tx_Topic.setText(test[0].getText().toString());
				//tx_Topic.setText(test[0].getOriginalSource());
			}
//			TagNode[] reply = node.getElementsByAttValue("csdnid", "replyBody", true, false);
//			for(int i = 0; i < reply.length; i++) {
//				System.out.println("回复" + i + ": " + reply[i].getText());
//			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			final User user = ModelManager.getInstance().defaultUser;
			final Forum forum = ModelManager.getInstance().defaultForum;
			final String text = tx_Reply.getText();
			Thread reply = new Thread(new Runnable() {

				@Override
				public void run() {
					String body = UBBUtil.bold(text) + "\n\n\n\n";
					body = body + UBBUtil.bold(UBBUtil.color("以下盗用小驴的图做签名，特表示感谢!", UBBUtil.RED));
					body = body + UBBUtil.image("http://forum.csdn.net/PointForum/ui/scripts/csdn/Plugin/001/face/13.gif") + "\n";
					body = body + UBBUtil.bold(UBBUtil.color("---------------------------\n", UBBUtil.RED));
					body = body + UBBUtil.image("http://p.blog.csdn.net/images/p_blog_csdn_net/dollyn/EntryImages/20081230/but_home_mid_1_2_081223_01.jpg");
					Util.reply(user.getId(), user.getPassword(), body, topic.getLink(), forum.getForumId());
				}
				
			});
			reply.start();
			
		}
		super.buttonPressed(buttonId);
	}

}
