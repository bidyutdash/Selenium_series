package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seleniumLearning.ElementUtil;

public class AmazonPage {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		BrowserUtil2 b = new BrowserUtil2();
		b.initDriver("chrome");
		b.launchURL("https://www.flipkart.com/");
		
		ElementUtil eu = new ElementUtil(driver);
		
		By popUp = By.xpath("//button[@class='_2KpZ6l _2doB4z']");
		By fashionTab = By.xpath("//img[@alt='Fashion']");
		
		
		boolean isPopUpDisplayed=  eu.getElement(popUp).isDisplayed();
		if(isPopUpDisplayed==true) {
			eu.getElement(popUp).click();
		}
		
		
		
		//List<WebElement> allHeadersItems = eu.getElement(fashionTab)
		
		
		
		
		driver.quit();
		
	}
	
	
	public static List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);
	}

}
