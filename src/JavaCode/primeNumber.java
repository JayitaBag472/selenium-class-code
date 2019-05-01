package JavaCode;

public class primeNumber {
	public static void main(String[] args){
		
		//prime number is a number which can be divided by itself or 1
		// number is suppose 7 then take from 2,3,4,5,6 thats why taking number -1
		
		
		
		int number =9; 
		int temp=0;
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0)   //(2%2==0) then 1,(3%2 then remender not 0 ),(4%2=0)
			{
			temp =temp +1;
			}
		}
			if(temp>0){ // here temp value is greater than 0
				System.out.println("no is not prime"+number);
			}
			else{
			System.out.println("no is   prime"+number);
		}}
	}


