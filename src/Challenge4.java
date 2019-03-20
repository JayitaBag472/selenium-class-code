
public class Challenge4 {
	
	public static void main(String args[]){
		
		double highCentimeters=calcFeetAndInchesToCentimeters(10,20);
		System.out.println("fith parameter"+highCentimeters);
                  
		
		highCentimeters=calcFeetAndInchesToCentimeters(30);
		System.out.println("sixth parameter"+highCentimeters);
		
		highCentimeters=calcFeetAndInchesToCentimeters();
		System.out.println("seventh parameter"+highCentimeters);
		
	}
	
	public static double calcFeetAndInchesToCentimeters( double feet,double inches){
		
		
		if(feet>=0){
			System.out.println("Firstparameter" +feet);
			
		}else if(inches>=0 && inches<=12) 
		{
			System.out.println("secont parameter"+inches);
		
		}else{
			return -1;
		}

	
	double totalCentimeters = 2.54d* inches + 0.33* feet;
	System.out.println("total centimerters is="+totalCentimeters);
	return totalCentimeters;
	}

	

	
	public static double calcFeetAndInchesToCentimeters(double inches){
		
		if(inches>=0){
			System.out.println("third parameter" +inches);
			
		}
		
else{
			return -1;
		}
		
		double totalFeet =  inches/ 12;
		System.out.println("fourth parameter" +totalFeet);
		return totalFeet;
		
	}
	
	public static double calcFeetAndInchesToCentimeters(){
		return 5;
		
	}
	
	
	
	
	
	
	
	
}
	
