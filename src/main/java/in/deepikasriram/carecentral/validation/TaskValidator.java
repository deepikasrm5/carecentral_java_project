package in.deepikasriram.carecentral.validation;

import in.deepikasriram.carecentral.exception.ValidationException;
import in.deepikasriram.carecentral.model.Task;
import in.deepikasriram.carecentral.util.StringUtil;


public class TaskValidator {
	public static void validate(Task task) throws ValidationException {
		if(task==null) {
			throw new ValidationException("Invalid Input");
		}
		StringUtil.rejectIfInvalidString(task.getTaskName(), "task");
		
	}
}
