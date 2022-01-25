package SwitchStatement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestNGSamples.Actitimetestng;
import io.github.bonigarcia.wdm.WebDriverManager;

public class actitest {
	@Test
  public void testgooglesearch() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("testing",Keys.ENTER);
		
	  
  }
  
}
