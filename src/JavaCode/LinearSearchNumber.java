package JavaCode;

public class LinearSearchNumber {
	
	public static void main(String[] args){
		
		int[] a={36,71,24,5,98,25};
		
		int element=71;
		int temp = 0;
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]== element){
				System.out.println("element is present in "+i +"index position");
				temp =temp+1;
			}
		}
			if(temp==0){
				System.out.println("element not found in list");
			
		}
		
		}
		
		
		
	}


