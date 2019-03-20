package BasicJavaCode;

public class LoopsClass {
	
	public static void main (String args[])
	{
		int i;
		for (i= 10; i>0; i--) // will fail in the begining only
		{
			System.out.println(i);
		}
		
		int j=0;
		while (j<10){
			System.out.println(j);
			j++;
		}
		
		int k=0;
		do{
			System.out.println(k);
			k++;
		}while(k<10); //at least one output will come
			
		
	}

}
