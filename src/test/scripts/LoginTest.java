package test.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import test.TestData.TestDataProvider;
import main.pageObjects.HomePage;
import main.pageObjects.LoginForm;

public class LoginTest extends BaseTest {
	
	LoginForm loginForm;
	HomePage homePage;
	
	@Test (dataProvider="loginTestData", dataProviderClass = TestDataProvider.class)
	public void testLogin(String email, String password) {
		
		String expectedHomePageTitle = "Home Page";
		
		loginForm = new LoginForm(driver);
		loginForm.login(email, password);
		
		Assert.assertEquals(expectedHomePageTitle, homePage.getPageTitle());
	}
	
	
}
