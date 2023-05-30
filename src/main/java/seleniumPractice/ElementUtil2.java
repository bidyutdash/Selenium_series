package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil2 {
	
	private WebDriver driver;

	public ElementUtil2(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
		if(value==null) {
			System.out.println("null vlaues are not allowed");
			throw new MySeleniumException("VALUECANNOTBENULL");
		}
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
			element = driver.findElement(locator);
			System.out.println("element is found with locator: " + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found using this locator..." + locator);	
			try {
				Thread.sleep(5000);//static wait  ---> dynamic wait- exp wait
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			element = driver.findElement(locator);
		}
		return element;
	}
	
	public void doClear(By locator) {
		getElement(locator).clear();
	}
	
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	
	public boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public String doGetAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
