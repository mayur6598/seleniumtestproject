package SwitchStatement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getscreenshot {
	public static void main(String[] args) throws IOException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
	File file=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,new File("./screenshots/GoogleSearchPage.jpg"));
		//Utils.getscreenshot(driver, "./screenshots/GoogleSearchPage2.png");
	}

}
