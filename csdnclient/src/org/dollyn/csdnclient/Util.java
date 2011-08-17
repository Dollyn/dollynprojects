package org.dollyn.csdnclient;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.BooleanHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;

import net.csdn.www.EditorType;
import net.csdn.www.ForumAPISoapProxy;
import net.csdn.www.Identity;
import net.csdn.www.Post;
import net.csdn.www.Reply;
import net.csdn.www.holders.ErrorHolder;

public class Util {

	public static final String FREE_ZONE = "a3049f56-b572-48f5-89be-4797b70d71cd";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//reply("dollyn", "19840926", "http://topic.csdn.net/u/20080625/16/40bf875a-aecf-43a9-a095-fd58cfb9b9b2.html", "a3049f56-b572-48f5-89be-4797b70d71cd");
		for(int i = 0; i < 3; i++) {
			reply("dollyn", "19840926", "http://topic.csdn.net/u/20080625/14/dae0fc37-3282-40cc-8543-1f4aa0ec6386.html", "a3049f56-b572-48f5-89be-4797b70d71cd");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void reply(String username, String password, String topicUrl, String forumId) {
		reply(username, password, "测试\n换行", topicUrl, forumId);
	}
	
	public static void reply(String username, String password, String body, String topicUrl,String forumId) {
		ForumAPISoapProxy proxy = new ForumAPISoapProxy();
	    Identity id = new Identity(username, password);
	    Reply reply = new Reply();
	    reply.setBody(body);
	    reply.setForumId(forumId);
	    reply.setTopicUrl(topicUrl);
	    reply.setEditor(EditorType.UBB);
	    BooleanHolder result = new BooleanHolder();
	    ErrorHolder error = new ErrorHolder();
	    LongHolder replyId = new LongHolder();
	    IntHolder layer = new IntHolder();
	    try {
			proxy.reply(id, reply, result, error, replyId, layer);
			System.out.println("reply : " + result.value);
			System.out.println(error.value.getErrInfo() + error.value.getErrId());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	  public static void post(String username, String password, String message, String forumId){
		   post(username, password, message, message, forumId);
	  }
	  
	  public static void post(String username, String password, String subject, String body, String forumId) {
		  	post(username, password, subject, body, 0, forumId);
	  }
	  
	  public static void post(String username, String password, String subject, String body, int point, String forumId) {
		  try{
		      ForumAPISoapProxy proxy = new ForumAPISoapProxy();
		      Identity id = new Identity(username, password);
		      Post post = new Post();
		      post.setBody(body);
		      post.setSubject(subject);
		      post.setEditor(EditorType.UBB);
		      post.setForumId(forumId);
		      post.setPoint(0);
		      post.setIsAskExpert(false);
		      post.setTag("");
		      post.setPoint(point);
		      ErrorHolder eHolder = new ErrorHolder();
		      BooleanHolder bHolder = new BooleanHolder();
		      StringHolder sHolder = new StringHolder();
		      proxy.post(id, post, bHolder, eHolder, sHolder);
		      System.out.println(sHolder.value);
		      
		      //proxy.checkOutTopic(id,sHolder.value,forumId,new net.csdn.www.ReplyPoint[0],bHolder,eHolder);
		      System.out.println(bHolder.value);
		    } catch (Exception ex) {
		      ex.printStackTrace();
		    }
	  }
	  
	  public static void prc(String username, String password, String subject, String body, String rBody, String forumId){
		    prc(username, password, subject, body, 0, rBody, forumId);
	  }
	  
	  public static void prc(String username, String password, String subject, String body, int point, String rBody, String forumId){
		  if(body == null || rBody == null) {
			  return;
		  }
		    try{
		      ForumAPISoapProxy proxy = new ForumAPISoapProxy();
		      Identity id = new Identity(username, password);
		      Post post = new Post();
		      post.setBody(body);
		      post.setSubject(subject);
		      post.setEditor(EditorType.UBB);
		      post.setForumId(forumId);
		      post.setPoint(0);
		      post.setIsAskExpert(false);
		      post.setTag("");
		      post.setPoint(point);
		      ErrorHolder eHolder = new ErrorHolder();
		      BooleanHolder bHolder = new BooleanHolder();
		      StringHolder sHolder = new StringHolder();
		      proxy.post(id, post, bHolder, eHolder, sHolder);
		      System.out.println("ID: " + eHolder.value.getErrId());
		      System.out.println("Info: " + eHolder.value.getErrInfo());
				      
		      reply(username, password, rBody, sHolder.value, forumId);		      
		    } catch (Exception ex) {
		      ex.printStackTrace();
		    }
	  }
}
