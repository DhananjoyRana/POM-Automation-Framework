package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Constructor
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement input_email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement input_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_button;

	//Action Methods
	public void setUserName(String username) {
		input_email.sendKeys(username);
	}
	public void setPassword(String password) {
		input_password.sendKeys(password);
	}
	public void clickLogin() {
		login_button.click();
	}
}
