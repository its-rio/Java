package first1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFramework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.saucedemo.com/");
		
		//maximize
		wd.manage().window().maximize();
		
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Dataexcel.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fis);
		XSSFSheet sh = wk.getSheet("sheet1");
		
		for(int i=1; i<= sh.getLastRowNum(); i++) {
			XSSFRow rw = sh.getRow(i);
			XSSFCell un = rw.getCell(0);
			XSSFCell pw = rw.getCell(1);
			XSSFCell res = rw.createCell(2);
			
			System.out.println("username= " + un +" ,password= "+ pw);
			
			try {
				wd.findElement(By.id("user-name")).clear();
				wd.findElement(By.id("user-name")).sendKeys(un.toString());
				
				wd.findElement(By.name("password")).clear();
				wd.findElement(By.name("password")).sendKeys(pw.toString());
				
				wd.findElement(By.id("login-button")).click();
				
				wd.findElement(By.id("react-burger-menu-btn")).click();
			
				wd.findElement(By.linkText("Logout")).click();
				
				System.out.println("Valid Data");
				res.setCellValue("Valid");
			} catch (Exception e) {
				System.out.println("Invalid Data");
				res.setCellValue("Invalid");
			}
			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\faisa\\\\OneDrive\\\\Desktop\\\\Selenium\\\\Dataexcel.xlsx");
					wk.write(fos);
		}
	}

	
}
