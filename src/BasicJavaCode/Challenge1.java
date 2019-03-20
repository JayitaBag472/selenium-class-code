package BasicJavaCode;

public class Challenge1 {
	public static void main(String args[]){
		int a=4;
		int b=20;
		int evenNumbersFound = 0 ;
		while(a<=b){
			a++;
			if(!isEvenNumber(a)){
				continue;
			}
			 System.out.println("even number"+a);
			evenNumbersFound++;
		    if(evenNumbersFound>=5){ 
		    	break;
			}
		   
		}
		System.out.println(" total even number"+evenNumbersFound);
		}
	
	
		
		
		
	    	
	    	
		
		
	
	public static boolean isEvenNumber(int count){
		/*while( count% 2 == 0){
	    	System.out.println("value is even number " +count);
	    	return true;
	 }
		
		System.out.println("value is odd number"+count);
		return false;
		
		
	}*/
		if( count% 2 == 0){
			
	    	return true;
	 }
		
		
		return false;
	}
	

}
