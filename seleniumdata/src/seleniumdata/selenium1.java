package seleniumdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
//     ChromeDriver cdriver=new ChromeDriver();
//      
//     System.setProperty("webdriver.ie.driver",".\\executable\\IEDriverServer.exe");
//     InternetExplorerDriver fdriver=new InternetExplorerDriver();
//      
        System.setProperty("webdriver.gecko.driver",".\\executable\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
//		
       	System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//current page title
		System.out.println("current page title:"+driver.getTitle());
	//	System.out.println("current page title:"+driver1.getPageSource());
	}

}
