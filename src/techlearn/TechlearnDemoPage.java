package techlearn;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TechlearnDemoPage {
	WebDriver driver;
  @Test
  public void techlearndemopage() {
	  driver.get("https://www.techlearn.in/demo");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
