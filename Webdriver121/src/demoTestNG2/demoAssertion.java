package demoTestNG2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoAssertion {
	WebDriver wd;
  @Test (groups = {"slow"})
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		
		//maximize
		wd.manage().window().maximize();
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Assertion ==> is to check expected with actual
		
		String ExpectedTitle = "Google";
		String ActualTitle = wd.getTitle();
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Actual Title ==> "+ ActualTitle);
  }
  
  @Test (description = "This is for notes")
  public void sauce() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.javatpoint.com/testng-listeners");
		
		//maximize
		wd.manage().window().maximize();
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  }
  
  
}
