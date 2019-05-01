package JavaCode;

import java.util.ArrayList;
import java.util.LinkedList;

public class arraylistToLinkedlist {
	
	public static void main(String[] args){
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(8);
		al.add(5);
		al.add(17);
		System.out.println(al);
		
		LinkedList<Integer> li = new LinkedList<>(al);
		System.out.println(li);
		System.out.println(li.size());
		
		
	}

}
