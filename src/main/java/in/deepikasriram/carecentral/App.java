package in.deepikasriram.carecentral;

import in.deepikasriram.carecentral.model.*;

import in.deepikasriram.carecentral.service.*;


public class App {

	public static void main(String[] args) {

		try {
			UserService userService = new UserService();

			User newUser = new User();
			newUser.setUserId(12);
			newUser.setFirstName("Deepika");
			newUser.setLastName("Sriram");
			newUser.setEmailId("deepika@gmail.com");
			newUser.setPassword("asdf***1234");
			newUser.setActive(true);
			
			System.out.println(newUser.toString());

			
			userService.create(newUser);
			userService.getAll();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		

}
