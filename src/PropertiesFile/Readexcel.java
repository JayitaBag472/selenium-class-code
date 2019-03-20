//getCelldata,setcelldata, total rows,total columns
// xlxs- XSSF
//xls- HSSF

package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFEvaluationWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Readexcel {
	
	public static void main(String args[]) throws IOException{
		
		System.out.println(System.getProperty("user.dir"));
	
	FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"\\src\\PropertiesFile\\Testdata.xls");
	HSSFWorkbook wb = new HSSFWorkbook(f);
	HSSFSheet sheet = wb.getSheetAt(0);
	HSSFRow  row = sheet.getRow(0);
	String user=row.getCell(0).getStringCellValue();
	
	System.out.println(user);
	
	
	
	}
	}


