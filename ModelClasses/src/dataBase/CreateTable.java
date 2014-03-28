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
	      
	      stmt = c.createStatement();
	      
	      String sql = 
					"	create table users " +
					"	(id integer primary key NOT NULL," +
					"	user_id integer NOT NULL," +
					"	user_name varchar(25) )";
			stmt.executeUpdate( sql );
			stmt.close();
			c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
	  }
}
