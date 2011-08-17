package org.dollyn.csdnclient.model;

import java.util.ArrayList;
import java.util.List;

import net.csdn.www.Forum;

public class ForumModel {

	public static final String NOPARENT = "00000000-0000-0000-0000-000000000000";
	
	private Forum forum;
	private ForumModel parent;
	private List<ForumModel> children = new ArrayList<ForumModel>();
	
	public Forum getForum() {
		return forum;
	}
	
	public ForumModel getParent() {
		return parent;
	}

	public void setParent(ForumModel parent) {
		this.parent = parent;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}
	
	public void addForm(ForumModel fm) {
		this.children.add(fm);
	}
	
	public ForumModel[] getChildren() {
		return children.toArray(new ForumModel[children.size()]);
	}

	@Override
	public String toString() {
		if(this.forum == null) return "";
		
		return this.forum.getName();
	}
	
	
}
