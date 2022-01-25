package seleniumdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Open url
		driver.get("https://www.google.com");
		//current url web page
		System.out.println("Current url of web page is:"+driver.getCurrentUrl());
		
		WebElement qInputField=driver.findElement(By.name("gLFyf gsfi"));
		qInputField.sendKeys("htttps://www.facebook.com");
	
		//source of current web page
		//System.out.println("Source of current web page is:"+driver.getPageSource());
		//driver.close();
	}

}
