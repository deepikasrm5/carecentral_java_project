package in.deepikasriram.carecentral.service;

import in.deepikasriram.carecentral.dao.UserDAO;
import in.deepikasriram.carecentral.model.User;

public class UserService {
	
	public void create() {
		User newUser = new User();
		newUser.setUserId(12);
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId("deepika@gmail.com");
		newUser.setPassword("asdf***1234");
		newUser.setActive(true);
		
		UserDAO userObj = new UserDAO();
		userObj.create(newUser);
		
		
	}
	
	public User[] getAll() {
		UserDAO userObj = new UserDAO();
		User[] userArray = userObj.findAll();
		
		for(int i=0;i<userArray.length;i++) {
			System.out.print(userArray[i]);
		}
//		System.out.println(userArray);
		
		return userArray;
	}
	
	
}
