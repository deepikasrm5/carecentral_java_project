package in.deepikasriram.carecentral.service;

import in.deepikasriram.carecentral.dao.UserDAO;
import in.deepikasriram.carecentral.model.User;

public class UserService {
	
	public User[] getAll() {
		UserDAO userObj = new UserDAO();
		User[] userArray = userObj.findAll();
		
		for(int i=0;i<userArray.length;i++) {
			System.out.println(userArray[i]);
		}
//		System.out.println(userArray);
		
		return userArray;
	}
	
	
}
