package in.deepikasriram.carecentral;

import in.deepikasriram.carecentral.exception.ValidationException;

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
		
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId("d@gmail.com");
		newUser.setPassword("asdf***1234");
		

		
		assertDoesNotThrow(()->{
			userService.create(newUser);
		});
		
	}
	
	
	
	@Test
	public void testCreateUserWithInvalidInput() {
		UserService userService = new UserService();
		
		Exception exception = assertThrows(ValidationException.class,()->{
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
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId(null);
		newUser.setPassword("asdf***1234");
		
		Exception exception = assertThrows(ValidationException.class,()->{
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

		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId("");
		newUser.setPassword("asdf***1234");
	
		
		Exception exception = assertThrows(ValidationException.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "email cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
		
		
	}
	
	@Test
	public void testPasswordWithNull() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId("deepika.sriram@fssa.freshworks.com");
		newUser.setPassword(null);
		
		Exception exception = assertThrows(ValidationException.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "password cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	@Test
	public void testPasswordWithEmptyString() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setFirstName("Deepika");
		newUser.setLastName("Sriram");
		newUser.setEmailId("deepika.sriram@fssa.frehsworks.com");
		newUser.setPassword("");
		
		Exception exception = assertThrows(ValidationException.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "password cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	@Test
	public void testFirstNameWithNull() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setFirstName(null);
		newUser.setLastName("Sriram");
		newUser.setEmailId("deepika.sriram@fssa.freshworks.com");
		newUser.setPassword("asdf***1234");
		
		Exception exception = assertThrows(ValidationException.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "first name cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
	@Test
	public void testFirstNameWithEmptyString() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setFirstName("");
		newUser.setLastName("Sriram");
		newUser.setEmailId("deepika.sriram@fssa.freshworks.com");
		newUser.setPassword("asdf***1234");
		
		Exception exception = assertThrows(ValidationException.class,()->{
			userService.create(newUser);
		});
		String expectedMessage = "first name cannot be null or empty";
		String receivedMessage = exception.getMessage();
		
		assertTrue(expectedMessage.equals(receivedMessage));
	}
	
}
