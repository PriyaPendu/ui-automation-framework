package base;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage()
	{
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		
		PageFactory.initElements(driver, this);
	}
}
