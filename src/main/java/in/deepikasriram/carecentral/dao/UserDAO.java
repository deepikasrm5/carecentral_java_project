package in.deepikasriram.carecentral.dao;

import in.deepikasriram.carecentral.model.User;

public class UserDAO {

	public User[] findAll() {
		User[] userList = UserList.listOfUsers; // collecting data from UserList class.
		return userList;
	}

	public void create(User newUser) {
//		UserList.listOfUsers[0] = newUser;
		User[] userList = UserList.listOfUsers;
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user == null) {
				userList[i] = newUser;
				break;
			}
		}

	}

	public void update(int id, User updatedUser) {
		User[] userList = UserList.listOfUsers;
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user == null) {
				continue;
			}
			if (user.getUserId() == id) {
				user.setFirstName( updatedUser.getFirstName() );
				user.setLastName(updatedUser.getLastName());
				user.setEmailId(updatedUser.getEmailId());
				user.setPassword(updatedUser.getPassword());
				user.setActive(true);
				break;
				
			}
		}

	}
	
	public void delete(int id) {
		User[] userList = UserList.listOfUsers;
		for(int i=0; i<userList.length;i++) {
			User user = userList[i];
			if(user == null) {
				continue;
			}
			if(user.getUserId() == id) {
				user.setActive(false);
				break;
			}
		}
	}
	
//	public User findById(int id) {
//		User[] userList = UserList.listOfUsers;
//		 
//	}
}
