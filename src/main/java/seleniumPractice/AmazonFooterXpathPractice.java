package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonFooterXpathPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil2 browserUtil2 = new BrowserUtil2();
		driver = browserUtil2.initDriver("chrome");
		browserUtil2.launchURL("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/delhi-capitals-vs-mumbai-indians-16th-match-1359490/full-scorecard");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Delhi Capitals']/parent::span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		Thread.sleep(4000);
		System.out.println(getPlayersLocator("Lalit Yadav"));
		
		
		
		
		
		
		
		driver.quit();
		

	}
	
	
	public static String getPlayersLocator(String playerName) {
		WebElement element = driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td[contains(@class,'ds-items-center')]"));
		String text = element.getText();
		return text;
	}
	

}
