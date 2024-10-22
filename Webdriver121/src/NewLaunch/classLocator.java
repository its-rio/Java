package NewLaunch;

/* class locator use karne ke liye class name me space nahi honi chahiye agar hogi to 
hum dot use ker ke try karenge. nahi to space ke baad ka name delete karenge vo work kerta 
hai */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("download");
	}

}
