package PropertiesFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewWorkBook1 {
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		
		Workbook wb = new XSSFWorkbook();
	    
	    try (OutputStream fileOut = new FileOutputStream("C:\\Users\\ejaybag\\Desktop\\Day1\\src\\PropertiesFile\\workbook1.xls")) {
	        wb.write(fileOut);

	}
	
	
	}}


