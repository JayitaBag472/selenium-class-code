package JavaCode;

public class IndexofValueArray {
	
	public static void main(String args[]){
		
		int[] a = {2,3,4,5,6,7};
		
		int element =8;
		
		for(int i=0;i<a.length;i++){
			if(a[i]==element){
				System.out.println(i);
			}
				else{
					System.out.println("elements not found");
				}
					
			}
		}
			
				
	}

