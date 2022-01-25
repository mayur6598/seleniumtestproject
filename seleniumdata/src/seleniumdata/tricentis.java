package seleniumdata;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tricentis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	//Open url
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> catOptions=driver.findElements(By.cssSelector("ul[class='top-menu']>li>a"));
		System.out.println("options count:"+catOptions.size());
		for (int i=0;i<catOptions.size();i++) {
			//WebElement option=catOptions.get(i);
			//System.out.println(option.getText());
			//or
			System.out.println(catOptions.get(i).getText());		
		}}}
