package BasicJavaCode;

public class PrimeNumber {
	
	public static void main(String args[]){
		
		int count =0;
		for (int i=10;i<=50;i++){
			if(isPrime(i)){
			count ++;
			System.out.println(i);
			if(count ==3){
				System.out.println("Exiting the loop");
				break;
			}
			}
		}
		
	}
	
	public static boolean isPrime(int n){
		if(n==1){
			return false;
			
		}
		for(int i=2;i<=n/2;i++){
			if(n%2==0){
				return false;
		}
	}return true;



}
}
