import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.apache.xmlbeans.impl.schema.SoapEncSchemaTypeSystem;

public class ListToSet {
	
	public static void main(String args[]){
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		 Iterator it = al.iterator();
		 
		 for(int i= 0;i<al.size();i++){
			 System.out.println("Display all and duplicate elements of list:");
			 System.out.println(+al.get(i));
		 }
		 
		 LinkedHashSet<Integer> ls = new LinkedHashSet<>(al);
		 for(int a:ls){
			 System.out.println("Display only unique and distint element from list");
		      System.out.println(a);
		
		 }
		 
		 
		
		
	}

}
