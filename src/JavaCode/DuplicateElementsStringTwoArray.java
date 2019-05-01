package JavaCode;

import java.util.HashSet;

public class DuplicateElementsStringTwoArray {
	
	public static void main(String[] args){
		String[] a= {"jay","arya","laxmi","ayan"};
		String[] b= {"jay","arya"};
		
		HashSet<String> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				
				if(a[i].equals(b[j])){
					hs.add(a[i]);
				}
			}
		}
		
		
			System.out.println(hs);
		}
	
		
	}


