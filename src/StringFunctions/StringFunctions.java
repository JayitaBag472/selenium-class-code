package StringFunctions;

public class StringFunctions {

	public static void main(String args[]){
	
	String st = "Total= quality =5 KGs ";
	
	String st2 = "Total quality =5 KGS";
/****************************LENGTH*******************************/
	System.out.println(st.length());
	/**************************SPLIT**********************************/
	st.split("=");/// return type is array if string is splited
	
	String ab[] = st.split("=");
	System.out.println(ab.length);
	/************************************************************/	
	System.out.println(ab[0]);
	System.out.println(ab[1]);
	/************************************************************/	
	for(int i=0; i<ab.length;i++){
		System.out.println(ab[i]);
	}
	/************************TRIM SPACE************************************/
String n=st.trim();

System.out.println(st);
System.out.println(n);

	
	/************************SUBSTRING************************************/

System.out.println(st.substring(1,5));
System.out.println(st.substring(6));

/************************REPLACE************************************/

String n1=st.replace(" ","");

System.out.println(st);
System.out.println(n1);

String a= "Anand";
System.out.println(a.length());
System.out.println(a.substring(0,4));
String a1[] = st.split("Anand");





/****************************EQUALCASES********************************/
	if (st.equalsIgnoreCase(st2))
	{
		System.out.println("Strings matched");
	}
	else
	{
		System.out.println("Strings not  matched");
	}
	
	if (st.equals(st2))
	{
		System.out.println("Strings matched");
	}
	else
	{
		System.out.println("Strings not  matched");
	}
	
	
if (st==st2)
	{
		System.out.println("Strings matched");
	}
	else
	{
		System.out.println("Strings not  matched");
	}
	
	}
}
