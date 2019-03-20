
// default=> within the package and same class
//public=> within the same package ,class and outside the package also
//protected => outside the package with inheritence
//private=> same class

package BasicJavaCode;

public class Class1 {
	
	private int a=10;
	
	public int b=20;
	
	int c=0;
	
	//protected
	protected  int d=0;
	
	
	public static void main(String args[]){
		
		Class1 obj= new Class1();
		
		obj.a=20;
		obj.test();
		obj.b=30; /// same class
		
		obj.test2();
		obj.c=30;
		obj.test3();
		
		obj.d=40;
		obj.test4();
	}
	
	//
	
	private void test(){
		System.out.println("private");
		
	
	}
	
	public void test2(){
		System.out.println("public");
		
	}
	
	void test3(){
		
		System.out.println("Default ");
	}
    
	protected void test4(){
		System.out.println("protected");
	}
}


