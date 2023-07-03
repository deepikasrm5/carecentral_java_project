package in.deepikasriram.carecentral.service;

import in.deepikasriram.carecentral.dao.UserDAO;
import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.validation.UserValidator;

public class UserService {
	
	public void create(User newUser) throws Exception{
		
		UserValidator.validate(newUser);
		
		UserDAO userObj = new UserDAO();
		userObj.create(newUser);
		
		
	}
	
	public User[] getAll() {
		UserDAO userObj = new UserDAO();
		User[] userArray = userObj.findAll();
		
		for(int i=0;i<userArray.length;i++) {
			System.out.println(userArray[i]);
		}
//		System.out.println(userArray);
		
		return userArray;
	}
	
	
	public void update() {
		User newUser3 = new User();
		newUser3.setUserId(12);
		newUser3.setFirstName("Vaishnavi");
		newUser3.setLastName("Shriram");
		newUser3.setEmailId("vaishnavi@gmail.com");
		newUser3.setPassword("asdf***1234");
		newUser3.setActive(true);
		
		UserDAO userObj = new UserDAO();
		userObj.update(12, newUser3);
	}
	
	
	public void delete() {
		User newUser4 = new User();
		newUser4.setActive(false);
		
		UserDAO userObj = new UserDAO();
		userObj.delete(12);
	}
}
