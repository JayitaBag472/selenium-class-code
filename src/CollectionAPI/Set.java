package CollectionAPI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.TreeSet;

public class Set {
	
	public static void main(String args[]){
		
		HashSet<String> t= new HashSet<>(); // random value---not sorted
		
		t.add("A");
		t.add("B");
		t.add("C");
		
		Iterator<String> a= t.iterator();
		
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		
	
	
	LinkedHashSet<String> t1 = new LinkedHashSet<>();// insertion order
	
	t1.add("D");
	t1.add("E");
	t1.add("F");
	
	Iterator<String> a1= t1.iterator();
	
	while(a1.hasNext())
	{
		System.out.println(a1.next());
	}
	
	TreeSet<String> t2 = new TreeSet<>();// sorted  data
	
	t2.add("G");
	t2.add("H");
	t2.add("I");
	
Iterator<String> a2= t2.iterator();
	
	while(a2.hasNext())
	{
		System.out.println(a2.next());
	}
	


}
}





//Hashset -no insertion fixed, no sort for output
//use iterators in set
// extract values- enhanced for loop and iterator

