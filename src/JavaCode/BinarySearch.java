package JavaCode;

public class BinarySearch {
   
	public static void main(String[] args){
		
		int[] a={2,4,6,8,10,12,14,16,18,20,22,23,26,30,34};
		
		int element =14;
		
		// in this case then index[0]=2 is lower limit and index[34] is higher limit
		
		int li = 0;
		int hi=a.length-1;
		
		int mi = (li+hi)/2; // middle is middle of lower and upper limit
		
		// here the middle index is index[7]/position 8 value is 16
		
while (li<=hi){
		if(a[mi]==element){
			System.out.println("element is present in middle of" +mi +"index position");
			break;
			
		}
		else if(a[mi]>element){ // executed if the value is less than index[7] = value 16
			// if search element is less than middle value in that case 
			//hi value which index[14]=34
			//will shift to index[6]=14. and lower index will be the same.
			hi = mi-1;
			
		}
		
		else{
			
			li = mi+1;  // executed if the value is more than index[7] = value 16
			// if search element is more than middle value in that case 
		    //li value which index[0]=2
			//will shift to index[8]=18. and higher index will be the same.
			}
		mi=(li+hi)/2;
		
		}
	
	if(li>hi){
		
		System.out.println("element not found");
		
	}
		
	}
}

