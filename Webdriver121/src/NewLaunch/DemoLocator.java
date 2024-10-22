package NewLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//minimize
		Thread.sleep(2000);
//		driver.manage().window().minimize();
		
		// Locators => by id, by name, by className, by linkText
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		//driver.findElement(By.className("submit-button")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		
		// Use linkText locator to logout => only use on unique text
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();

	}

}
