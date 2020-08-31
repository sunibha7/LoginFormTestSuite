package test.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Utils.ConfigFileReader;
import main.driverFactory.DriverManager;
import main.driverFactory.DriverManagerFactory;

public class BaseTest {
	
	protected WebDriver driver;
	protected static DriverManager driverManager;
	
	protected ConfigFileReader configFile;
	
	
	@BeforeTest
	public void setUp() {			
		driverManager = DriverManagerFactory.getManager("CHROME");
		configFile = new ConfigFileReader();
		
	}
	
	@BeforeMethod
	public void beforeEachTest() { 
		driver = driverManager.getDriver();
		driver.manage().timeouts().implicitlyWait(configFile.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		driver.get(configFile.getAppURL());
	}
	
	@AfterMethod
	public static void tearDown() {
		driverManager.quitDriver();
	}
	
	
}
