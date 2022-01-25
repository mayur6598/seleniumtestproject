package seleniumdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		//Open url
		driver.get("https://www.facebook.com");
		//actual title 
		String p=driver.getTitle();
		System.out.println("Home page title name is:"+p);
		//expected title is
		String expected_title=driver.getTitle();
		String expected_title1="Facebook – log in or sign up";
		//locate usename field
		driver.findElement(By.id("email")).sendKeys("9765908379");
		
		//locate pass field
		driver.findElement(By.name("pass")).sendKeys("mayur@98");
		
		//login buttom press
		//WebElement loginInputField=driver.findElement(By.name("login"));
		//loginInputField.click();
		//driver.close();
		 }
	}
