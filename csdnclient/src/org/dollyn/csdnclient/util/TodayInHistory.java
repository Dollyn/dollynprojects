package org.dollyn.csdnclient.util;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.xml.rpc.holders.BooleanHolder;
import javax.xml.rpc.holders.StringHolder;

import net.csdn.www.EditorType;
import net.csdn.www.ForumAPISoapProxy;
import net.csdn.www.Identity;
import net.csdn.www.Post;
import net.csdn.www.holders.ErrorHolder;

import org.dollyn.csdnclient.Constants;
import org.dollyn.csdnclient.database.DatabaseProcessor;
import org.dollyn.csdnclient.model.User;

public class TodayInHistory {

	private static final int DEFAULT_POINTS = 0;
	private static final Logger logger = Logger.getLogger(TodayInHistory.class.getName());
	
	private User user;
	private Date date;
	
	public TodayInHistory(User user) {
		this.user = user;
		date = new Date();
	}
	
	public void postAndReply() {
	    ForumAPISoapProxy proxy = new ForumAPISoapProxy();
		Identity id = new Identity(user.getId(), user.getPassword());
		Post post = new Post();
		String body = UBBUtil.bold("[b]以铜为镜，可以正衣冠；以古为镜，可以知兴替；以人为镜，可以明得失。");
		post.setBody(body);
		SimpleDateFormat format = new SimpleDateFormat("M月d日");
		post.setSubject("【历史上的今天】——" + format.format(date));
		post.setEditor(EditorType.UBB);
		post.setForumId(Constants.FREE_ZONE_ID);
		post.setIsAskExpert(false);
		post.setTag("");
		post.setPoint(DEFAULT_POINTS);
		ErrorHolder eHolder = new ErrorHolder();
		BooleanHolder bHolder = new BooleanHolder();
		StringHolder sHolder = new StringHolder();
		try {
			proxy.post(id, post, bHolder, eHolder, sHolder);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		if (bHolder.value) {
			logger.info("发帖成功!");
			String url = sHolder.value;
			addToDatabase(user.getId(), date, url);
		} else {
			logger.info("发帖失败，原因: " + eHolder.value.getErrId()+ "," + eHolder.value.getErrInfo() + "," + eHolder.value.getDescription());
		}
		
		
	}
	
	private void addToDatabase(String user, Date date, String url){
		String day = new SimpleDateFormat("yyyy-MM-dd").format(date);
		DatabaseProcessor.getInstance().excute("insert into tih values ('" + user + "', '" + day+ "', '" + url + "', 0)");
	}
}
