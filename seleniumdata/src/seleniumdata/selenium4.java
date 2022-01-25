package seleniumdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium4 {

	public static void main(String[] args) {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Open url 
		 driver.get("https://demo.actitime.com/");
		 //get page title
		 System.out.println("page title name is:"+driver.getTitle());
		 
		 WebElement userNameInputField=driver.findElement(By.id("username"));
		//Enter user name in Field
		userNameInputField.sendKeys("trainee");
		 //locate Passward field
		WebElement passwardInputField=driver.findElement(By.name("pwd"));
		passwardInputField.sendKeys("trainee");
		//login 
//		WebElement loginButton=driver.findElement(By.id("loginButton"));
//		loginButton.click();
//	   // driver.close();
	}

}
