package seleniumdata;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get("https://www.demoblaze.com/");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     
	     List<WebElement>device=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h4>a"));
	     List<WebElement>price=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h5"));
	     System.out.println("device count:"+device.size());	
	     System.out.println("price:"+device.size());	
			
	        for (int i=0;i<device.size();i++) {
	        	  for (int j=0;j<price.size();i++) {
	      	System.out.println("device:"+device.get(i).getText()+"... "+price.get(i).getText());
	    
	      	
	      Thread.sleep(5000);
	      
	      WebElement next=driver.findElement(By.id("next2"));
	      	if (next.isDisplayed()) {
      	  next.click();
      	}else {
      		break;
		        }
	      	List<WebElement>device1=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h4>a"));
		     List<WebElement>price1=driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h5"));
		     System.out.println("device count:"+device1.size());	
		     System.out.println("price:"+device1.size());	
				
		     for (int k=0;k<device.size();k++) {
	        	  for (int l=0;l<price.size();k++) {
	      	System.out.println("device:"+device1.get(k).getText()+"... "+price1.get(l).getText());
	    
	        	  }}}}}}
  
