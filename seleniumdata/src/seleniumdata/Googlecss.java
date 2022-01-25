package seleniumdata;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlecss {

	private static int i;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	//Open url
		driver.get("https://www.google.co.in/?hl=hi");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java");
         
		List<WebElement>catOptions=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul[@class='G43f7e']/li"));
	System.out.println("options count:"+catOptions.size());
	for(int i=0;i<catOptions.size();i++) {
		System.out.println(catOptions.get(i).getText());
	}
	}
}
