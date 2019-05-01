package JavaCode;

public class InsertionSort {
	
	public static void main(String[] args){
		int a[] ={1,5,6,3,4,2};
		
		int temp ,j;
		for(int i =1;i<a.length;i++)    // temp=5, j=1 ,1>0 && 1>5  ....5=temp
			            
		{
			temp=a[i];                   // temp=3 ,j=3  3>0 && [6]>3 a[3]=a[2]; 3-1=2
			                             // 2>0 && [5]>3 a[2]=a[1]; 2-1=1
			                             // 1>0 && [1]>3  1=temp
			j=i;
		
			while( j>0 && a[j-1]>temp){   // 
				
				a[j]=a[j-1];
				j=j-1;
				
			}
			
			a[j]=temp;
			}
			
			
	
		
		for(int i =0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}


}