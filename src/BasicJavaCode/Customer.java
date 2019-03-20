package BasicJavaCode;

public class Customer {
	
	public static  void main(String args[]){
		
		BankAccount a = new BankAccount();
		
		a.setaccountNumber(7890);
		System.out.println("Account number is" +a.getaccountNumber());
		a.setBalance(1000);
		System.out.println("Balance  is" +a.getBalance());
		a.setcustName("saikat");
		System.out.println("Customer Name is" +a.getcustName());
		a.setemail("jayita.bag@gmail.com");
		System.out.println("email id is" +a.getemail());
		a.setphoneNumber(9099);
		System.out.println("phone number is" +a.getphoneNumber());
		

		
			
		}
		
		
	     
	


	
	
   
}
