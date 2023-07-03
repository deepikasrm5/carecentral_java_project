package in.deepikasriram.carecentral;

import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.service.UserService;

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

			
			userService.create(newUser);
			userService.getAll();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

//		User newUser2 = new User();
//		newUser2.setUserId(13);
//		newUser2.setFirstName("Uthra");
//		newUser2.setLastName("Boopathy");
//		newUser2.setEmailId("uthra@gmail.com");
//		newUser2.setPassword("qwerty67890");
//		newUser2.setActive(true);
//
//		userObj.create(newUser2);
//
//		userService.getAll();
//		userService.update();
//		userService.getAll();
//		userService.delete();
//		userService.getAll();
	}

}
