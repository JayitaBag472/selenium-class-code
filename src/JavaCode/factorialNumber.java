package JavaCode;

public class factorialNumber {
	
	
	public static  int factorial(int number){
		
		
		int fact=1;
		
		if(number==0)
			return 1;
		
		for(int i=1;i<=number;i++){
		
		fact =fact*i;
		
	
		}
		return fact;
		
		
	}
	
	
	
	public static void main(String[] args){
		
		System.out.println(factorial(1));
		System.out.println(factorial(0));
		System.out.println(factorial(4));
		System.out.println(factorial(10));
		
	}

}
