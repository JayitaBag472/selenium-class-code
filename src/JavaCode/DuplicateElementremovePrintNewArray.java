package JavaCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateElementremovePrintNewArray {
	
	public static void main(String[] args){
		
		//int[] nums = {20, 20, 30, 40, 50, 50, 50}; 
		
		
		ArrayList<Integer>  al = new ArrayList<>();
		al.add(20);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50);
		al.add(50);
		System.out.println(al);
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.addAll(al);
		al.clear();
		al.addAll(hs);
		System.out.println(al);
		
				}
			
		
		
	}


