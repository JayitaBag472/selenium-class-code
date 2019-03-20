package BasicJavaCode;

public class Student {
	
	public static void main (String args[]){
		
		student("Manish","M", 46);
		student("Simran","M", 67, "Atos");
		int sum=add(10,20);
		System.out.println(sum);
		
		System.out.println(add(10,20,30));
		
		System.out.println(sum(1,2));
		
		
	}
	


	public static void student(String name,String string, int age){
		System.out.println("Student name is =" +name+",gender="+string+",age="+age);
		
	}
	public static void student(String name,String string, int age,String organization){
		System.out.println("Student name is =" +name+",gender="+string+",age="+age+",working in"+organization);
	}
	
	public static int add (int a,int b){
		return(a+b);
	}
	public static int add (int a, int b ,int c){
		return (a+b+c);
	}
	public static float sum(int a, int b){
		return (a+b);
		
	}
}

//1) function name should be same
//2) different number of parameters and data type
//3) return type should be other than void
//4 ) can change value of arguements 
