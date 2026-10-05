package javacomments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class NewTest {
  WebDriver driver;
  @Test
  public void mohan() {
  }
  @BeforeTest
  public void beforeTest() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

}
