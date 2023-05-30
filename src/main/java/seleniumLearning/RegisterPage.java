package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	
	
	public static void main(String[] args) {
		WebDriver driver =null;
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPass = By.id("input-confirm");
		By privacyPolicy = By.name("agree");
		By submitBtn = By.xpath("//input[@type='submit']");
		
		BrowserUtil bu = new BrowserUtil();
		ElementUtil eu = new ElementUtil(driver);
		driver =  bu.initDriver("chrome");
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		System.out.println(bu.getPageTitle());
		
		
		
		
		eu.doSendKeys(firstName, "Test");
		eu.doSendKeys(lastName, "User");
		eu.doSendKeys(email, "testuser@lab.com");
		eu.doSendKeys(telephone, "+124267856542");
		eu.doSendKeys(password, "nalab123");
		eu.doSendKeys(confirmPass, "nalab123");
		eu.doClick(privacyPolicy);
		eu.doClick(submitBtn);
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
		
	}
	

}
