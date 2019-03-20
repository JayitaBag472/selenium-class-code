package BasicJavaCode;

public class Switch {

	public static void main(String args[]){
		int switchvalue =3;
		switch(switchvalue){
		case 1:
			System.out.println("value is 1");
			System.out.println(switchvalue);
			break;
		case 2:
			System.out.println("value is 2");
			System.out.println(switchvalue);
			break;
		case 3:case 4: case 5:
			System.out.println("value of 3 or 4 or 5");
			System.out.println(switchvalue);
			break;
		default:
			System.out.println("value is ot 1 or 2");
			System.out.println(switchvalue);
			break;
		}
	}
}
