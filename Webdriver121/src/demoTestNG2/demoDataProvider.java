package demoTestNG2;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class demoDataProvider {
	WebDriver wd;
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.saucedemo.com/");
		
		//maximize
		wd.manage().window().maximize();
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }
	
	@Test(dataProvider = "dp")
  public void f(String un, String pw) {
		try {
			wd.findElement(By.id("user-name")).sendKeys(un);

			wd.findElement(By.name("password")).sendKeys(pw);

			wd.findElement(By.id("login-button")).click();
			
			wd.findElement(By.id("react-burger-menu-btn")).click();

			wd.findElement(By.linkText("Logout")).click();
			System.out.println("Valid Data");
		} catch (Exception e) {
			System.out.println("Invalid data");
		}
  }
/*first array represent set of data
 * second array represent parameters
 * */

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "hdb", "cdd" },
      new Object[] { "wywe", "qw" }
    };
  }
}
