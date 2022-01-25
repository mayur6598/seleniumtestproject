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

public class propertiesfile {
	public static void main(String[] args) throws IOException {
		//1) create instance of fileinputstream
		FileInputStream fis=new FileInputStream(".\\testdata\\appdata.properties");
		//2)create instance of prop. class
		Properties pro=new Properties();
		//3)call load() method of prop class and pass file input stream args 
		pro.load(fis);
		//4) read reqired data of prop file based on key defined file
	     String url=pro.getProperty("appUrl");
	     String title=pro.getProperty("LoginPageTitle");
         String uname=pro.getProperty("username");	
	     String pwd=pro.getProperty("passward");
	  
		//step 1 opn browser
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     //full screen
	     driver.manage().window().maximize();
	     driver.get(url);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       driver.findElement(By.id("txtUsername")).sendKeys(uname);
       driver.findElement(By.id("txtPassword")).sendKeys(pwd);
       driver.findElement(By.id("btnLogin")).click(); 
	}
	}