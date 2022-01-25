package seleniumdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.gmail.com");
      driver.manage().window().maximize();
      
      //driver.findElement(By.id("identifierId")).sendKeys("mayurp4164@gmail.com");
      //driver.findElement(By.className("V67aGc")).click();
      String a=driver.getTitle();
      System.out.println("title is:-"+a);
      String b="gmail";
      driver.close();
      if(a.equalsIgnoreCase(b))
      {
    	  System.out.println("test successful");
      }
      else
      {
    		  System.out.println("test unsucessful");
      }
    	  }
      }
      
	
      
      
    