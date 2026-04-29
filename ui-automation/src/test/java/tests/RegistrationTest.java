package tests;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import pages.RegistrationPage;
import base.BaseTest;

public class RegistrationTest extends BaseTest
{
	RegistrationPage page;
	
	@BeforeMethod
	public void setupPage()
	{
		page = new pages.RegistrationPage();
	}
	

	@Test(priority = 1)
	public void verifyUserRegistration()
	{
		
		 page.registerUser(
	                "Priya",
	                "priya@gmail.com",
	                "India",
	                "Student",
	                "12345",
	                "12345"
	        );
	}
	
	@Test(priority = 2)
	public void verifyEmptySubmission()
	{
		page.clickSignup();
	}
	
	@Test(priority = 3)
	public void verifyInvalidEmail() {

	    page.registerUser(
	        "Priya",
	        "priyagmailcom",   // invalid email
	        "India",
	        "Employee",
	        "54321",
	        "54321"
	    );
	}
}
