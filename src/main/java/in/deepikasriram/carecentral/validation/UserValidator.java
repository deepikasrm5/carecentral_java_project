package in.deepikasriram.carecentral.validation;

import java.util.Set;
import java.util.HashSet;
import in.deepikasriram.carecentral.exception.ValidationException;
import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws ValidationException {

		Set<User> set = new HashSet<>();

		if (user == null) {
			throw new ValidationException("Invalid user input");
		}

		StringUtil.rejectIfInvalidString(user.getEmailId(), "email");
		StringUtil.rejectIfInvalidString(user.getPassword(), "password");
		StringUtil.rejectIfInvalidString(user.getFirstName(), "first name");

	}

}
