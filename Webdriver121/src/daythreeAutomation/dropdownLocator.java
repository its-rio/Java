package daythreeAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.blazedemo.com/");
		
		//maximize
		wd.manage().window().maximize();
		
		//Fasten the webpage while running
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Select s1 = new Select(wd.findElement(By.name("fromPort")));
		s1.selectByIndex(1);
		
		Select s2 = new Select(wd.findElement(By.name("toPort")));
		//s2.selectByIndex(3);
		s2.selectByValue("Rome");
	}

}
