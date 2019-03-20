package AccessModifier;

import BasicJavaCode.Class1;

public class Class2 extends Class1{
	
	public static void main (String args[]){
	
	Class1 obj = new Class1();
	obj.b=30;
	obj.test2();
	
	Class2 cl= new Class2();
	cl.test4();
	cl.d=40;
	
	

}
}
