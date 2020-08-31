package main.driverFactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class SafariDriverManager extends DriverManager{

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/sunibha/Documents/Eclipse/Drivers/chromedriver");
		driver = new ChromeDriver();

	}
}
