package com.UserRegistration;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.ValidateFirstName("Chethan"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.ValidateFirstName("ch");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid first name", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.validateLastName("Gonchigar"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.validateLastName("ch");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid last name", e.getMessage());
		}
	}

	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.validateEmail("chethanjs@gmail.com"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.validateEmail("xyz)*@gmail.com");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid email id", e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.validateMobileNumber("917899460165"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.validateMobileNumber("789946");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid phone number", e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		try {
			Assert.assertTrue(userValidator.validatePassword("Chethan@123"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		try {
			userValidator.validatePassword("chethan@$75");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter a valid password", e.getMessage());
		}
	}

}
