package JavaCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatecharatersString {
	
	public static void main(String[] args){
		String str= "sandeep";
		
		char[] st1= str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(st1[i]==st1[j]){
					System.out.println(st1[j]);
					count++;
					break;
					
				}
				
			}
		}

	}
	}


