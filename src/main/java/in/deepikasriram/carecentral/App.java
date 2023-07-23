package in.deepikasriram.carecentral;

import java.util.Set;
import java.util.HashSet;

import in.deepikasriram.carecentral.exception.ValidationException;
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
			

			
			userService.create(newUser);
			userService.getAll();
			
			User newUser2 = new User();
			newUser2.setUserId(12);
			newUser2.setFirstName("Deepika");
			newUser2.setLastName("Sriram");
			newUser2.setEmailId("deepika@gmail.com");
			newUser2.setPassword("asdf***1234");
			newUser2.setActive(true);
			
			userService.create(newUser2);
			userService.getAll();
			
			Set<User> users = new HashSet<User>();
			users.add(newUser);
			users.add(newUser2);
			
			System.out.println(users);

			
		} catch (ValidationException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		try {
			TaskService taskService = new TaskService();
			
			Task task1 = new Task();
			task1.setId(1);
			task1.setTaskName("Coding");
			task1.setDueDate("01/08/2023");
			task1.setActive(true);
			
			taskService.create(task1);
			taskService.getAll();
		}
		catch(ValidationException e) {
			e.printStackTrace();
		}
	}
		

}
