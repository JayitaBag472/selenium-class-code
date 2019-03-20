package Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class Test3 {
	
	public static void main(String args[])
	{
		Test3 t = new Test3();
	    t.CreateFile("Testfile.txt");
	}

	public void CreateFile(String filename)
	{
		File f= new File(filename);
		try {
			//f.createNewFile();
			FileWriter fw= new FileWriter(f,true);
			BufferedWriter bf= new BufferedWriter(fw);
			bf.write("Testing");
			bf.newLine();
			bf.write("Testing 3");
			bf.newLine();
			bf.write("Testing 4");
			bf.newLine();
			bf.flush();
			bf.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not present at mentioned location");
		}
		
		
	}
	
}
