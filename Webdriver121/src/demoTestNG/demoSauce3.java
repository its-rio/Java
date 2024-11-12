package demoTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoSauce3 {
	WebDriver wd;
	@BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		wd = new ChromeDriver();
		
	  }
	@Test 
	  public void login() {
		wd.findElement(By.id("user-name")).sendKeys("standard_user");

		wd.findElement(By.name("password")).sendKeys("secret_sauce");

		wd.findElement(By.id("login-button")).click();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  wd.get("https://www.saucedemo.com/");
			
			//maximize
			wd.manage().window().maximize();
			
			//wait
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }

	  @AfterMethod
	  public void logout() {
		  wd.findElement(By.id("react-burger-menu-btn")).click();

			wd.findElement(By.linkText("Logout")).click();
	  }

	  

	  @AfterSuite
	  public void close() {
		  wd.close();
	  }

	  
}
