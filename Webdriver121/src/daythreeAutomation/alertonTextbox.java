package daythreeAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertonTextbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Alerts.html");
		
		//maximize
		wd.manage().window().maximize();
		
		//Fasten the webpage while running
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		Alert alt2 = wd.switchTo().alert(); 
		alt2.sendKeys("Hi i am Rio"); 
		alt2.accept();
	}

}
