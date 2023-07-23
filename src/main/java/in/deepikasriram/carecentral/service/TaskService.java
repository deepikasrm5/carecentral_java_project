package in.deepikasriram.carecentral.service;

import in.deepikasriram.carecentral.model.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

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
			e.printStackTrace();
		}
			return null;
	}
	
	public Set<Task> getAll() {
		TaskDAO taskObj = new TaskDAO();
		Set<Task> taskArray = taskObj.findAll();
		return taskArray;
	}
}