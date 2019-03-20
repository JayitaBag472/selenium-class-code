package CollectionAPI;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List2 {

	public static void main(String args[]){
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Monday");
		ll.add("Tuesday");
		ll.add("Wednesday");
		
		ListIterator li= ll.listIterator();
		
		for (int i =0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		
		
		
	}
}
