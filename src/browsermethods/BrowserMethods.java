package browsermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(8000);
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
	}

}
