package in.deepikasriram.carecentral.service;

import in.deepikasriram.carecentral.model.Task;
import in.deepikasriram.carecentral.dao.TaskDAO;
import in.deepikasriram.carecentral.exception.ValidationException;

import in.deepikasriram.carecentral.validation.TaskValidator;

public class TaskService {
	public void create(Task newTask) throws ValidationException {
		TaskValidator.validate(newTask);
		
		TaskDAO taskObj = new TaskDAO();
		taskObj.create(newTask);
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
