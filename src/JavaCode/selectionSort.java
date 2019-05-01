package JavaCode;

public class selectionSort {
	
	public static void main(String[] args){
		
		int temp=0;;
		int[] a={36,52,13,45,3,28,19};
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[j]<a[i]){
					
					
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
				
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}
