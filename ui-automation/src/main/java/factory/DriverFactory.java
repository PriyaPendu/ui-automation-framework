package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;
	
	public static WebDriver initDriver()
	{
		driver = new ChromeDriver();
		return driver;
		
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
