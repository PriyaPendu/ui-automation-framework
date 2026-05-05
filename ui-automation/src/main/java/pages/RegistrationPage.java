package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;


public class RegistrationPage extends BasePage { 

	//constructor
	public RegistrationPage ()
	{
		super();
	}
	
	//Locators
	@FindBy(id="name") WebElement name;
	@FindBy(id="email") WebElement emailField;
	@FindBy(id="password") WebElement passwordField;
	@FindBy(id="confirm_password") WebElement confirmPassField;
	@FindBy(id="country") WebElement countryDropdown;
	@FindBy(id="account") WebElement accountDropdown;
	@FindBy(xpath="//button[normalize-space()='Signup']") WebElement signupButton;
	@FindBy(xpath="//p[@class='text-red-500 text-sm mt-1']") WebElement warningMessage;
	
	//Action method
	
	public void enterName(String username)
	{
		 sendKeys(name, username);
	}
	
	public void selectCountry(String Country)
	{
		new Select(countryDropdown).selectByVisibleText(Country);
	}
	
	public void selectAccountType(String AccountType)
	{
		new Select(accountDropdown).selectByVisibleText(AccountType);
	}
	
	public void enterEmail(String email)
	{
		sendKeys(emailField, email);
	}
	
	public void enterPassword(String Password)
	{
		sendKeys(passwordField, Password);
	}
	
	public void enterConfirmPassword(String ConfirmPassword)
	{
		sendKeys(confirmPassField,ConfirmPassword);
	}
	
	public void clickSignup() 
	{
			scrollToElement(signupButton);
	        clickElement(signupButton);
	}
	
	public String getFieldError (String fieldName)
	{
		//Generic xpath 
		String xpath = "//label[@for='"+fieldName+ "']/following-sibling::div//p";
		WebElement errorElement = driver.findElement(By.xpath(xpath));
		return errorElement.getText();
	}
	
	public String getWarninigMSG()
	{
		wait.until(ExpectedConditions.visibilityOf(warningMessage));
		return warningMessage.getText();
	}
	
	 public void registerUser(String name, String email, String country,
             String accountType, String password, String confirmPassword) 
	 {

				enterName(name);
				enterEmail(email);
				selectCountry(country);
				selectAccountType(accountType);
				enterPassword(password);
				enterConfirmPassword(confirmPassword);
				clickSignup();
	 }
	 
}

