package seleniumdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLogin {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			// full screen browser
			driver.manage().window().maximize();
			/** Step2: enter required URL */
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement Username=driver.findElement(By.cssSelector("div[style='position: relative; top: 210px; left: 655px; z-index:100;']>span"));
			String p1=Username.getText();
		System.out.println(p1);
			String[] splituser=p1.split(" ");
			System.out.println("index 0: "+splituser[0]);
			System.out.println("index 1: "+splituser[1]);
			System.out.println("index 2: "+splituser[2]);
			System.out.println("index 3: "+splituser[3]);
			
			driver.findElement(By.id("txtUsername")).sendKeys(Username.getText().split(" ")[3]);
			
			driver.findElement(By.cssSelector("div[style='position: relative; top: 210px; left: 655px; z-index:100;']>span"));
			driver.findElement(By.id("txtPassword")).sendKeys(Username.getText().split(" ")[7]);
			driver.findElement(By.id("btnLogin")).click();
			
	}

}
