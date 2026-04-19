package dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name="registrationData")
	public Object[][] getData(){
		return new Object [][] {
			{"Priya","priya@gmail.com", "India", "Student", "123456", "123456"},
			{"Test", "test@gmail.com", "India", "Current", "pass123", "pass123"}
		};
	}
}
