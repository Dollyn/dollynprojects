package org.dollyn.csdnclient.test;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.BooleanHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.handlers.LogHandler;

import net.csdn.www.EditorType;
import net.csdn.www.ForumAPISoapProxy;
import net.csdn.www.Identity;
import net.csdn.www.Post;
import net.csdn.www.Reply;
import net.csdn.www.UserProfile;
import net.csdn.www.holders.ErrorHolder;
import net.csdn.www.holders.UserProfileHolder;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//post("majia10ofdollyn", "19840926", "OpenAPI测试--Java版--ISA防火墙后测试", "a3049f56-b572-48f5-89be-4797b70d71cd");
		//reply("dollyn", "19840926", "http://topic.csdn.net/u/20080625/16/40bf875a-aecf-43a9-a095-fd58cfb9b9b2.html", "a3049f56-b572-48f5-89be-4797b70d71cd");
//		for(int i = 0; i < 3; i++) {
//			reply("dollyn", "19840926", "http://topic.csdn.net/u/20080627/13/d4d129d2-bece-4a53-a596-692264bca72b.html", "a3049f56-b572-48f5-89be-4797b70d71cd");
//			try {
//				Thread.sleep(2500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		getUserInfo("bluefiend");
	}
	
	public static void getUserInfo(String name) {
		ForumAPISoapProxy proxy = new ForumAPISoapProxy();
		Identity id = new Identity("dollyn", "19840926");
		BooleanHolder result = new BooleanHolder();
		UserProfileHolder profile = new UserProfileHolder();
		ErrorHolder error = new ErrorHolder();
		try {
			proxy.getUserProfile(id, name, result, profile, error);
			UserProfile value = profile.value;
			System.out.println("NonTechExpertPoint:" + value.getNonTechExpertPoint());
			System.out.println("Point:" + value.getPoint());
			System.out.println("TechExpertPoint:" + value.getTechExpertPoint());
			//System.out.println("TechExpertPoint:" + value.get);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public static void reply(String username, String password, String topicUrl, String forumId) {
		ForumAPISoapProxy proxy = new ForumAPISoapProxy();
	    Identity id = new Identity(username, password);
	    Reply reply = new Reply();
	    //reply.setBody("[b][color=#FF0000]3个月就能培养出人才了？[/color][/b]");
	    reply.setBody("[color=#0000FF]我来接分的[/color]");
	    reply.setForumId(forumId);
	    reply.setTopicUrl(topicUrl);
	    reply.setEditor(EditorType.UBB);
	    BooleanHolder result = new BooleanHolder();
	    ErrorHolder error = new ErrorHolder();
	    LongHolder replyId = new LongHolder();
	    IntHolder layer = new IntHolder();
	    try {
			proxy.reply(id, reply, result, error, replyId, layer);
			System.out.println(result.value);
			System.out.println(error.value.getErrInfo() + error.value.getErrId());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	  public static void post(String username, String password, String message, String forumId){
		    try{
		      ForumAPISoapProxy proxy = new ForumAPISoapProxy();
		      Identity id = new Identity(username, password);
		      Post post = new Post();
		      post.setBody(message);
		      post.setSubject(message);
		      post.setEditor(EditorType.UBB);
		      post.setForumId(forumId);
		      post.setPoint(0);
		      post.setIsAskExpert(false);
		      post.setTag("");
		      ErrorHolder eHolder = new ErrorHolder();
		      BooleanHolder bHolder = new BooleanHolder();
		      StringHolder sHolder = new StringHolder();
		      proxy.post(id, post, bHolder, eHolder, sHolder);
		      System.out.println(sHolder.value);
		      
		      // 下面是把这个帖子结了
		      //proxy.checkOutTopic(id,sHolder.value,forumId,new net.csdn.www.ReplyPoint[0],bHolder,eHolder);
		      System.out.println(bHolder.value);
		    } catch (Exception ex) {
		      ex.printStackTrace();
		    }
		  }
}
