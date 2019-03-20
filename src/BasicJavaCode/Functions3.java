package BasicJavaCode;

public class Functions3 {
	static int a = 10;
	static int b = 20;
	
	int c= 30;
	int d= 40;
	
	public static void main (String args[])
	{
		
	       int  e=add(a,b);
		System.out.println(e);
		Functions3 obj = new  Functions3();
		int sum = obj.sum(obj.c, obj.d);
		System.out.println(sum);
		
		
	}
	
	public  int sum (int c,int d)
	{
	int sum = c+d;
	return sum;
	}
	
	
	public static int add (int a,int b)
	{
	int add = a+b;
	return add;
	
}
}
