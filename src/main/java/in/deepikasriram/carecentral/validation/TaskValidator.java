package in.deepikasriram.carecentral.validation;


import in.deepikasriram.carecentral.exception.ValidationException;
import in.deepikasriram.carecentral.model.TaskEntity;
import in.deepikasriram.carecentral.util.StringUtil;


public class TaskValidator {
	public static void validate(TaskEntity task) throws Exception {
		if(task==null) {
			throw new ValidationException("Invalid input");
		}
		StringUtil.rejectIfInvalidString(task.getTaskName(), "taskName");
		StringUtil.rejectIfInvalidDate(task.getDueDate(),"due date");
		
		
	}
}
