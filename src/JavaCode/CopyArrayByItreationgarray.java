package JavaCode;

import java.util.Arrays;

public class CopyArrayByItreationgarray {
	
	public static void main(String[] args){
		
		int[] old_array={2,4,6,8,0,4,2};
		 int[] new_array = new  int[11];
		 
		 System.out.println(Arrays.toString(old_array));
		 
		 for(int i=0;i<old_array.length;i++){
			 new_array[i]=old_array[i];
		 }
		 System.out.println(Arrays.toString(new_array));
		
		
	}

}
