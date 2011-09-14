package org.dollyn.csdnclient.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseProcessor {

	private static final Logger logger = Logger.getLogger(DatabaseProcessor.class.getName());
	
	private static DatabaseProcessor instance = null;
	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String URL = "jdbc:derby:csdnclient;";
	
    private Connection conn = null;
	
	private DatabaseProcessor(){
		initialize();
	}

	public static DatabaseProcessor getInstance() {
		if(instance == null) {
			instance = new DatabaseProcessor();
		}
		return instance;
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void excute(String sql) {
		try {
			Statement s = conn.createStatement();
			s.execute(sql);
			logger.info("SQL excuted: " + sql);
		} catch (SQLException e) {
			logger.log(Level.WARNING, "SQL faild: " + sql, e);
			//e.printStackTrace();
		}
	}
	
	public void excuteUpdate(String sql) {
		try {
			Statement s = conn.createStatement();
			s.executeUpdate(sql);
			logger.info("SQL update excuted: " + sql);
		} catch (SQLException e) {
			logger.log(Level.WARNING, "SQL update faild: " + sql, e);
			//e.printStackTrace();
		}
	}
	
	public ResultSet excuteQuery(String sql) {
		try {
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private void initialize() {
        try {
			Class.forName(DRIVER);
			System.out.println(System.getProperty("user.dir"));
			conn = DriverManager.getConnection(URL);			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String args[]) {
		DatabaseProcessor processor = DatabaseProcessor.getInstance();		
	}
}
