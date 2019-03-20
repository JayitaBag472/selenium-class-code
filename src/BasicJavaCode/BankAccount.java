package BasicJavaCode;

public class BankAccount {
	private int accountNumber;
	public int  Balance;
	private String custName;
	private String email;
	private int phoneNumber;
	
	public BankAccount(){
		this(18923,8907,"ayan","ayan@gmail.com",78906);
		System.out.println("empty bank account");
		//this(18923,8907,"ayan","ayan@gmail.com",78906);
	}
	
	public BankAccount(int accountNumber,int  Balance,String custName,String email,int phoneNumber){
		this.accountNumber = accountNumber;
		this.Balance= Balance;
		this.custName=custName;
		this.email=email;
		this.phoneNumber=phoneNumber;
		
	} 
	
	public BankAccount(String custName,String email,int phoneNumber){
		this(90909,67890,custName,email,phoneNumber);
		
	}
	
	public void deposit(int depositBalance){
		this.Balance += depositBalance; 
		System.out.println("deposit amount" +this.Balance);
		
	}
	
	public void withdraw(int withdrawBalance){
     if(Balance - withdrawBalance<=0){
		System.out.println("balance avilable"+this.Balance);
	}else{
		Balance -= withdrawBalance;
		System.out.println("left balance avilable" +this.Balance);
		
	}
	}
	
	public void setaccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
		System.out.println("accountNumber="+this.accountNumber);
		}
	public int getaccountNumber(){
		return this.accountNumber ;
	}
	
	public void setBalance(int Balance){
		System.out.println("balance="+this.Balance);
	}
	public int getBalance(){
		return this.Balance;
	}
	
	public void setcustName(String custName){
		this.custName = custName;
		System.out.println("customer name" +custName);
	}
	public String getcustName(){
		return this.custName;
	}
	
	public void setemail(String email){
		this.email = email;
		System.out.println("email"+email);
	}
	public String getemail(){
		return this.email;
	} 
	
	public void setphoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
		System.out.println("phoneNumber"+phoneNumber);
	}
	public int getphoneNumber(){
		return this.phoneNumber;
	}
	
	
	

}
