package NewLaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorOrangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// tagname.classname
		wd.findElement(By.cssSelector("input.oxd-input")).sendKeys("Admin");
		
		// tagneme[attribute_name=value of attribute]
		wd.findElement(By.cssSelector("input[type=password]")).sendKeys("admin123");
		
		// tagneme[attribute_name=value of attribute]
		wd.findElement(By.cssSelector("button[type=submit]")).click();
	}

}
