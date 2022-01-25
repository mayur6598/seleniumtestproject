package seleniumdata;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	//Open url
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> catOptions=driver.findElements(By.cssSelector("div[id='nav-xshop-container']>div>a"));
		System.out.println("option count:"+catOptions.size());
		for (int i=0;i<catOptions.size();i++) {
			System.out.println(catOptions.get(i).getText());
		}
	}

}
