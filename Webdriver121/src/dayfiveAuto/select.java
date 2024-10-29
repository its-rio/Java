package dayfiveAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//maximize
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gLFyf")).sendKeys("download selenium");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		
		
	}

}
