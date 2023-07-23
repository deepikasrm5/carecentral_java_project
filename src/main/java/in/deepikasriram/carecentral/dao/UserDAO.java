package in.deepikasriram.carecentral.dao;

import java.util.Set;

import in.deepikasriram.carecentral.interfaceFiles.UserInterface;
import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.model.UserEntity;

public class UserDAO implements UserInterface{



	@Override
	public Set<User> findAll() {
		Set<User> userList = UserList.listOfUsers; // collecting data from UserList class.
		return userList;
	}

	@Override
	public void create(User  newUser) {
		Set<User> userList = UserList.listOfUsers;
		userList.add(newUser);
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
		Set<User> userList = UserList.listOfUsers;
		for(User user:userList) {
			if(user!= null && user.getUserId() == id) {
				return user;
			}
		}
		return null;
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
