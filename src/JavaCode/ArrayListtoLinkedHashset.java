package JavaCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ArrayListtoLinkedHashset {

	
	public static void main(String[] args){
				
				ArrayList<Integer> al= new ArrayList<>();
				al.add(1);
				al.add(5);
				al.add(5);
				al.add(7);
				al.add(78);
				al.add(90);
				al.add(100);
				al.add(100);
				
				System.out.println(al);
				
				LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(al);
				
				System.out.println(hs);
				
			}
		}
