package first1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class demoJDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\faisa\\OneDrive\\Desktop\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.saucedemo.com/");
		
		//maximize
		wd.manage().window().maximize();
		
		//wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenproject","root","root");
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery("select * from saucedemo");
		
		String un,pw;
		while(res.next()) {
			un = res.getString(1);
			pw = res.getString(2);
			
			wd.findElement(By.id("user-name")).clear();
			wd.findElement(By.id("user-name")).sendKeys(un);

			wd.findElement(By.name("password")).clear();
			wd.findElement(By.name("password")).sendKeys(pw);

			wd.findElement(By.id("login-button")).click();

			wd.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);

			wd.findElement(By.linkText("Logout")).click();
		}
}

}
