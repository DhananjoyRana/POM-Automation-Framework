package TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("dhananjoyrana55@gmail.com");
		lp.setPassword("Hello@2000");
		lp.clickLogin();
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
