package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Script {
	
	public static void main(String args[]) throws IOException{
		
		Properties p =new Properties();
		FileInputStream f= new FileInputStream("C:\\Users\\ejaybag\\Desktop\\Day1\\src\\PropertiesFile\\OP.properties");
	
  p.load(f);
  
  System.out.println(p.getProperty("name" ));
  
  
	
	}

}