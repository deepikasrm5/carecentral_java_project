package in.deepikasriram.carecentral;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.deepikasriram.carecentral.model.User;
import in.deepikasriram.carecentral.service.UserService;

public class TestCreateUser {
	
	@Test
	public void testCreateUserWithValidInput() {

		UserService userService = new UserService();

		User newUser = new User();
		newUser.setUserId(12);
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId("deepika@gmail.com");
		newUser.setPassword("asdf***1234");
		newUser.setActive(true);

		
		assertDoesNotThrow(()->{
			userService.create(newUser);
		});
		
	}
	
	@Test
	public void testCreateUserWithInvalidInput() {
		UserService userService = new UserService();
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(null);
		});
		String expectedMessage = "Invalid user input";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	@Test
	public void testUserEmailWithNull() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setUserId(12);
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId(null);
		newUser.setPassword("asdf***1234");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "email cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	
	@Test
	public void testUserEmailWithEmptyString() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setUserId(12);
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId("");
		newUser.setPassword("asdf***1234");
		newUser.setActive(true);
		
		Exception exception = assertThrows(Exception.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "email cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	
	
}
