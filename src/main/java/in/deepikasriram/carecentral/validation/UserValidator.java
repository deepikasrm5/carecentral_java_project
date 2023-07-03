package in.deepikasriram.carecentral.validation;

import in.deepikasriram.carecentral.exception.ValidationException;
import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.util.StringUtil;

public class UserValidator {
	public static void validate(User user) throws ValidationException{
		if(user == null) {
			throw new ValidationException("Invalid user input");
		}
		
		StringUtil.rejectIfInvalidString(user.getEmailId(), "email");
//		if(user.getEmailId()==null || "".equals(user.getEmailId().trim())) {
//			throw new ValidationException("email cannot be null or empty");
//		}
		
		StringUtil.rejectIfInvalidString(user.getPassword(), "password");
//		if(user.getPassword()==null || "".equals(user.getPassword().trim())) {
//			throw new ValidationException("password cannot be null or empty");
//		}
		
		
		StringUtil.rejectIfInvalidString(user.getFirstName(), "first name");
		
//		if(user.getFirstName()==null || "".equals(user.getFirstName().trim())) {
//			throw new ValidationException("first name cannot be null or empty");
//		}
	}
}
