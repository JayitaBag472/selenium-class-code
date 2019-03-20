package BasicJavaCode;

public class VIPcustomer {
	
	String name;
	int creditlimit;
	String email;
	
	public VIPcustomer(){
		this("jayita",8000,"jayita.bag@gmail.com");
		
	}
	
	public VIPcustomer(String name, int creditlimit){
		this(name,creditlimit,"jkas@gmail.com");
	}

	public VIPcustomer(String name, int creditlimit , String email) {
		this.creditlimit= creditlimit;
		this.name=name;
		this.email=email;
	}

	public int getcreditlimit() {
		return creditlimit;
	}
	
	public String getname(){
		
		return name;
	}
         public String getemail(){
        	 return email;
         }
}
