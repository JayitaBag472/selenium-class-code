//collection api is used for array length not defined
//array- having datatype and dimension

/*main interfaces
1)list --- duplicate data -- accepts primitive datatype--- use GET to retrive data  --listiterator
a)Arraylist
b)Linklist
c)Vector

2)Set--- no duplicate data--- accepts reference and object data type--- use iteration/next.hasNext to retrive data
a)sortedSet-->TreeSet
b)Linked hashset
c)Hashset

3) Queue
4)Dequeue
*/



package CollectionAPI;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;


public class Test1 {
	
	public static void main(String args[]){
		ArrayList<String> li = new ArrayList<>();
		li.add("Anand");
		li.add("Jayita");
		li.add("asdasd");
		li.add("asdasd");
		
		ListIterator it1= li.listIterator();
		
		
		//li.add(29);
		//li.add('M');
		//li.add(34.454);
		
	 for (int i= 0; i <li.size(); i++){
		 System.out.println(li.get(i));
	 }
	 
	/* LinkedList<String> a= new LinkedList<>();
	 
	 a.add("Monday");
	 a.add("Tuesday");
	 
		
	 for (int i= 0; i <a.size(); i++){
		 System.out.println(a.get(i));
	 }
		
		Vector<String> v = new Vector<>();
		v.add("Name");
		v.add("Surname");
		
		 for (int i= 0; i <v.size(); i++){
			 System.out.println(v.get(i));*/
		 }
		
	}



/*
  array list                Linked list                vector
 insertion/manipulation    deletion
 Dynamic Array             double linkedlist
    50% size                50% size                   size-100%
   Not synchronized         Not synchronized          synchronized
   not threadsafe            not threadsafe             threadsafe
    new                      new                          legacy*/ 
