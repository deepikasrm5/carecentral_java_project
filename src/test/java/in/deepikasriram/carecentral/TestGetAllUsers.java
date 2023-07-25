package in.deepikasriram.carecentral;

import in.deepikasriram.carecentral.exception.ValidationException;
import java.util.Set;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.service.UserService;

public class TestGetAllUsers {
	
	@Test
	public void getAllUsers() {
		UserService userService = new UserService();
		Set<User> userList = new HashSet<User>(userService.getAll());
		System.out.println(userList);
		
	}
	
	@Test
	public void getUserById() {
		UserService userService = new UserService();
		User user = userService.getById(1);
		System.out.println(user);
	}
	
}
