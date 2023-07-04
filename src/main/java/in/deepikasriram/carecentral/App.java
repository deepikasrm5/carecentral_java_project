package in.deepikasriram.carecentral;


import java.time.LocalDate;

import in.deepikasriram.carecentral.model.Task;
import in.deepikasriram.carecentral.service.TaskService;

public class App {

	public static void main(String[] args) {

//		try {
//			UserService userService = new UserService();
//
//			User newUser = new User();
//			newUser.setUserId(12);
//			newUser.setFirstName("Deepika");
//			newUser.setLastName("Sriram");
//			newUser.setEmailId("deepika@gmail.com");
//			newUser.setPassword("asdf***1234");
//			newUser.setActive(true);
//
//			
//			userService.create(newUser);
//			userService.getAll();
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
		
		try {
			TaskService taskService = new TaskService();
			
			Task newTask = new Task();
			newTask.setId(01);
			newTask.setTaskName("Java homework for tomorrow");
			String date = "04/07/2023";
		LocalDate dueDate =	taskService.convertDate(date);
			
			newTask.setDueDate(dueDate);
			newTask.setActive(true);
			
			taskService.create(newTask);
			taskService.getAll();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
