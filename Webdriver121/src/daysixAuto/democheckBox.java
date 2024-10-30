package daysixAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class democheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://mail.rediff.com/cgi-bin/login.cgi/");
		
		//maximize
		wd.manage().window().maximize();
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement chk = wd.findElement(By.id("remember"));
		boolean isselected = chk.isSelected();
		
		if(isselected == true) {
			chk.click();
		}
		else {
			chk.click();
			System.out.println("Already Selected");
		}
		
	}

}
