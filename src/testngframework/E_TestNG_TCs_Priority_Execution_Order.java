package testngframework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class E_TestNG_TCs_Priority_Execution_Order {
	WebDriver driver;
	@Ignore
	@Test(priority=3)
	  public void zomato() {
		 driver.get("https://www.zomato.com"); 
	  }
	  @Test(priority=1, enabled=false)
	  public void twitter() {
		 driver.get("https://www.x.com"); 
	  }
	  @Test(priority=6)
	  public void facebook() {
		 driver.get("https://www.facebook.com"); 
	  }
	  @Test(enabled=false, priority=4)
	  public void selenium() {
		 driver.get("https://www.selenium.dev"); 
	  }
	  @Test(priority=5)
	  public void redmine() {
		 driver.get("https://www.redmine.org"); 
	  }
	  @Test(priority=0)
	  public void swiggy() {
		 driver.get("https://www.swiggy.com"); 
	  }
	  @Test(priority=2)
	  public void google() {
		 driver.get("https://www.google.com"); 
	  }
	  
	  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
