package BasicJavaCode;

public class Functions2 {
	
	
	public static void main(String args[])
	{
		method1("hello");
		String a ="abc";
		String b = "xyz";
		
		String s = "Jayita";
		System.out.println(s);
		
		method2 (a,b);
		int add= sum(10,20);
		System.out.println(add);
		
		int mul = mul (40,50,60);
		System.out.println(mul);
		
		int  m= 10;
		int n= 20;
		int o= 30;
		int p = 40;
		
		int q= sum(m,n,o);
		System.out.println(q);
		//System.out.println(s);
	}
	
	public static void method1( String str){
		System.out.println(str);
	}
	
	public static void method2 (String a, String b)
	{
		System.out.println(a+b);
	}
	
	
	/*Author:
	 * Date:
	 * Description:
	 * Param:
	 * Return:
	 * 
	 */

public static int  sum(int a,int c)
{
int  add = a+c;
return add;
}

public static int mul(int i ,int j , int k)
{
	int mul = i*j*k;
	return mul;
}
public static char  sum(int m,int n ,int o)
{
int  add = m+n+o;
return 's';
}

}


//static stuff--> static variable
//static method 

