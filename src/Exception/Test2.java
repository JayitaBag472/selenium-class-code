package Exception;

public class Test2 {
	
	public static void main(String args[]){
		
		String str[]= new String[3];
		
		str[0]="A";
		str[1]="B";
		str[2]="C";
		
		int a=10;
		int b=0;
		
		try{
			for(int i=0;i<=str.length;i++)
			{
				System.out.println(str[i]);
			}
		System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("outside the range of indexes");
			
		}
		
		catch(ArithmeticException e)
		{
			
			System.out.println("error");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	
	
	catch (Throwable e)
	{
		System.out.println(e.getMessage());
	}
	
	
	
	
				
	

}
}
