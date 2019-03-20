//run time exception and error- unchecked exception
// checked exception - io exception 

package Exception;

import java.io.*;

// Runtime Exception

public class Test5 {
	
	
	public static void main(String args[]) throws IOException{
		
		Test5 f= new Test5();
		f.CreateFile("Create file");
		//f.Create(path);
		//t.testing();
		
		
	}
	
	public void CreateFile(String filename) {
		
		File f = new File(filename);

		
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
		//catch(IOException e){
			//e.printStackTrace();
			//System.out.println("File not present at mentioned location" + e);
		
		//}
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
public void testing() throws ArithmeticException{
	int t;
	int a=10;
	int b=0;
	 t= a/b;
	System.out.println("Anand"+t);
}
}
