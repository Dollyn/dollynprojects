package org.dollyn.csdnclient;

import java.util.ArrayList;
import java.util.List;

import org.dollyn.csdnclient.model.AbstractModel;
import org.dollyn.csdnclient.model.User;

/**
 * The model manager.
 * @author Dollyn
 */
public class ModelManager extends AbstractModel{

	public static final String PRO_USER = "pro_user";
	
	private static ModelManager instance = null;
	private List<User> users = new ArrayList<User>();
	
	private ModelManager() {};
	
	public static ModelManager getInstance() {
		if(instance == null) {
			instance = new ModelManager();
		}
		return instance;
	}
	
	public List<User> getUers() {
		return users;
	}
	
	public void addUser(User user) {
		this.users.add(user);
		firePropertyChange(PRO_USER, null, user);
	}
	
	public void removeUser(User user) {
		this.users.remove(user);
		firePropertyChange(PRO_USER, user, null);
	}
	
	protected void start() {
	}
	
	protected void stop() {
	}
}
