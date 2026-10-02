package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class I_TestNG_TCs_InvocationCount {
	WebDriver driver;

	@Test
	public void techlearnloginlocal() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("nandhini");
		driver.findElement(By.name("pwd")).sendKeys("Test@12345");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.className("wp-login-lost-password")).click();
	}

	@Test(invocationCount=5)
	public void hellowtealoginproduction() {
		driver.get("https://www.hellowtea.com/admin");
		driver.findElement(By.id("user_login")).sendKeys("nandhini");
		driver.findElement(By.name("pwd")).sendKeys("Test@12345");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.className("wp-login-lost-password")).click();
	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

}
