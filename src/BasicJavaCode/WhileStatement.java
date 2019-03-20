package BasicJavaCode;

public class WhileStatement {
	
	public static void main(String args[]){
		int count =0;
		/*while(count!=5){
			System.out.println("value of count is" +count);
			count++;
			
		}*/
		do{
			System.out.println("value of count is" +count);
			count ++;
		}while(count!=5);
		
		/*while(true){
			if(count==5){
				
		        break;
			}
			System.out.println("value of count is"+count);
			count++;
		}*/
		
		for (int i=0;i<5;i++){
			System.out.println("value of count is" +i);
		}
	}

}
