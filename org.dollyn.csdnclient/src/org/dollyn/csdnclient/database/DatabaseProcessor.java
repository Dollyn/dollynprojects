package org.dollyn.csdnclient.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProcessor {

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
	
	private void initialize() {
        try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL);
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from users");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
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
