package seleniumdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     //open url
     String  p=("https://demo.actitime.com/login.do");
     driver.get("https://demo.actitime.com/");
     //Get Page Title name
     String a=driver.getTitle();
     System.out.println("page title name is:"+driver.getTitle());
     int b=a.length();
     System.out.println("page title length is:"+b);
     //get page url
     String c=driver.getCurrentUrl();
     System.out.println("we have opn:"+p);
     System.out.println("we have opned:"+c);
     System.out.println("url is:"+c);
  
     if (p==c)
     {
    	 System.out.println("correct url open");
     }
     else
     {
    	 System.out.println("wrong url open");
     }
     }
     }
