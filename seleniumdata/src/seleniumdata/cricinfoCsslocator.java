package seleniumdata;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfoCsslocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.espncricinfo.com/");
        driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
        
       List<WebElement>catOptions=driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li>a"));
        System.out.println("options count:"+catOptions.size());
        for(int i=0;i<catOptions.size();i++) {
        	System.out.println(catOptions.get(i).getText());
        }
	}

}
