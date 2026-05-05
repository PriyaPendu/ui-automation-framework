package base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
	//helper method
	//Send Key Helper
	public void sendKeys(WebElement element, String value)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	
	// Click Helper
	public void clickElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	// scroll helper
	public void scrollToElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
}
