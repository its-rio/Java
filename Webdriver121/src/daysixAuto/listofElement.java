package daysixAuto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class listofElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.opencart.com/");
		
		//maximize
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act = new Actions(wd);
		
		List<WebElement> menu = wd.findElements(By.className("nav-item"));
		
		for(int i=0; i<menu.size(); i++) {
			Thread.sleep(1000);
			//to print element on console
			System.out.println(menu.get(i).getText());
			
			//hover on all list elements
			act.moveToElement(menu.get(i)).perform();
		}
	}

}
