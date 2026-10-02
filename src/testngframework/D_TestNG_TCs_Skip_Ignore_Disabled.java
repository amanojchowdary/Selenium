package testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D_TestNG_TCs_Skip_Ignore_Disabled {
	WebDriver driver;

	
	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	public void swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test(enabled=false)
	public void twitter() {
		driver.get("https://www.x.com");
	}
	@Test
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test(enabled=false)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test(enabled=true)
	public void google() {
		driver.get("https://www.google.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

}
}