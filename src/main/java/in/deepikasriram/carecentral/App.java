package in.deepikasriram.carecentral;

import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.service.UserService;
import in.deepikasriram.carecentral.model.Task;
import in.deepikasriram.carecentral.service.TaskService;

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
		
		try {
			TaskService taskService = new TaskService();
			
			Task newTask = new Task();
			newTask.setId(01);
			newTask.setTaskName("Java homework for tomorrow");
			newTask.setDueDate("7/10/2023");
			newTask.setActive(true);
			
			taskService.create(newTask);
			taskService.getAll();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
