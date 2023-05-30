package seleniumPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ref=nav_logo");
		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.PAGE_DOWN)
//		.pause(1000)
//		.sendKeys(Keys.PAGE_DOWN)
//		.pause(1000)
//		.sendKeys(Keys.PAGE_DOWN)
//		.pause(1000)
//		.sendKeys(Keys.PAGE_UP)
//		.pause(1000)
//		.sendKeys(Keys.PAGE_UP).build().perform();
		
		//scroll to footer & header
		actions.sendKeys(Keys.COMMAND).sendKeys(Keys.END)
		.pause(2000)
		.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
		
		actions.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();

	}

}
