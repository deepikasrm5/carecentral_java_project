package in.deepikasriram.carecentral.service;

import in.deepikasriram.carecentral.model.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import in.deepikasriram.carecentral.dao.TaskDAO;
import in.deepikasriram.carecentral.validation.TaskValidator;

public class TaskService {
	public void create(Task newTask) throws Exception {
		TaskValidator.validate(newTask);

		TaskDAO taskObj = new TaskDAO();
		taskObj.create(newTask);
	}
	
	public LocalDate convertDate(String dueDate) {
		
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				LocalDate currDate = LocalDate.parse(dueDate , formatter);
				return currDate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
	}
	
	public Task[] getAll() {
		TaskDAO taskObj = new TaskDAO();
		Task[] taskArray = taskObj.findAll();
		
		for(int i=0;i<taskArray.length;i++) {
			System.out.println(taskArray[i]);
			
		}
		return taskArray;
	}
}