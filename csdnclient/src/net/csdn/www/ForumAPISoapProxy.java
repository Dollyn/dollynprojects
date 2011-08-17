package net.csdn.www;

public class ForumAPISoapProxy implements net.csdn.www.ForumAPISoap {
  private String _endpoint = null;
  private net.csdn.www.ForumAPISoap forumAPISoap = null;
  
  public ForumAPISoapProxy() {
    _initForumAPISoapProxy();
  }
  
  public ForumAPISoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initForumAPISoapProxy();
  }
  
  private void _initForumAPISoapProxy() {
    try {
      forumAPISoap = (new net.csdn.www.ForumAPILocator()).getForumAPISoap();
      if (forumAPISoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)forumAPISoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)forumAPISoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (forumAPISoap != null)
      ((javax.xml.rpc.Stub)forumAPISoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.csdn.www.ForumAPISoap getForumAPISoap() {
    if (forumAPISoap == null)
      _initForumAPISoapProxy();
    return forumAPISoap;
  }
  
  public void post(net.csdn.www.Identity identity, net.csdn.www.Post post, javax.xml.rpc.holders.BooleanHolder postResult, net.csdn.www.holders.ErrorHolder error, javax.xml.rpc.holders.StringHolder topicUrl) throws java.rmi.RemoteException{
    if (forumAPISoap == null)
      _initForumAPISoapProxy();
    forumAPISoap.post(identity, post, postResult, error, topicUrl);
  }
  
  public void reply(net.csdn.www.Identity identity, net.csdn.www.Reply reply, javax.xml.rpc.holders.BooleanHolder replyResult, net.csdn.www.holders.ErrorHolder error, javax.xml.rpc.holders.LongHolder replyId, javax.xml.rpc.holders.IntHolder layer) throws java.rmi.RemoteException{
    if (forumAPISoap == null)
      _initForumAPISoapProxy();
    forumAPISoap.reply(identity, reply, replyResult, error, replyId, layer);
  }
  
  public net.csdn.www.Forum[] getForums() throws java.rmi.RemoteException{
    if (forumAPISoap == null)
      _initForumAPISoapProxy();
    return forumAPISoap.getForums();
  }
  
  public void checkOutTopic(net.csdn.www.Identity identity, java.lang.String topicUrl, java.lang.String forumId, net.csdn.www.ReplyPoint[] replyPoints, javax.xml.rpc.holders.BooleanHolder checkOutTopicResult, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException{
    if (forumAPISoap == null)
      _initForumAPISoapProxy();
    forumAPISoap.checkOutTopic(identity, topicUrl, forumId, replyPoints, checkOutTopicResult, error);
  }
  
  public void getTopicsOfUser(net.csdn.www.Identity identity, net.csdn.www.UserTopicListType listType, java.lang.String forumId, javax.xml.rpc.holders.BooleanHolder getTopicsOfUserResult, net.csdn.www.holders.ArrayOfPostHolder posts, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException{
    if (forumAPISoap == null)
      _initForumAPISoapProxy();
    forumAPISoap.getTopicsOfUser(identity, listType, forumId, getTopicsOfUserResult, posts, error);
  }
  
  public void pointDonate(net.csdn.www.Identity identity, java.lang.String toUser, int point, java.lang.String reason, javax.xml.rpc.holders.BooleanHolder pointDonateResult, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException{
    if (forumAPISoap == null)
      _initForumAPISoapProxy();
    forumAPISoap.pointDonate(identity, toUser, point, reason, pointDonateResult, error);
  }
  
  public void getUserProfile(net.csdn.www.Identity identity, java.lang.String username, javax.xml.rpc.holders.BooleanHolder getUserProfileResult, net.csdn.www.holders.UserProfileHolder profile, net.csdn.www.holders.ErrorHolder error) throws java.rmi.RemoteException{
    if (forumAPISoap == null)
      _initForumAPISoapProxy();
    forumAPISoap.getUserProfile(identity, username, getUserProfileResult, profile, error);
  }
  
  
}