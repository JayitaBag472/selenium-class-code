package BasicJavaCode;

public class ForLoop {
	public static void main(String args[]){
		
		
		/*for (double i = 2;i<=8;i++){
			
			System.out.println("interest amount"+ String.format("%.2f",calculateInterest(i)));
			
		}*/
		for (int i=8;i>=2;i--){
			
			System.out.println("interest amount"+ String.format("%.2f",calculateInterest(i)));
			
		}
		}
	
public static double calculateInterest(double interestRate ){
	return (10000 *(interestRate/100));
	
}
			
		
		
	}


