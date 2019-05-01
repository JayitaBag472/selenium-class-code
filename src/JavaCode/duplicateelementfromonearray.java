package JavaCode;

import java.util.HashSet;

public class duplicateelementfromonearray {
	
	public static  void main (String[] args){
		
		int[] arr ={1,2,3,4,5,6,2,3,4,5};
		
	
	HashSet<Integer> hs = new HashSet<>();	
		for (int i =0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					hs.add(arr[i]);
					
					
				}}}
	for(int h: hs){
		System.out.println(h);
	}	
	
	
	for (int i =0;i<arr.length;i++){
		System.out.println("array"+arr[i]);
	}
	
	}}
			
			
