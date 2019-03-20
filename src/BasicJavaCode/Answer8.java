package BasicJavaCode;

public class Answer8 {

	public static void main(String args[]){
		Integer arr[] = new Integer[3];
		arr[0]= 100;
		arr[1]=200;
		arr[2]=500;
		
		int min=arr[0];
		
		for(int i=0; i<arr.length;i++ )
		{
			if(arr[i]<min){
				
				min=arr[i];
				
			}
			
		}
		
		System.out.println("minimum value"+min);
		
		
		
	}
}
