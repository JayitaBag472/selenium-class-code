package JavaCode;

public class MergeTwoAarays {
	
	public static void main(String[] args){
		
		int[] arr1= {1,3,4,5,6,7,8,9,0};
		int[] arr2= {0,9,8,7,6,5,4,3,2,1};
		
		int[] mergeArray = new int[arr1.length+arr2.length];
		int c=0;
		
		for(int i=0;i<arr1.length;i++){
			mergeArray[i]=arr1[i];
			c++;
		}
		
		for(int j=0;j<arr2.length;j++){
			mergeArray[c++]=arr2[j];
		}
		
		for(int i=0;i<mergeArray.length;i++){
			System.out.println(mergeArray[i]);
		}
		
	}

}
