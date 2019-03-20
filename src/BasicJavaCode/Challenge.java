package BasicJavaCode;

public class Challenge {
	public static void main(String args[]){
	char switchvalue='E';
	switch(switchvalue){
	case 'A':
		System.out.println("value is A");
		System.out.println(switchvalue);
		break;
	case 'B':
		System.out.println("Value is B");
		System.out.println(switchvalue);
		break;
	case 'C':case 'D': case 'E':
		System.out.println("Value is C or D or E");
		System.out.println(switchvalue);
		break;
		
	default:
		System.out.println("other values");
		System.out.println(switchvalue);
		break;
		
	}
	
	}

}
