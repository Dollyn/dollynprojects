package org.dollyn.csdnclient.model;

/**
 * The User.
 * @author Dollyn
 */
public class User extends AbstractModel{
	
	
	public static int DEFAULT = 1;
	public static final String PRO_DEFAULT = "pro_default";
	
	private String id;
	private String password;
	private boolean isDefault = false;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isDefault() {
		return isDefault;
	}
	
	public void setDefault(boolean isDefault) {
		boolean old = this.isDefault;
		this.isDefault = isDefault;
		firePropertyChange(PRO_DEFAULT, old, isDefault);
	}
	
	public String toString() {
		return this.id;
	}
	
}
