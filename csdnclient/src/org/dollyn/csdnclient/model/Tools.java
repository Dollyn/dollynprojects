package org.dollyn.csdnclient.model;

import javax.xml.rpc.holders.BooleanHolder;
import javax.xml.rpc.holders.StringHolder;

import net.csdn.www.EditorType;
import net.csdn.www.ForumAPISoapProxy;
import net.csdn.www.Identity;
import net.csdn.www.Post;
import net.csdn.www.holders.ErrorHolder;

public class Tools{
	public static void post(User user, String message, String forumId) {
	    try{
		      ForumAPISoapProxy proxy = new ForumAPISoapProxy();
		      Identity id = new Identity(user.getId(), user.getPassword());
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
		      
		      // �����ǰ�������ӽ���
		      //proxy.checkOutTopic(id,sHolder.value,forumId,new net.csdn.www.ReplyPoint[0],bHolder,eHolder);
		      System.out.println(bHolder.value);
		    } catch (Exception ex) {
		      ex.printStackTrace();
		    }

	}
}
