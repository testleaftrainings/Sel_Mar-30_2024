package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {

	public static void main(String[] args) throws IOException {
		/*
		 * Step1-> Set path for workbook 
		 * step2-> Get into the sheet 
		 * Step3-> Get into Row values 
		 * Step4-> Get into cell values
		 *  Step5-> Read Data from workbook and print
		 * Step6-> close the workbook
		 */
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//number of row
		int rowcount = sheet.getLastRowNum();
		System.out.println("row count : "+rowcount);
		
		//include the header part
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("It will take all rows present : "+physicalNumberOfRows);
		
		//number of cells
       int cellcount = sheet.getRow(1).getLastCellNum();
       System.out.println("total cells : "+cellcount);
       
       //index-0 is header part
       for (int i = 1; i <=rowcount; i++) {
    	   
    	   for (int j = 0; j < cellcount; j++) {
			
    		   String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
    		   System.out.println(stringCellValue);
		}
		
	}
       
       //close
       wb.close();
	}

}
