package JavaCode;

public class Pyramid1 {
	
	public static void main(String[] args){
		
		//    1               1
		//    212             2
		//    32123           3 
		//    4321234         4
		//    32123           5
		//    212             6
		//    1               7
	    int odd=1;
	    int start =0;
		for(int i=1;i<=7;i++){
			if(i<4)
			{
			start=i;
			}
			else
			{
				start = 8-i;
			}
			for (int j=1;j<=odd;j++){
				int middlevalue = odd/2+1;
				System.out.println(start);
				if(j<middlevalue){
					start --;
				}
				else {
					start ++;
				}
				
				
			}
			System.out.println();
			if(i<4){
			odd=odd+2;
		}
			else{
			odd=odd-2;
			}
		}
	}}