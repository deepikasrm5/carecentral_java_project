package in.deepikasriram.carecentral.validation;

import in.deepikasriram.carecentral.model.User;


public class UserValidator {
	public static void validate(User user) throws Exception{
		if(user == null) {
			throw new Exception("Invalid user input");
		}
		if(user.getEmailId()==null || "".equals(user.getEmailId().trim())) {
			throw new Exception("email cannot be null or empty");
		}
		if(user.getPassword()==null || "".equals(user.getPassword().trim())) {
			throw new Exception("password cannot be null or empty");
		}
		if(user.getFirstName()==null || "".equals(user.getFirstName().trim())) {
			throw new Exception("first name cannot be null or empty");
		}
	}
}
