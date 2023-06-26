package in.deepikasriram.carecentral;

import in.deepikasriram.carecentral.service.UserService;

public class App {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.create();
		userService.getAll();
	}

}
