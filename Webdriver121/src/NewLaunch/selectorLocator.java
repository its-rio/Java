package NewLaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectorLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.saucedemo.com/");
		
		//maximize
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 1)tagname#id
		wd.findElement(By.cssSelector("input#user-name")).sendKeys("Admin");
		
		// 2)tagneme[attribute_name=value of attribute]
		wd.findElement(By.cssSelector("input[type=password]")).sendKeys("admin123");
		
		// 3)tagname.classname
		wd.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		
		
	}

}
