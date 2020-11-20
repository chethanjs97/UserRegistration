package com.UserRegistration;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.ValidateFirstName("Chethan");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.ValidateFirstName("ch");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("Chethan");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateLastName("ch");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("chethan@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateEmail("xyz.@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateMobileNumber("917899460165");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validateMobileNumber("789946");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("Chethan@123");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenInvalid_ShouldReturnTrue() {
		UserRegistration userValidator = new UserRegistration();
		boolean result = userValidator.validatePassword("Chethan@js");
		Assert.assertFalse(result);
	}

}
