package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookprop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\testdata\\demo.properties");
		Properties pro=new Properties();
		pro.load(fis);
		//4) read reqired data of prop file based on key defined file
		String url=pro.getProperty("appUrl");
	     String Uname=pro.getProperty("username");
      	String pwd=pro.getProperty("passward");
        WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     //full screen
	     driver.manage().window().maximize();
	     driver.get(url);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      	
      	driver.findElement(By.id("email")).sendKeys("9765908379");
    	driver.findElement(By.id("pass")).sendKeys("mayur@98");
    	driver.findElement(By.name("login")).click();
      	
	}

}
