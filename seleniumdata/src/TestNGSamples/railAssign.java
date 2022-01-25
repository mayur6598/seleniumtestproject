package TestNGSamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.SeleniumUtils;

public class railAssign extends SeleniumUtils  {

	
		@Test
		public void testWindow() throws InterruptedException{
			driver= setUp("chrome","https://etrain.info/in");
			System.out.println("Home window currentURL: "+driver.getCurrentUrl());
			//to get current window id
			String homeWinId=driver.getWindowHandle();
			System.out.println("Home window id: "+homeWinId);
	
	      //click reservation rule
	      driver.findElement(By.xpath("//a[text()='Reservation Rules']")).click();
	      //click services
	     Thread.sleep(2000); 
	    driver.findElement(By.xpath("//a[text()='Services']")).click();
	    
	      driver.findElement(By.xpath("//a[text()='SMS Service']")).click();
	}

}
