package javacomments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  WebDriver driver;
  @Test
  public void Manoj() {
  }
  @BeforeTest
  public void beforeTest() {
    driver = new EdgeDriver();
    driver.manage().window().maximize();
  }

}
