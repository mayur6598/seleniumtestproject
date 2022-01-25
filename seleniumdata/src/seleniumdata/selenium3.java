package seleniumdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
     WebDriver s=new ChromeDriver();
     
     System.setProperty("webdriver.gecko.driver",".\\executable\\geckodriver.exe");
     WebDriver h=new FirefoxDriver();
	}

}
