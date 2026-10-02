package locators;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void idnameclassname() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("kalavathi");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Test@12345");
		Thread.sleep(2000);
		driver.findElement(By.id("rememberme")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("wp-login-lost-password")).click();
		
	}
	
	@Test
	void cssSelectorLocator() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#user_login")).sendKeys("Nandhini");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys("Hello@321");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".wp-login-lost-password")).click();
	//	driver.findElement(By.cssSelector("a.wp-login-lost-password")).click();
				
	}

	
	@Test
	void linktextandpartiallinktext() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
	//	driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.partialLinkText("Lost")).click();		
	}
	
	
	@Test
	void returntypeoffindElement() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("user_login"));
		username.sendKeys("Naveen");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("Test");
		
		WebElement check = driver.findElement(By.id("rememberme"));
		check.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Lost your password?")).click();		
		
	}
	
	@Test
	void clearmethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("user_login"));
		username.sendKeys("techlearn");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("Test");
		
		driver.findElement(By.name("wp-submit")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("user_login")).clear();
		Thread.sleep(2000);

		WebElement username1 = driver.findElement(By.id("user_login"));
		username1.sendKeys("Mohan");	
			
		
	}
	
	
	@Test
	void totalnumberoflinks() throws InterruptedException {
		driver.get("https://www.redmine.org");
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		System.out.println("Total links on Redmine Home Page : "+links.size());
		
	}
	
	
	@Test
	void totalnumberofImages() throws InterruptedException {
		driver.get("https://www.redmine.org");
		Thread.sleep(2000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
	
		
	}
}



