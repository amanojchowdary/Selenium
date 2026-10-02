package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class G_TestNG_TCs_Depends_On_Methods {
	WebDriver driver;

	@Test(dependsOnMethods="method2")
	public void method1() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("nandhini");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Test@12345");
		Thread.sleep(2000);
		driver.findElement(By.id("rememberme")).click();
	}

	@Test
	public void method2() {
		driver.get("https://www.techlearn.in/admin");
	}

	@BeforeTest
	
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

}
