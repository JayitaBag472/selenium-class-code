package BasicJavaCode;

public class Car1 {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model){
		String valueModel = model.toLowerCase();
		if((valueModel.equals("abcd"))||(valueModel.equals("efgh"))){
		this.model = model;
		}
	else{
		this.model = "xyz";
	}
	}
	public String getModel(){
		return this.model;
	}

	
	
	

}
