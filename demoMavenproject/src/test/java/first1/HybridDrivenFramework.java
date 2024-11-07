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

public class HybridDrivenFramework {

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
		XSSFSheet dsh = wk.getSheet("Sheet1");
		XSSFSheet ksh = wk.getSheet("KDF");
		
		for(int i=1; i<= dsh.getLastRowNum(); i++) {
			XSSFRow drw = dsh.getRow(i);
			XSSFCell un = drw.getCell(0);
			XSSFCell pw = drw.getCell(1);
			XSSFCell res = drw.createCell(2);
			
			System.out.println("username= " + un +" ,password= "+ pw);
			
			try {
				for(int j=1; j<= ksh.getLastRowNum(); j++) {
					XSSFRow krw = ksh.getRow(j);
					XSSFCell key = krw.getCell(1);
					
					switch(key.toString()) {
					case "username":
						wd.findElement(By.id("user-name")).clear();
						wd.findElement(By.id("user-name")).sendKeys(un.toString());
						break;
					case "password":
						wd.findElement(By.name("password")).clear();
						wd.findElement(By.name("password")).sendKeys(pw.toString());
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
				System.out.println("Valid Data");
				res.setCellValue("Valid");
			} catch (Exception e) {
				System.out.println("Invalid Data");
				res.setCellValue("Invalid");
			}
			FileOutputStream fos = new FileOutputStream("C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Dataexcel.xlsx");
			wk.write(fos);
		}
	}

}
