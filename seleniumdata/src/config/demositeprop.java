package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demositeprop {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\testdata\\demosite.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		String url=pro.getProperty("appUrl");
		String fname=pro.getProperty("Firstn");
		String lname=pro.getProperty("Lastn");
		String address=pro.getProperty("Address");
		String email=pro.getProperty("Email");
		String Phone=pro.getProperty("Phoneno");
		String Pass=pro.getProperty("passward");
		//step 1 opn browser
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     //full screen
	     driver.manage().window().maximize();
	     driver.get(url);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
      driver.findElement(By.cssSelector("div[class='col-md-4 col-xs-4 col-sm-4']>input")).sendKeys(fname);
      driver.findElement(By.cssSelector("div[class='col-md-4 col-xs-4 col-sm-4']>input[placeholder='Last Name']")).sendKeys(lname);
      driver.findElement(By.cssSelector("div[class='col-md-8 col-xs-8 col-sm-8']>textarea")).sendKeys(address);
      driver.findElement(By.cssSelector("div[class='col-md-4 col-xs-4 col-sm-4']>input[type='email']")).sendKeys(email);
      driver.findElement(By.cssSelector("div[class='col-md-4 col-xs-4 col-sm-4']>input[type='tel']")).sendKeys(Phone);
      driver.findElement(By.name("radiooptions")).click();
      driver.findElement(By.id("checkbox1")).click();
     WebElement SkillDropdown=driver.findElement(By.id("Skills"));
      Select skillSelect=new Select(SkillDropdown);
      skillSelect.selectByIndex(2);
      WebElement SkillDropdown1=driver.findElement(By.id("country"));
      Select skillSelect1=new Select(SkillDropdown1);
      skillSelect1.selectByIndex(5);
      WebElement SkillDropdown2=driver.findElement(By.id("yearbox"));
      Select skillSelect2=new Select(SkillDropdown2);
      skillSelect2.selectByValue("1998");
      
      WebElement SkillDropdown3=driver.findElement(By.id("daybox"));
         Select skillSelect3 = new Select(SkillDropdown3);
         skillSelect3.selectByValue("6");
      
      
      driver.findElement(By.id("firstpassword")).sendKeys("passward");
      driver.findElement(By.id("secondpassword")).sendKeys("passward");
      driver.findElement(By.id("submitbtn")).click();
	}

}
