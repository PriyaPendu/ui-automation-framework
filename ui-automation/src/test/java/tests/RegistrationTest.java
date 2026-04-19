package tests;

import org.testng.annotations.Test;

import Page.RegistrationPage;
import base.BaseTest;

public class RegistrationTest extends BaseTest
{
	

	@Test
	public void verifyUserRegistration()
	{
		RegistrationPage registrationPage = new RegistrationPage();
		 registrationPage.registerUser(
	                "Priya",
	                "priya@gmail.com",
	                "India",
	                "Student",
	                "12345",
	                "12345"
	        );
	}
}
