package Page;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
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
	@FindBy(id="country") WebElement contryDropdown;
	@FindBy(id="account") WebElement accountDropdown;
	@FindBy(xpath="//button[normalize-space()='Signup']") WebElement signupButton;
	
	//Action method
	
	public void enterName(String Username)
	{
		name.sendKeys(Username);
	}
	
	public void selectCountry(String Country)
	{
		Select selectcountry = new Select(contryDropdown);
		selectcountry.selectByVisibleText(Country);
	}
	
	public void selectAccountType(String AccountType)
	{
		Select selectac = new Select (accountDropdown);
		selectac.selectByVisibleText(AccountType);
	}
	
	public void enterEmail(String email)
	{
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String Password)
	{
		passwordField.sendKeys(Password);
	}
	
	public void enterConfirmPassword(String ConfirmPassword)
	{
		confirmPassField.sendKeys(ConfirmPassword);
	}
	
	public void clickSignup() 
	{
	        signupButton.click();
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

