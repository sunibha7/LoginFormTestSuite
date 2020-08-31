package main.driverFactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("User.dir") + "/src/main/drivers/chromedriver");
		driver = new ChromeDriver();

	}

}
