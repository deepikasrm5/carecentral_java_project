package in.deepikasriram.carecentral;



import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import in.deepikasriram.carecentral.exception.ValidationException;
import in.deepikasriram.carecentral.model.Task;
import in.deepikasriram.carecentral.service.TaskService;

public class TestCreateTask {
	@Test
	public void testCreateTaskWithValidInput() {
		TaskService taskService = new TaskService();
		
		Task newTask = new Task();
		newTask.setId(01);
		newTask.setTaskName("Java homework");
		String date = "07/08/2023";
		LocalDate dueDate =	taskService.convertDate(date);
		newTask.setDueDate(dueDate);
		newTask.setActive(true);
		
		assertDoesNotThrow(()->{
			taskService.create(newTask);
		});
	}
	
	
	@Test
	public void testCreateTaskWithInvalidInput() {
		TaskService taskService = new TaskService();
		
		Exception exception = assertThrows(ValidationException.class,()->{
			taskService.create(null);
		});
		String expectedMessage = "Invalid input";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	@Test
	public void testTaskNameWithNull() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(01);
		newTask.setTaskName(null);
		String date = "04/08/2023";
		LocalDate dueDate =	taskService.convertDate(date);
		newTask.setDueDate(dueDate);
		newTask.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class,()->{
			taskService.create(newTask);
		});
		String expectedMessage = "taskName cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	@Test
	public void testTaskWithEmptyString() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(01);
		newTask.setTaskName("");

		String date = "04/08/2023";
		LocalDate dueDate =	taskService.convertDate(date);
		newTask.setDueDate(dueDate);
		newTask.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class,()->{
			taskService.create(newTask);
		});
		String expectedMessage = "taskName cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	@Test
	public void testDueDateWithInvalidDate() {
		TaskService taskService = new TaskService();
		Task newTask = new Task();
		newTask.setId(01);
		newTask.setTaskName("Java homework");
		String date = "21/02/2022";
		LocalDate dueDate =	taskService.convertDate(date);
		newTask.setDueDate(dueDate);
		newTask.setActive(true);
		
		Exception exception = assertThrows(ValidationException.class,()->{
			taskService.create(newTask);
		});
		String expectedMessage = "due date cannot be past";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
