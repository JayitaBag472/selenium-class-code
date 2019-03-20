package Exception;

public class Test1 {
	
	public static void main (String args[]){
		String str[]= new String[3];
		
		
		str[0]="A";
		str[1]="B";
		str[2]="C";
		
		int a=20;
		int b=0;
		
		int c=a/b;//arithemetic exception
		
		System.out.println(c);
		
		for (int i=0;i<=str.length;i++){//array out of bound exception
			
			System.out.println(str[i]);
		}
	}

}

/*vm error
 * between two methods

       throwable
 Exception                                          Error
 io exception                                      Stackthrow
 sql Exception                                     Vm error
 run time exception--- arithmetic , 
 index (ArrayIndexoutofbound Exception,
 stringIndexoutofboundException ) 
 Null Pointer exception*/
