package seleniumdata;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();	//Open url
				driver.get("https://www.flipkart.com/");
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				List<WebElement> catOptions=driver.findElements(By.cssSelector("div[class='_37M3Pb']>div>a"));
			System.out.println("options count:"+catOptions.size());
			for (int i=0;i<catOptions.size();i++) {
			System.out.println(catOptions.get(i).getText());
			}
	}

}
