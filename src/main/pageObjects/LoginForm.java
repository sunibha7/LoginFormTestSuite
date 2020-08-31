package main.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginForm extends BasePage {
	
	protected WebDriverWait wait;
	
	@FindBy(id="inputEmail")
	private WebElement inputEmail;
	
	@FindBy(id="inputPassword")
	private WebElement inputPassword;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;
	
	public LoginForm(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver,10);
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void clickSubmitButton() {
		submitButton.click();
	}
	
	public void login(String email, String password) {
		setEmail(email);
		setPassword(password);
		clickSubmitButton();
	}
	
}
