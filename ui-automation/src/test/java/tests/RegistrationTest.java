package tests;

import org.testng.Assert;
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
	public void verifyInvalidEmail() throws InterruptedException {

	    page.registerUser(
	        "Priya",
	        "priyagmailcom",   // invalid email
	        "India",
	        "Engineer",
	        "54321",
	        "54321"
	    );
	}
	
	@Test(priority = 4)
	 public void verifyWeakPassword()
	    {
		 page.registerUser(
			        "Priya",
			        "priya@gmail.com",   // invalid email
			        "India",
			        "Engineer",
			        "54321",
			        "54321"
			    );
		 
		 Assert.assertEquals(page.getWarninigMSG(), "Password must be at least 6 characters");
	    }
}
