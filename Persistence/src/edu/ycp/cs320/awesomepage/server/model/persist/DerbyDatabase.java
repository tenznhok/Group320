package edu.ycp.cs320.awesomepage.server.model.persist;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.ycp.cs320.awesomepage.shared.FriendsList;
import edu.ycp.cs320.awesomepage.shared.Status;
import edu.ycp.cs320.awesomepage.shared.User;
import edu.ycp.cs320.awesomepage.shared.friendName;
import edu.ycp.cs320.awesomepage.shared.userInfo;

public class DerbyDatabase implements IDatabase {
	static {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (Exception e) {
			throw new IllegalStateException("Could not load Derby JDBC driver");
		}
	}

	private interface Transaction<ResultType> {
		public ResultType execute(Connection conn) throws SQLException;
	}

	private static final int MAX_ATTEMPTS = 10;

	@Override
	public User login(final String username, final String password) {
		return executeTransaction(new Transaction<User>() {
			@Override
			public User execute(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				ResultSet resultSet = null;
				
				try {
					stmt = conn.prepareStatement("select users.* from users where username = ? and password = ?");
					stmt.setString(1, username);
					stmt.setString(2, password);
					
					resultSet = stmt.executeQuery();
					
					if (!resultSet.next()) {
						return null; // no such username/password
					}
					
					// Found a matching User
					User user = new User();
					user.setUserID(resultSet.getInt(1));
					user.setUserName(resultSet.getString(2));
					user.setPassword(resultSet.getString(3));
					user.setEmail(resultSet.getString(4));
					
					return user;
				} finally {
					DBUtil.closeQuietly(resultSet);
					DBUtil.closeQuietly(stmt);
				}
			}
		});
	}

	@Override
	public User signUp(String username, String password, String firstName,
			String lastName, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String status(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status postStatus(int id, String newStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public userInfo getUserInfo(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public userInfo editInfo(int id, String firstName, String lastName,
			String eMail, String mf, String phone, String country, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	public<ResultType> ResultType executeTransaction(Transaction<ResultType> txn) {
		try {
			return doExecuteTransaction(txn);
		} catch (SQLException e) {
			throw new PersistenceException("Transaction failed", e);
		}
	}
	
	public<ResultType> ResultType doExecuteTransaction(Transaction<ResultType> txn) throws SQLException {
		Connection conn = connect();
		
		try {
			int numAttempts = 0;
			boolean success = false;
			ResultType result = null;
			
			while (!success && numAttempts < MAX_ATTEMPTS) {
				try {
					result = txn.execute(conn);
					conn.commit();
					success = true;
				} catch (SQLException e) {
					if (e.getSQLState() != null && e.getSQLState().equals("41000")) {
						// Deadlock: retry (unless max retry count has been reached)
						numAttempts++;
					} else {
						// Some other kind of SQLException
						throw e;
					}
				}
			}
			
			if (!success) {
				throw new SQLException("Transaction failed (too many retries)");
			}
			
			// Success!
			return result;
		} finally {
			DBUtil.closeQuietly(conn);
		}
	}

	private Connection connect() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:derby:awesomepage.db;create=true");
		
		// Set autocommit to false to allow multiple the execution of
		// multiple queries/statements as part of the same transaction.
		conn.setAutoCommit(false);
		
		return conn;
	}

	public void createTables() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				PreparedStatement stmt1 = null, stmt2 = null,  stmt3 = null;
				try {
					stmt1 = conn.prepareStatement(
							"create table users (" +
							" userid integer primary key not null generated always as identity, " +
							" username varchar(50) not null unique, " +
							" password varchar(50) not null, " +
							" email varchar(100) not null" +
							")"
					);
					stmt1.executeUpdate();
		
					stmt2 = conn.prepareStatement(
							"create table userInfo (" +
							"userid integer primary key not null, " +
							"firstname varchar(50) not null, " +
							"lastname varchar(50) not null," +
							"emailcontact varchar(50) not null," +
							"maleorfemale varchar(50) not null," +
							"phonenum varchar(50) not null," +
							"country varchar(50) not null," +
							"city varchar(50) not null" +
							")"
					);
					stmt2.executeUpdate();
					
					stmt3 = conn.prepareStatement(
							"create table status (" +
							"id integer primary key not null generated always as identity, " +
									"message varchar(5000) not null" +

							")"
					);
					stmt3.executeUpdate();

					
				} finally {
					DBUtil.closeQuietly(stmt1);
					DBUtil.closeQuietly(stmt2);
				}
				return true;
			}
		});
	}
	
	public void loadInitialData() {
		executeTransaction(new Transaction<Boolean>() {
			@Override
			public Boolean execute(Connection conn) throws SQLException {
				PreparedStatement stmt = null;
				
				try {
					stmt = conn.prepareStatement("insert into users (username, password, email) values ('testuser', 'abc123', 'user@ycp.edu')");
				} finally {
					DBUtil.closeQuietly(stmt);
				}
				
				return true;
			}
		});
	}
	
	// The main method creates the database tables and loads the initial data.
	public static void main(String[] args) throws IOException {
		System.out.println("Creating tables...");
		DerbyDatabase db = new DerbyDatabase();
		db.createTables();
		
		System.out.println("Loading initial data...");
		db.loadInitialData();
		
		System.out.println("Success!");
	}

	@Override
	public ArrayList<friendName> getAllFriends() {
		throw new UnsupportedOperationException("TODO - implement");
	}

	@Override
	public friendName addFriend(int userID, String friendName) {
		throw new UnsupportedOperationException("TODO - implement");
	}

	@Override
	public FriendsList friendsList(int userID) {
		// TODO Auto-generated method stub
		return null;
	}
//no more friends
	public friendName removeFriend(int userID, String name, int friendID) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public FriendsList getAllFriends(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

/*

	public FriendsList addFriends(FriendsList e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FriendsList getAllFriends(int userID) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
