package BasicJavaCode;

public class Shopping {
	
	String userName;
	String UserLoginId;
	String paymentMode;
	String address;
	public Shopping (String userName,String UserLoginId,String paymentMode, String address){
		
		this.userName=userName;
		this.UserLoginId=UserLoginId;
		this.paymentMode= paymentMode;
		this.address= address;
	}
	
	public Shopping(){
		
	}

		
	public static void main (String args[]){
		
	}
		
		public String placeOrder(int quantity, String itemCode)
		{
			System.out.println("User"+userName+"login in with"+UserLoginId+"login id");
			return itemCode+""+quantity+""+paymentMode+""+address;
		}
		
		public boolean cancelOrder(int orderId)
		{
			System.out.println("User"+userName+"is canceling the order from "+UserLoginId+"login id");
			if (orderId>0)
			{
				return true;
			}
			else
			{
				return false;
				
			}
		}
		
		
	}

