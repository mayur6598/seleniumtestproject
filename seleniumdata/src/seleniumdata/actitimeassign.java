package seleniumdata;

import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actitimeassign {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     System.out.println("page title:-"+driver.getTitle());
	     //login page 
	 driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.id("loginButton")).click();
	     //click task option
 driver.findElement(By.cssSelector("td[class='navItem preventPanelsHiding navCell relative notSelected']>a")).click();
   //validate task page
 String expectedurl=("https://demo.actitime.com/tasks/tasklist.do");
 String Url=driver.getCurrentUrl();
  if(Url.equalsIgnoreCase(expectedurl))
   {
	   System.out.println("The Correct url is open");}
	   else {
		   System.out.println("incorrect url open");
	   }
 //click add new button
 driver.findElement(By.cssSelector("div[class='addNewButton']")).click();
   //select customer
 driver.findElement(By.cssSelector("div[class='item createNewTasks']")).click();
   Thread.sleep(2000);
   //drop down click 
driver.findElement(By.xpath("//div[@class='customerProjectSelectorPlaceholder']//div[3]")).click();
  //select text from dropdown
driver.findElement(By.cssSelector("div[class='comboboxButton focused'] input[type='text']")).sendKeys("Galaxy Corporation");
  //select text galaxy corp
  Thread.sleep(3000);
 driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[contains(@class,'itemRow cpItemRow ')]")).click();
   Thread.sleep(3000);
     //click project button
  driver.findElement(By.cssSelector("div[class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer'] div[class='dropdownButton']")).click();
	  //Enter project
  driver.findElement(By.cssSelector("div[class='comboboxButton focused'] input[type='text']")).sendKeys("Android testing");
	  //click project text
 driver.findElement(By.xpath("//span[normalize-space()='testing']")).click();
	  
	   
//	 //enter task name testing
 driver.findElement(By.cssSelector("td[class='nameCell first']>input")).sendKeys("Testing");
	 //work name
driver.findElement(By.xpath("//div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[2]/div[1]")).click();
driver.findElement(By.xpath("//div[@class='dropdownContainer components_typeOfWorkMenu typeOfWorkEditorMenu addNewTasks']/div[1]/div[1]/div[1]/div[1]"));
driver.findElement(By.xpath("//tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]")).click();
		
	//create task
	   driver.findElement(By.xpath("//div[contains(text(),'Create Tasks')]")).click();
	   //validate task is created correct or not
	   Thread.sleep(2000);
	   String Title=("actiTIME - Task List");
          System.out.println("Expected Title:"+Title);
          System.out.println("Page Title:"+driver.getTitle());
	  System.out.println(Title.equals(driver.getTitle()));
	   Thread.sleep(2000);
	  //select testing path
	   driver.findElement(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td[1]/div[1]/div[1]")).click();
	   Thread.sleep(2000);
	   //click dlt buttom
	   driver.findElement(By.xpath("//div[@class='bulkOperationsPanel']/div[6]")).click();
	   Thread.sleep(2000);
	   //click confirm dlt 
	   driver.findElement(By.xpath("//*[text()='Delete permanently']")).click();
	   
//	   //validate testing task dlt or not
//	   String testingtask=("testing");
//	   String task1=driver.getCurrentUrl();
//	   if(task1.equalsIgnoreCase(testingtask))
//	   {
//		   System.out.println("The Testing task is deleted");}
//		   else {
//			   System.out.println("Task not deleted");
//		   }
	   Thread.sleep(2000);
	   WebElement logout=driver.findElement(By.id("logoutLink"));
	   logout.click();
	   Thread.sleep(2000);
	driver.close();
	   
	   
	   
		}
	  }
	

