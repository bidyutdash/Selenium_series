package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonXpathPractice {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil2 browserUtil2 = new BrowserUtil2();
		driver = browserUtil2.initDriver("chrome");
		browserUtil2.launchURL("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		//span[contains(text(),'Back to top')]
	
		
		
		List<String > allHeaders =  getHeadersTitle();
		System.out.println(allHeaders.size());
		if(allHeaders.size()>0) {
			System.out.println(allHeaders);
		}
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
		List<String>  allText = getFootertext("Get to Know Us");
		if(allText.contains("About Amazon")) {
			System.out.println("PASS");
		}
		clickOnFooter("Sustainability","Get to Know Us");
		
		
		
		Thread.sleep(4000);

		
		
		
		
		
		
		
		
		
		driver.quit();
		
		

	}
	
	
	public static List<WebElement> getAmazonFooterLocator(String columnName) {
		List<WebElement> allFooter = driver.findElements(By.xpath("//div[contains(text(),'" + columnName + "')]/following-sibling::ul/li/a"));
		return allFooter;
	}
	
	
	public static void clickOnFooter(String linkName, String columnName) {
		List<WebElement> allFooter = getAmazonFooterLocator(columnName);
		for(WebElement e : allFooter) {
			if(e.getText().equals(linkName)) {
				e.click();
				break;
			}
			
		}
	}
	
	
	public static List<String> getFootertext(String columnName) {
		List<WebElement> allFooter = getAmazonFooterLocator(columnName);
		List<String> allFooterText = new ArrayList<String>();
		for(WebElement e : allFooter) {
			allFooterText.add(e.getText());			
		}
		return allFooterText;
	}
	
	
	public static List<WebElement> getHeadersLocator() {
		List<WebElement> allHeaders = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		return allHeaders;
	}
	
	public static List<String> getHeadersTitle() {
		List<WebElement> allHeaders = getHeadersLocator();
		List<String> headers = new ArrayList<>();
		for(WebElement e : allHeaders) {
			headers.add(e.getText());
		}
		return headers;
	}
	
	

}
