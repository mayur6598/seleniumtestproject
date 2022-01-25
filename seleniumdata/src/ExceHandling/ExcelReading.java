package ExceHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class ExcelReading {
	@Test
	public void getSheetName() throws FileNotFoundException, IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testdata\\My excel.xlsx");
		// 2. Create an instance of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 3. perform operation on sheet
		int sheetCount = workbook.getNumberOfSheets();// give you sheet count present inside excel
		System.out.println("Sheet count: " + sheetCount);
		System.out.println("Active sheet index: " + workbook.getActiveSheetIndex());
		for (int i = 0; i < sheetCount; i++) {
			System.out.println(workbook.getSheetName(i));
		}
		// to get specific sheet
		XSSFSheet sheet = workbook.getSheet("Logindetails");
	}

	@Test
	public void getCellOperation() throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\testdata\\My excel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Logindetails");
		
		XSSFRow row = sheet.getRow(0);
		//5. cell operation
		System.out.println("Cell count in row-0: " + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {
			System.out.print(row.getCell(i).getStringCellValue() + "");
		}
	}
	@Test
	public void getDifferentCellValues() throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\testdata\\My excel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Logindetails");
		
		XSSFRow row = sheet.getRow(1);
		
		System.out.println("Cell count in row-2: " + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {

			XSSFCell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println((int) cell.getNumericCellValue());
				break;
			case BLANK:
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			default:
				throw new RuntimeException("There is no support for this type of cell");
			}
		}
	}

     @Test
     public void updatedata() throws IOException {

 		FileInputStream fis = new FileInputStream(".\\testdata\\My excel.xlsx");
 		
 		XSSFWorkbook workbook = new XSSFWorkbook(fis);
 		
 		XSSFSheet sheet = workbook.getSheet("Logindetails");
 		
 		XSSFRow row = sheet.getRow(1);
 		System.out.println("Cell count in row-2: " + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {
        Row row1=sheet.getRow(i);
        int cellcount=row.getLastCellNum()-0;
        row.createCell(cellcount).setCellValue(false);
        //to write content into files user below sheet
        FileOutputStream fos=new FileOutputStream(".\\testdata\\My excel.xlsx");
        workbook.write(fos);
        fos.flush();
        fos.close();
     }
}}