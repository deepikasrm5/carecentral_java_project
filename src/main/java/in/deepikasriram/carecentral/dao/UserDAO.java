package in.deepikasriram.carecentral.dao;

import in.deepikasriram.carecentral.model.User;

public class UserDAO {
	
	public User[] findAll() {
		User[] userList = UserList.listOfUsers; // collecting data from UserList class.
		return userList;
	}
	
	
	public void create() {
		User newUser = new User();
		newUser.setUserId(12);
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId("deepika@gmail.com");
		newUser.setPassword("asdf***1234");
		newUser.setActive(true);
		
		UserList.listOfUsers[0] = newUser;
	}
}
