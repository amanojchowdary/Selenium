package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class F_TestNG_TCs_Description_Feature {
	WebDriver driver;
  
  @Test//(description="Verify Zomato")
  public void testcase1() {
	 driver.get("https://www.zomato.com"); 
	 System.out.println("Zomato Application Launched");
  }
  @Test(description="Twitter")
  public void testcase2() {
	 driver.get("https://www.x.com"); 
  }
  @Test(description="Verify Facebook")
  public void testcase3() {
	 driver.get("https://www.facebook.com"); 
  }
  @Test(description="Verify Selenium")
  public void testcase4() {
	 driver.get("https://www.selenium.dev"); 
  }
  @Test(description="Verify Redmine")
  public void testcase5() {
	 driver.get("https://www.redmine.org"); 
  }
  @Test(description="Verify Swiggy")
  public void testcase6() {
	 driver.get("https://www.swiggy.com"); 
  }
  @Test(description="Verify Google")
  public void tc7() {
	 driver.get("https://www.google.com"); 
  }
  
  @BeforeTest
  public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();	  
  }

}
