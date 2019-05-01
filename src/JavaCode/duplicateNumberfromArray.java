package JavaCode;

import java.util.HashSet;

public class duplicateNumberfromArray {
	
	public static void main(String[] args){
		
		int[] arr1= {4,3,2,1,9,6,4};
		int[] arr2 = {5,7,0,4,3};
		
		HashSet<Integer> hs = new HashSet<>();// use hash set when there is duplicate 
		                                          //elements in array
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					hs.add(arr1[i]);
			
				}
				
			}
			
			}
		for(int h:hs){
			System.out.println(h);
		}
	}

}
