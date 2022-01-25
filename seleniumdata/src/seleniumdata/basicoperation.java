package seleniumdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicoperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	 driver.get("https://www.google.com");
		//current page title
		System.out.println("page title is:"+driver.getTitle());
		//System.out.println("page source is:"+driver.getPageSource() );
		System.out.println("current url is:"+driver.getCurrentUrl());
	}
}
       //https://opensource-demo.orangehrmlive.com/