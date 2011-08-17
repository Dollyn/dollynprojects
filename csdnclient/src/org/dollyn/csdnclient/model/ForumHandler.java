package org.dollyn.csdnclient.model;

public class ForumHandler {

	static final String DEFAUT_MESSAGE = "我来赚分的";
	private User user;
	private String message;
	private String forumId;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getForumId() {
		return forumId;
	}
	public void setForumId(String forumId) {
		this.forumId = forumId;
	}
	
	
}
