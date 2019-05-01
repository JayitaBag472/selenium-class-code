package JavaCode;

public class equalityOfArray {
	
	public static void main(String[] args){
		
		int[] a= {1,2,3,4,5,6};
		int[] b= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==a[j]){
					
					System.out.println("array elements are equal");
				}
				else{
					System.out.println("array elements are not equal");
				}
			}
		}
		
	}

}
