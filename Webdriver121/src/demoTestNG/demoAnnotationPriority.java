package demoTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class demoAnnotationPriority {
	@Test(priority = 1) //lowest priority will execute first
	  public void a() {
		  System.out.println("Test Method1");
	  }
	@Test(priority = 5) //highest priority will execute last
	  public void c() {
		  System.out.println("Test Method2");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("After Class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Before Suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("After Suite");
	  }
}
