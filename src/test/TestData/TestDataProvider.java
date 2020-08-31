package test.TestData;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name="loginTestData")
	public Object[][] loginTestData(){
		return new Object[][]{
							{"abc@gmail.com", "abc123"}
						};
	}

}
