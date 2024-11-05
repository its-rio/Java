package first1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		
		//maximize
		wd.manage().window().maximize();
		
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
