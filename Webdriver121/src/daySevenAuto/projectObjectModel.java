package daySevenAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class projectObjectModel {
	WebDriver wd;
	public projectObjectModel(WebDriver wd) {
		// TODO Auto-generated method stub
		this.wd = wd;
	}

	//Repository of elements
	By uname = By.id("user-name");
	By pass = By.id("password");
	By lin = By.id("login-button");

	// Repository of methods
	public void url() {
		wd.get("https://www.saucedemo.com/");
	}
	
	public void username(String un) {
		wd.findElement(uname).sendKeys(un);
	}
	
	public void password(String pw) {
		wd.findElement(pass).sendKeys(pw);
	}
	
	public void login() {
		wd.findElement(lin).click();
	}
	
	// Anouther way
//	public void loginprocess(String un, String pw) {
//		url();
//		username(un);
//		password(pw);
//		login();
//	}
}
