package in.deepikasriram.carecentral.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.HashSet;

import in.deepikasriram.carecentral.interfaceFiles.UserInterface;
import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.util.ConnectionUtil;

public class UserDAO implements UserInterface{



	@Override
	public Set<User> findAll() throws RuntimeException{
//		Set<User> userList = UserList.listOfUsers; // collecting data from UserList class.
//		return userList;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Set<User> users = new HashSet<User>();
		try {
			String query = "SELECT * FROM Users WHERE is_active = 1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setEmailId(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("is_active"));
				
				
				users.add(user);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}
		finally {
			ConnectionUtil.close(con, ps, rs);
		}
		return users;
		
	}

	@Override
	public void create(User  newUser) throws RuntimeException {
//		Set<User> userList = UserList.listOfUsers;
//		userList.add(newUser);
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			String query = "INSERT INTO Users (first_name , last_name , email , password) VALUES (?,?,?,?)";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			
			ps.setString(1, newUser.getFirstName());
			ps.setString(2, newUser.getLastName());
			ps.setString(3, newUser.getEmailId());
			ps.setString(4, newUser.getPassword());
			
			ps.executeUpdate();
			
			System.out.println("User has been created successfully");
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
			
		}finally {
			ConnectionUtil.close(con, ps);
		}
		
		
	}

	@Override
	public void update(int id , User  updatedUser) {
		Set<User> userList = UserList.listOfUsers;
		for(User user:userList) {
			if(user.getUserId() == id) {
				user.setFirstName(updatedUser.getFirstName());
				user.setLastName(updatedUser.getLastName());
				user.setEmailId(updatedUser.getEmailId());
				user.setPassword(updatedUser.getPassword());
				user.setActive(true);
				break;
			}
		}
	}

	@Override
	public void delete(int id) {
		Set<User> userList = UserList.listOfUsers;
		for(User user:userList) {
			if(user != null && user.getUserId() == id) {
				user.setActive(false);
			}
		}
	}

	@Override
	public User findById(int id) {
//		Set<User> userList = UserList.listOfUsers;
//		for(User user:userList) {
//			if(user!= null && user.getUserId() == id) {
//				return user;
//			}
//		}
//		return null;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;

		
		try {
			String query = "SELECT * FROM Users WHERE is_active = 1 AND id = ?";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				
				user = new User();
				user.setUserId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setEmailId(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("is_active"));
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}finally {
			ConnectionUtil.close(con, ps, rs);
		}
		
		return user;
		
	}

	@Override
	public User findByEmail(String email) {
		Set<User> userList = UserList.listOfUsers;
		for(User user:userList) {
			if(user!= null && user.getEmailId() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public int count() {
		Set<User> userList = UserList.listOfUsers;
		int countOfUsers = 0;
		for(User user:userList) {
			if(user!= null) {
				countOfUsers+=1;
			}
		}
		
		return countOfUsers;
	}
}
