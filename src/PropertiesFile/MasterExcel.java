package PropertiesFile;

import org.apache.poi.ss.excelant.ExcelAntTest;

public class MasterExcel {
	
	ExcelApiTest eat = null;
	String xlFilePath= "C:\\Users\\ejaybag\\Desktop\\Day1\\src\\PropertiesFile\\Testdata.xls";
	
	public Object[][] testData(String xlFilePath,String sheetName) throws Exception
	
	{
		
		Object[][] excelData = null;
		ExcelTest eat = new ExcelTest(xlFilePath);
		
		int rows =eat.getRowCount(sheetName);
	    int columns = eat.getColumnsCount(sheetName);
				
		
		
	}
        
        
    }
    