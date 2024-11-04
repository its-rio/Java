package daySevenAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Register.html");
		
		//maximize
		wd.manage().window().maximize();
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement  file = wd.findElement(By.cssSelector("input[type = file]"));
		
		file.sendKeys("C:\\Users\\faisa\\Downloads\\XAUUSD_2024-10-29_13-39-49.png");
	}

}
