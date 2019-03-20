package BasicJavaCode;

public class User1 {
	
	public static void main (String args[]){
		
		Shopping user1 = new Shopping("admin", "COD","pune","Jayita");
		
		// instance variables
		user1.userName= "jay";
		user1.paymentMode = "debit";
	user1.address= "delhi";
	user1.UserLoginId = "iit";
		
		
		
		user1.placeOrder(1,"C001");
		boolean status=user1.cancelOrder(0);
		{
			if(status)
			{
				System.out.println("Order cancelled successfully");
			}else
			{
				System.out.println("NO order");
			}
			
			
		}
		 Shopping user2= new Shopping();
		 user1.userName= "Arup";
		 user1.paymentMode = "CreditCard";
		 user1.address= "Kolkata";
		 user1.UserLoginId = "Adak";
		 
		user2.placeOrder(2,"D009");
		boolean status1=user1.cancelOrder(1);
		{
			if(status)
			{
				System.out.println("Order cancelled successfully");
			}else
			{
				System.out.println("NO order");
			}
			
			
		}
		
		
	}

}
