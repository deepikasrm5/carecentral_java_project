package in.deepikasriram.carecentral;

import in.deepikasriram.carecentral.service.UserService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService userService = new UserService();
		userService.getAll();

	}

}
