package JavaCode;

import java.util.ArrayList;

public class arrayListtoArray {


		public static void main(String[] args){
			
			
			ArrayList<Integer> al =new ArrayList<>();
			al.add(1);
			al.add(5);
			al.add(6);
			al.add(4);
			
			System.out.println(al);
			
			Integer[] intarray = new Integer[al.size()];
		        al.toArray(intarray);
		        
		        for(Integer integer:intarray){
		        	System.out.println(integer);
		        }
		        
			
			
			
			

	}

	

	}


