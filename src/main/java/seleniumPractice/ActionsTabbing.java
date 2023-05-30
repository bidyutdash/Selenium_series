package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabbing {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register?");
//		By firstName = By.id("input-firstname");
//		WebElement element = driver.findElement(firstName);
		Actions act = new Actions(driver);
//		
//		act.sendKeys(element, "bidyut")
//		.sendKeys(Keys.TAB)
//		.sendKeys("Dash")
//		.sendKeys(Keys.TAB)
//		.sendKeys("bd@test.com")
//		.sendKeys(Keys.TAB)
//		.sendKeys("12345678").build().perform();
		
		driver.get("https://www.amazon.com/");
		act.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Iphone 14")
		.sendKeys(Keys.ENTER)
		.build().perform();
		
		
		
		
		//driver.quit();

	}

}
