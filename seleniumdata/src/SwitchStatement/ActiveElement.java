package SwitchStatement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class ActiveElement extends SeleniumUtils{
	 
	@Test
	public void testElements() throws InterruptedException{
		WebDriver driver= setUp("chrome","https://demo.actitime.com/login.do");
		//get the active element from the web page
		//Wheneven we want to verify the current curser position we use this statement.
		WebElement element=driver.switchTo().activeElement();
		String act=element.getAttribute("placeholder");
		//verifying username field
		Assert.assertEquals(act, "Username","By Default control is not in Username field");
		Thread.sleep(2000);
		element.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		driver.close();
	}
	@Test
	public void testGoogleSearch(){
		WebDriver driver= setUp("chrome","https://www.google.com");
		//get the active element from the web page
		driver.switchTo().activeElement().sendKeys("Selenium Testing", Keys.ENTER);
		driver.close();
	}
}