package daysixAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		
		//maximize
		wd.manage().window().maximize();
		
		WebDriverWait wt = new WebDriverWait(wd,Duration.ofSeconds(2));
		WebElement ele = wt.
				until(ExpectedConditions.visibilityOf
						(wd.findElement(By.className("gLFyf"))));
		ele.click();
		wd.findElement(By.className("gLFyf")).sendKeys("Download Selenium");
		wd.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		
	}

}
