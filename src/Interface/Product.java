package Interface;

public class Product implements Blueprint,Test {
	
	public void search(){
		System.out.println("Serach");
	}
	
	public void addToCart(){
		System.out.println("Add to cart");
		
	}
	
	public  void payment(){
		System.out.println("payment");
	}
	public void CustomerDeatils(){
		System.out.println("CustomerDeatils");
	}
	public  void checkout(){
		System.out.println("checkout");
	}
	public void complaint(){
		System.out.println("complaint");
	}

	public void test(){
		System.out.println("test");
	}
	
	

}
