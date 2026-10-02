package junittutorial;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo2 {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled   // This is only skip on Junit 5 
	@Test
	void facebook() {
	driver.get("https://www.facebook.com");
	}
	@Ignore  // This is only skip on Junit 3 & 4
	@Test
	void google() {
	driver.get("https://www.google.com");
	}		
	@Test
	void twitter() {
	driver.get("https://www.x.com");
	}
	@Disabled
	@Test
	void zomato() {
	driver.get("https://www.zomato.com");
	}
	@Test
	void techlearn() {
	driver.get("https://www.techlearn.in/admin");
	}
	@Disabled
	@Test
	void swiggy() {
	driver.get("https://www.swiggy.com");
	}


}
