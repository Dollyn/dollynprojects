package org.dollyn.csdnclient;

import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import net.csdn.www.Forum;
import net.csdn.www.ForumAPISoapProxy;

import org.dollyn.csdnclient.database.DatabaseProcessor;
import org.dollyn.csdnclient.model.AbstractModel;
import org.dollyn.csdnclient.model.ForumModel;
import org.dollyn.csdnclient.model.User;

/**
 * The model manager.
 * @author Dollyn
 */
public class ModelManager extends AbstractModel{

	private static final Logger logger = Logger.getLogger(ModelManager.class.getName());
	
	public static final String PRO_USER = "pro_user";
	
	private static ModelManager instance = null;
	private List<User> users = new ArrayList<User>();
	
	//The current user instance.
	public User defaultUser;
	private ForumModel rootForum;
	public Forum defaultForum;
	
	private ModelManager() {};
	
	public static ModelManager getInstance() {
		if(instance == null) {
			instance = new ModelManager();
		}
		return instance;
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public void addUser(User user) {
		this.users.add(user);
		DatabaseProcessor dp = DatabaseProcessor.getInstance();
		dp.excute("insert into users values('" + user.getId() + "', '" + user.getPassword() + "', " + '0' + ")");
		
		firePropertyChange(PRO_USER, null, user);
	}
	
	public void removeUser(User user) {
		this.users.remove(user);		
		DatabaseProcessor dp = DatabaseProcessor.getInstance();
		dp.excute("delete from users where id like '" + user.getId() + "'");

		firePropertyChange(PRO_USER, user, null);
	}
	
	public User getUser(String id) {
		for(User u : users) {
			if(u.getId().equals(id)) {
				return u;
			}
		}
		return null;
	}
	
	public ForumModel getRootForum() {
		//if(this.rootForum == null) {
		//	refreshForums();
		//}
		return this.rootForum;
	}
	
	public void refreshForums() {		
		try {
			ForumAPISoapProxy proxy = new ForumAPISoapProxy();
			Forum[] forums = proxy.getForums();
			this.rootForum = convert(forums);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Convert the giver forums array to a ForumModel.
	 * @param forums the array
	 * @return the ForumModel
	 */
	private ForumModel convert(Forum[] forums) {
		if(forums == null) return new ForumModel();
		
		ForumModel root = new ForumModel();
		//for every forum
		for(Forum f : forums) {
			//construct a new fm
			ForumModel child = new ForumModel();
			child.setForum(f);
			//check if it is a sub forum
			for(ForumModel fm : root.getChildren()) {
				if(fm.getForum().getForumId().equals(f.getParentForumId())) {
					child.setParent(fm);
					fm.addForm(child);
					break;
				}
			}
			//if or not a sub forum
			if(child.getParent() != null) continue;
			
			root.addForm(child);
			child.setParent(root);
		}
		return root;
	}
	
	protected void start() {
		
//	     AxisProperties.setProperty("http.proxyHost","192.168.60.7");
//	     AxisProperties.setProperty("http.proxyPort:","80");
//	     AxisProperties.setProperty("http.proxyUser","sundl" );
//	     AxisProperties.setProperty("http.proxyPassword","sundaol_19");
		
		initForums();
		
		DatabaseProcessor dp = DatabaseProcessor.getInstance();
		ResultSet rs = dp.excuteQuery("select * from users");
		if(rs == null) return;
		try {
			while(rs.next()) {
				String userName = rs.getString("id");
				String passwd = rs.getString("password");
				int isDefault = rs.getInt("isDefault");
				
				User user = new User();
				user.setId(userName);
				user.setPassword(passwd);
				if(isDefault == User.DEFAULT) {
					user.setDefault(true);
					this.defaultUser = user;
				}
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	// init the forums list and tree.
	private void initForums() {
		boolean savedToDatabase = checkIsForumsSaved();
		if (!savedToDatabase) {		
			try {
				// read online and write to native database
				ForumAPISoapProxy proxy = new ForumAPISoapProxy();
				Forum[] forums = proxy.getForums();
				addToDatabase(forums);
				setSaved(true);
				rootForum = convert(forums);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		} else {
			Forum[] forums = readForumsFromDatabase();
			rootForum = convert(forums);
		}
	}
	
	// add the forums to database
	private void addToDatabase(Forum[] forums) {
		DatabaseProcessor dp = DatabaseProcessor.getInstance();
		for (Forum forum : forums) {
			int tech = forum.isIsTech() ? 1 : 0;
			String sql = "insert into forums values('" + forum.getForumId()+ "', '"
			+ forum.getParentForumId() + "', '"
			+ forum.getName() + "', '"
			+ forum.getAlias()+ "', "
			+ tech + ", '"
			+ forum.getPointBelongsToForumId() + "'"
			+ ")";
			
			dp.excute(sql);
		}
	}
	
	// clear the forums list in the database
	private void clearForumsInDatabase() {
		DatabaseProcessor dp = DatabaseProcessor.getInstance();
		dp.excute("delete from forums");
	}
	
	// read forum list from the database
	private Forum[] readForumsFromDatabase() {
		List<Forum> forums = new ArrayList<Forum>();
		DatabaseProcessor dp = DatabaseProcessor.getInstance();
		ResultSet rs = dp.excuteQuery("select * from forums");
		try {
			while(rs.next()) {
				String fid = rs.getString(1);
				String pid = rs.getString(2);
				String name = rs.getString(3);
				String alias = rs.getString(4);
				boolean tech = rs.getBoolean(5);
				String points = rs.getString(6);
				Forum forum = new Forum(fid, pid, name, alias, tech, new String[0], points);
				forums.add(forum);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return forums.toArray(new Forum[forums.size()]);
	}
	
	// check whether the forums list has been saved to the database
	private boolean checkIsForumsSaved() {
		DatabaseProcessor dp = DatabaseProcessor.getInstance();
		ResultSet rs = dp.excuteQuery("select * from config where ATTRIBUTE like 'forums.savedToDB'");
		try {
			if (rs == null || !rs.next()) {
				logger.info("maybe the table 'config' does not exists or no data in it.");
				return false;
			}
			boolean saved = rs.getBoolean("ATTVALUE");
			return saved;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}
	
	private void setSaved(boolean saved) {
		DatabaseProcessor dp = DatabaseProcessor.getInstance();
		dp.excuteUpdate("update config set ATTVALUE = 'true' where ATTRIBUTE = 'forums.savedToDB'");
	}
	
	protected void stop() {
	}
}
