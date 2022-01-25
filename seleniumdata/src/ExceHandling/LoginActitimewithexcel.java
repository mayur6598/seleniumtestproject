package ExceHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class LoginActitimewithexcel extends SeleniumUtils {
	String appUrl, userName, password,expectedTitle;
	WebDriver driver;
	@Test
	public String readTestData(String fileName,String sheetName,int rowNum,int cellNum) throws IOException {
				//1. File location
				FileInputStream fis=new FileInputStream(fileName);
				//2. Create an instance of required workbook
				Workbook workbook=new XSSFWorkbook(fis);
				//3. get sheet
				Iterable<Row> sheet = workbook.getSheet(sheetName);
				//4. get row
				Row row=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rowNum);
				//5. cell operation
				return row.getCell(cellNum).getStringCellValue();	
	}
	@BeforeTest
	public void getAppData() throws IOException {
		appUrl=readTestData(".\\testdata\\My excel.xlsx", "Logindetails", 1,0);
		userName=readTestData(".\\testdata\\My excel.xlsx", "Logindetails", 1,1);
		password=readTestData(".\\testdata\\My excel.xlsx", "Logindetails", 1,2);
		expectedTitle=readTestData(".\\testdata\\My excel.xlsx", "Logindetails", 1,3);
	}
	@BeforeMethod
	public void setUp() {
			driver=setUp("chrome", appUrl);
	}

@Test
public void loginIntoActitimeApp() throws InterruptedException {
	driver.switchTo().activeElement().sendKeys(userName,Keys.TAB);
	driver.switchTo().activeElement().sendKeys(password,Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.id("logoutLink")).click();
	Assert.assertEquals(driver.getTitle().trim(), expectedTitle.trim(), "Either Actitime home page title got changed or page is not loaded properly");
}}