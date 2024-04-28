package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataToTestCase {

	
	//step4 -retain static keyword n remove String agrs and change method name
	//static-it will have common reference all testcase
	public static String[][] excelSheet() throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		
		int rowcount = sheet.getLastRowNum();
		
       int cellcount = sheet.getRow(1).getLastCellNum();
       
       //step 1
       String[][] data=new String[rowcount][cellcount];
       
       
       for (int i = 1; i <=rowcount; i++) {
    	   
    	   for (int j = 0; j < cellcount; j++) {
			
    		   String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
    		   
    		   
    		   //step 2
    		   data[i-1][j]=stringCellValue;
    		   //data[0][0]	==correct one
    		   //data[1][0]=its wrong
    		   }
		
}
       
       wb.close();
       
       //step 3
       return data;
       }
	}
