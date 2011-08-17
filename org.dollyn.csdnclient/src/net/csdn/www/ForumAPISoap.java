/**
 * ForumAPISoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.csdn.www;

public interface ForumAPISoap extends java.rmi.Remote {
    public void post(net.csdn.www.Identity identity, net.csdn.www.Post post, javax.xml.rpc.holders.BooleanHolder postResult, net.csdn.www.holders.ErrorHolder error, javax.xml.rpc.holders.StringHolder topicUrl) throws java.rmi.RemoteException;
    public void reply(net.csdn.www.Identity identity, net.csdn.www.Reply reply, javax.xml.rpc.holders.BooleanHolder replyResult, net.csdn.www.holders.ErrorHolder error, javax.xml.rpc.holders.LongHolder replyId, javax.xml.rpc.holders.IntHolder layer) throws java.rmi.RemoteException;
    public net.csdn.www.Forum[] getForums() throws java.rmi.RemoteException;
    public void checkOutTopic(net.csdn.www.Identity identity, java.lang.String topicUrl, java.lang.String forumId, net.csdn.www.ReplyPoint[] replyPoints, javax.xml.rpc.holders.BooleanHolder checkOutTopicResult, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException;
    public void getTopicsOfUser(net.csdn.www.Identity identity, net.csdn.www.UserTopicListType listType, java.lang.String forumId, javax.xml.rpc.holders.BooleanHolder getTopicsOfUserResult, net.csdn.www.holders.ArrayOfPostHolder posts, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException;
    public void pointDonate(net.csdn.www.Identity identity, java.lang.String toUser, int point, java.lang.String reason, javax.xml.rpc.holders.BooleanHolder pointDonateResult, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException;
    public void getUserProfile(net.csdn.www.Identity identity, java.lang.String username, javax.xml.rpc.holders.BooleanHolder getUserProfileResult, net.csdn.www.holders.UserProfileHolder profile, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException;
}
