package CollectionAPI;

import java.util.ArrayList;
import java.util.ListIterator;

public class List {
	
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<>();
		al.add("abcd");
		al.add("qwer");
		al.add("ikjh");
	
		ListIterator li = al.listIterator();
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		
		
	}

}
