package JavaCode;

import java.util.ArrayList;

public class StringArrayToArrayList {
	
	public static void main(String[] args){
		
		String[] str ={"Jay","Ayan","Veru","Arya","Sansa"};
		
		ArrayList<String> al = new ArrayList<>();
		
		for(int i=0;i<str.length;i++){
			System.out.println("Array display"+str[i]);
			al.add(str[i]);
		}
		
		for(String str1:str)
			System.out.println("added to array list"+str1);
	}
	

}
