package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection conn = DriverManager.getConnection("jdbc:derby:C:\\Documents and Settings\\sundl\\MyDB;");
		Statement stat = conn.createStatement();
		stat.execute("CREATE TABLE Greetings (Message CHAR(20))");
		//ScriptRunner runner = new ScriptRunner(conn, true, false);
		//runner.runScript(reader);
		conn.close();
	}
	
}
