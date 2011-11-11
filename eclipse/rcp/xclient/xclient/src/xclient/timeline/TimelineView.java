package xclient.timeline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.ViewPart;

import xclient.timeline.TimeLineResult.Info;

import com.google.gson.Gson;
import com.tencent.weibo.api.Statuses_API;
import com.tencent.weibo.beans.OAuth;
import com.tencent.weibo.utils.OAuthClient;
import com.tencent.weibo.utils.WeiBoConst;

public class TimelineView extends ViewPart {

	public static final String ID = "xclient.stream";
	private static final Logger logger = Logger.getLogger(TimelineView.class);
	
	static String CACHE_FILE = "cache.properties";
	static String ACCESS_TOKEN = "access_token";
	static String ACCESS_TOKEN_SECRET = "access_token_secret";
	
	private FormToolkit toolkit;
	private ScrolledForm form;
	
	private List<Image> images = new ArrayList<Image>();

	@Override
	public void createPartControl(Composite parent) {
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Hello, Weibo!");
		
		File file = new File(CACHE_FILE);
		
		Properties cache = new Properties();
		if (file.exists()) {
			try {
				cache.load(new FileReader(file));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		OAuth oAuth = new OAuth();
		OAuthClient auth=new OAuthClient();

		String access_token = (String) cache.get(ACCESS_TOKEN);
		String access_token_secret = (String) cache.get(ACCESS_TOKEN_SECRET);
		
		oAuth.setOauth_token(access_token);
		oAuth.setOauth_token_secret(access_token_secret);

		Statuses_API sapi = new Statuses_API();
		try {
			String timeline = sapi.home_timeline(oAuth,  WeiBoConst.ResultType.ResultType_Json, WeiBoConst.PageFlag.FIRST_PAGE, "0", "0");
			System.out.println(timeline);
			Gson gson = new Gson();
			TimeLineResult result = gson.fromJson(timeline, TimeLineResult.class);
			System.out.println(result.msg);
			
			TableWrapLayout layout = new TableWrapLayout();
			form.getBody().setLayout(layout);
			
			for (Info info : result.data.info) {
				System.out.println(info.text);
				if (info.source != null) {
					System.out.println("SOURCE:::  " + info.source.text);
				}
				
				createEntryComposite(form.getBody(), info);
				System.out.println("===============================================================================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Composite createEntryComposite(Composite parent, Info info) {
		Composite entryComposite = toolkit.createComposite(parent);
		TableWrapLayout layout = new TableWrapLayout();
		layout.numColumns = 2;
		entryComposite.setLayout(layout);
		
		//Button button = toolkit.createButton(entryComposite, "", SWT.FLAT);
		String headUrl = info.head + "/50";
		try {
			Image image = new Image(parent.getDisplay(), new URL(headUrl).openStream());
			//button.setImage(image);
			images.add(image);
			
			ImageHyperlink link = toolkit.createImageHyperlink(entryComposite, SWT.NONE);
			link.setImage(image);
			
			//button.setLayoutData(new TableWrapData());
			link.setLayoutData(new TableWrapData());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

		
		try {
			FormText text = toolkit.createFormText(entryComposite, true);
			text.setText("<form><p>" + info.text + "</p></form> ", true, false);
			text.setWhitespaceNormalized(true);
			TableWrapData td = new TableWrapData();
			text.setLayoutData(td);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return entryComposite;
	}

	
	 /**
	  * Passing the focus request to the form.
	  */
	 public void setFocus() {
	  form.setFocus();
	 }

	 /**
	  * Disposes the toolkit
	  */
	 public void dispose() {
	  toolkit.dispose();
	  for (Image image : images) {
		  image.dispose();
	  }
	  super.dispose();
	 }

}
