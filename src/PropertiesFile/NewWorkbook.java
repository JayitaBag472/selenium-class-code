package PropertiesFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

public class NewWorkbook {
	
	public static void main (String args[]) throws FileNotFoundException, IOException{
		
		
		Workbook wb = new HSSFWorkbook();
		
		org.apache.poi.ss.usermodel.Sheet sheet1 = wb.createSheet("new sheet");
	    org.apache.poi.ss.usermodel.Sheet sheet2 = wb.createSheet("second sheet");

	    
	    
	        
	        String NewWorkbook = WorkbookUtil.createSafeSheetName("[O'Brien's sales*?]"); 
	        org.apache.poi.ss.usermodel.Sheet sheet3 = wb.createSheet(NewWorkbook);

	        try  (OutputStream fileOut = new FileOutputStream("C:\\Users\\ejaybag\\Desktop\\Day1\\src\\PropertiesFile\\workbook.xls")) {
		        wb.write(fileOut);
	        }
	                         
	    }

	}


