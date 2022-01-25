package seleniumdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/login.do");
     
     
     //imlicit wait
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     System.out.println("page title:-"+driver.getTitle());
     //locate username
     driver.findElement(By.id("username")).sendKeys("admin");
     //locate Passward
     driver.findElement(By.name("pwd")).sendKeys("manager");
     //locate login button
     driver.findElement(By.id("loginButton")).click();
     //identify logout button and  click
     driver.findElement(By.id("logoutlink")).click();
     }

}
