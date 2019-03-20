//throw : only used for checked exception
// throws for exception handle
// throw- intentioanly throw exception

package Exception;

import java.io.File;
import java.io.IOException;

public class Test6 {
	
	public static void main (String args[]) throws Exception{
		int a=10;
		int b=0;
		int c=0;
		
		Test6 t= new Test6();
		try{
		 t.method1(a,b);
		 System.out.println("dasdas");
		}
		catch(IOException e){
			System.out.println("sadasd");
		}
		finally{
			System.out.println("finally");
		};
		//t.method2("");
		try {
		 c= a/b;
		}
		catch(Exception e){
		
		//System.out.println(e.getMessage());
			throw new Exception();
	}
		


		}
	
	public int method1(int a,int b) throws IOException{
	
	try{
		
		return a/b;}
	catch(Exception e) {
		
		throw new ArithmeticException("sadfsdf");
	}
	}
	
	public void method2(String Filepath) throws IOException {
		File f= new File(Filepath);
		
		//try{
		f.createNewFile();
	//}
		//catch(Exception e){
			//System.out.println("");}
		}
}

