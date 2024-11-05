package first1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDrivenframework {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.saucedemo.com/");
		
		//maximize
		wd.manage().window().maximize();
		
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Dataexcel.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fis);
		XSSFSheet sh = wk.getSheet("KDF");
		
		for(int i=1; i<= sh.getLastRowNum(); i++) {
			XSSFRow rw = sh.getRow(i);
			XSSFCell key = rw.getCell(1);
			
			switch(key.toString()) {
			case "username":
				wd.findElement(By.id("user-name")).clear();
				wd.findElement(By.id("user-name")).sendKeys("standard_user");
				break;
			case "password":
				wd.findElement(By.name("password")).clear();
				wd.findElement(By.name("password")).sendKeys("secret_sauce");
				break;
			case "login":
				wd.findElement(By.id("login-button")).click();
				break;
			case "clicklogout":
				wd.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(2000);
				break;
			case "logout":
				wd.findElement(By.linkText("Logout")).click();
				break;
			}
			
	} 

}}
