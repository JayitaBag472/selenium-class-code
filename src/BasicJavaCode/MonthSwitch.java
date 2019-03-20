package BasicJavaCode;

public class MonthSwitch {
	public static void main(String args[]){
	String month="JUNE";
	switch(month.toLowerCase()){
	case "January":
		System.out.println("month is January");
		System.out.println(month);
		break;
	case "February":
		System.out.println("month is February");
		System.out.println(month);
		break;
	case "April":case "May": case "june":
		System.out.println("Value is C or D or E");
		System.out.println(month);
		break;
		
	default:
		System.out.println("other values");
		System.out.println(month);
		break;
		
	}
	
	}

}
