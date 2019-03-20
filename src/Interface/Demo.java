package Interface;

public class Demo {

	public static void main(String args[]){
		
		Blueprint sp =new Product();
		sp.search();
		sp.addToCart();
		sp.payment();
		sp.CustomerDeatils();
		sp.checkout();
		sp.complaint();
		
		Product p = new Product();
		sp.search();
		sp.addToCart();
		sp.payment();
		sp.CustomerDeatils();
		sp.checkout();
		sp.complaint();
		
		Test t = new Product();
		t.test();
		
	}
	
}
