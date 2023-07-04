package in.deepikasriram.carecentral.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Task {
	int id;
	String taskName;
	LocalDateTime dueDate;
	boolean isActive = true;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		this.dueDate = LocalDateTime.parse(dueDate,formatter);
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", dueDate=" + dueDate + ", isActive=" + isActive + "]";
	}
}
