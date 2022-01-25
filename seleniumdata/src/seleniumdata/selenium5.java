package seleniumdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		//Open ur
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		//locateusername
	  driver.findElement(By.name("UserName")).sendKeys("execution");
	   
	 driver.findElement(By.name("Password")).sendKeys("admin");
	  
	WebElement LoginInputField=driver.findElement(By.name("Login"));
	LoginInputField.click();
	}

}
