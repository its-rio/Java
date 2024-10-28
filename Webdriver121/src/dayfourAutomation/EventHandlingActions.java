package dayfourAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EventHandlingActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		//maximize
		wd.manage().window().maximize();
		
		//Fasten the webpage while running
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Click and navigate back and focused and double click
		
		wd.findElement(By.id("click")).click();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		WebElement dclick = wd.findElement(By.id("clickable"));
		Actions act = new Actions(wd);
		//new Actions(wd).d;
		act.click(dclick).perform();
		Thread.sleep(2000);
		act.doubleClick(dclick).perform();
		
		// Drag And Drop
		
		WebElement drag = wd.findElement(By.id("draggable"));
		WebElement drop = wd.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions act1 = new Actions(wd);
		Thread.sleep(2000);
		act1.dragAndDrop(drag, drop).perform();
	}

}
