package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo1 {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}	

	@Test
	void facebook() {
	driver.get("https://www.facebook.com");
	}
	@Test
	void google() {
	driver.get("https://www.google.com");
	}	
	
	@Test
	void twitter() {
	driver.get("https://www.x.com");
	}
	@Test
	void zomato() {
	driver.get("https://www.zomato.com");
	}
	@Test
	void techlearn() {
	driver.get("https://www.techlearn.in/admin");
	}
	@Test
	void swiggy() {
	driver.get("https://www.swiggy.com");
	}

}
