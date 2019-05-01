package JavaCode;

import java.util.HashSet;

public class DuplicateStringArray {

	public static void main(String[] args) {
		
		String[] a= {"jay","arya","jay","laxmi","ayan","ayan"};
		
		HashSet<String> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			if(a[i].equals(a[j])){
			  hs.add(a[i]);	
			}
			}
			
				}
		for(String str:hs){
			System.out.println(str);
		}

	}

}
