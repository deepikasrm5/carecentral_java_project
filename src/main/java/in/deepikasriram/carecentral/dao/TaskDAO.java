package in.deepikasriram.carecentral.dao;

import java.time.LocalDate;
import java.util.Set;

import in.deepikasriram.carecentral.interfaceFiles.TaskInterface;
import in.deepikasriram.carecentral.model.*;

public class TaskDAO implements TaskInterface{
	
	@Override
	public Set<Task> findAll() {
		Set<Task> taskList = TaskList.listOfTasks; // collecting data from TaskList class.
		return taskList;
	}
	
	
	
	@Override
	public Task findById(int id) {
		Set<Task> taskList  = TaskList.listOfTasks;		
		for(Task task:taskList) {
			if(task!= null &&task.getId() == id) {
				return task;
			}
		}
		return null;
		
	}

	@Override
	public void delete(int id) {
		Set<Task> taskList = TaskList.listOfTasks;
		for(Task task:taskList) {
			if(task != null && task.getId() == id) {
				task.setActive(false);
			}
		}
	}

	

	@Override
	public void sortByDate(LocalDate date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int count() {
		Set<Task> taskList = TaskList.listOfTasks;
		int countOfTasks = 0;
		for(Task task:taskList) {
			if(task!= null) {
				countOfTasks+=1;
			}
		}
		
		return countOfTasks;
	}




	@Override
	public void update(int id, Task newT) {
		Set<Task> taskList = TaskList.listOfTasks;
		for(Task task:taskList) {
			if(task.getId() == id) {
				task.setId(task.getId());
				task.setTaskName(task.getTaskName());
				task.setDueDate(task.getDueDate());
				task.setActive(true);
				break;
			}
		}
	}


	@Override
	public void create(Task newTask) {
		Set<Task> taskList  = TaskList.listOfTasks;
		taskList.add(newTask);
	}
	
	
	
}
