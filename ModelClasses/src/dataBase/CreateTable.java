package dataBase;

import java.sql.*;

import edu.ycp.cs320.awesomepage.shared.User;


public class CreateTable {

	public static void main( String args[] ) throws SQLException{
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:users.db");
	      System.out.println("Opened database successfully");
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    
	    PreparedStatement stmt1 = null;
	    
	    try {
			stmt1 = c.prepareStatement(
					"create table users (" +
					"    id integer primary key," +
					"    user_id integer," +
					"    name_name varchar(25)," +
					")");
			stmt1.executeUpdate();
			stmt1.close();
		} finally {
		   //c.commit();
		   c.close();
		}
	    
	    System.out.println("Table created successfully");
	  }
	
}
