package NewLaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		wd.findElement(By.name("username")).sendKeys("Admin");
		
		wd.findElement(By.name("password")).sendKeys("admin123");
		
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		wd.findElement(By.className("oxd-userdropdown-tab")).click();
		
		wd.findElement(By.linkText("Logout")).click();
	}

}
