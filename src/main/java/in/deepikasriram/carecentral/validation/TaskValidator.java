package in.deepikasriram.carecentral.validation;

import java.time.LocalDate;

import in.deepikasriram.carecentral.exception.ValidationException;
import in.deepikasriram.carecentral.model.Task;
import in.deepikasriram.carecentral.util.StringUtil;


public class TaskValidator {
	public static void validate(Task task) throws ValidationException {
		if(task==null) {
			throw new ValidationException("Invalid input");
		}
		StringUtil.rejectIfInvalidString(task.getTaskName(), "taskName");
		StringUtil.rejectIfInvalidDate(task.getDueDate(),"due date");
		
		
	}
}
