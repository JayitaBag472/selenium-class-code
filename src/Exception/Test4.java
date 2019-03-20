package Exception;

import java.io.*;

public class Test4 {
	
	public static void main(String args[]){
		
		Test4 f= new Test4();
		f.CreateFile("Create file");
		
	}
	
	public void CreateFile(String filename){
		
		File f = new File(filename);
		try{
		
	f.createNewFile();
	
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
	
}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("File not present at mentioned location");
		
		}
	}
public void ReadFile(String filename){
	
	File f= new File(filename);
	
	try{
		FileReader fw= new FileReader(f);
		BufferedReader bf= new BufferedReader(fw);
		bf.readLine();
		//while(bf.readLine()!=null)//{
		System.out.println(bf.readLine());
			
		//}	
   bf.close();
   }
	
	catch(IOException e){
		e.printStackTrace();
		System.out.println("File not present at mentioned location");
	
	}

}
}
