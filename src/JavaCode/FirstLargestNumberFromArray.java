package JavaCode;

public class FirstLargestNumberFromArray {

	public static void main(String[] args) {
		
		int[] a= {2,5,6,7,9,8};
		int small=a[0];
		
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]<small){
				small=a[i];
				
			}
			}
		System.out.println(small);
		}
	
	}

