package BasicJavaCode;

public class MainBankAccount {
	
	public static void main(String args[]){
		
		BankAccount bobsAccount = new BankAccount();//(18923,8907,"ayan","ayan@gmail.com",78906);
		System.out.println(bobsAccount.getaccountNumber());
		System.out.println(bobsAccount.getBalance());
		System.out.println(bobsAccount.getcustName());
		System.out.println(bobsAccount.getemail());
		System.out.println(bobsAccount.getphoneNumber());
		
		bobsAccount.withdraw(100);
		
		bobsAccount.deposit(50);
		bobsAccount.withdraw(100);
		
		bobsAccount.deposit(51);
		bobsAccount.withdraw(100);
		
		bobsAccount.setaccountNumber(12345);
			
		
		bobsAccount.setBalance(1000);
		
		bobsAccount.setcustName("Jayita");
		
		bobsAccount.setemail("jayita.bag@gmail.com");
		
		bobsAccount.setphoneNumber(98902);
		
		BankAccount jayitaAccount = new BankAccount("jayita","jayita",8907);
		System.out.println(jayitaAccount.getaccountNumber()+"name"+jayitaAccount.getBalance());
		
		
			
	}

}
