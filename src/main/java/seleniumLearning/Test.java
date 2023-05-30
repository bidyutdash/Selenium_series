package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "/Users/bidyutdash/Documents/browserDrivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
