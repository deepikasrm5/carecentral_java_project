package in.deepikasriram.carecentral.dao;

import in.deepikasriram.carecentral.model.User;

public class UserDAO {
	
	public void create(User newUser) {
		UserList.listOfUsers[0] = newUser;
		
	}
	
	public User[] findAll() {
		User[] userList = UserList.listOfUsers; // collecting data from UserList class.
		return userList;
	}
	
	
	
}
