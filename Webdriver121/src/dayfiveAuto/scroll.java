package dayfiveAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.selenium.dev/documentation/webdriver/");
		
		//maximize
		wd.manage().window().maximize();
		
		//Fasten the webpage while running
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement move = wd.findElement(By.linkText("Troubleshooting Assistance"));
		
		Actions act1 = new Actions(wd);
		
		//1
		Thread.sleep(2000);
		act1.scrollByAmount(0, 500).perform();
		
		//2
		Thread.sleep(2000);
		act1.scrollToElement(move).perform();
		
		//3
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("window.scrollTo(0,200)");
	}

}
