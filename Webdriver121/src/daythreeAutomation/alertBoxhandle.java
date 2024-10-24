package daythreeAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertBoxhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://vinothqaacademy.com/alert-and-popup/");
		
		//maximize
		wd.manage().window().maximize();
		
		//Fasten the webpage while running
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.findElement(By.name("alertbox")).click();
			Alert alt = wd.switchTo().alert();  //Interface
			alt.accept(); //for(+) response ok button
			
		wd.findElement(By.name("confirmalertbox")).click();
			Alert alt1 = wd.switchTo().alert();  //Interface
			alt.dismiss(); //for(-) response cancel button
			
			Thread.sleep(2000);
			wd.findElement(By.name("promptalertbox1234")).click();
			Thread.sleep(2000);
			Alert alt2 = wd.switchTo().alert(); 
			Thread.sleep(2000);
			alt2.sendKeys("Yes"); 
			alt2.accept();
			
			
	}

}
