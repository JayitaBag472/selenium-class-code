package BasicJavaCode;

public class User {
	
	public static void main(String args[]){
	
	Car car1= new Car();
	car1.brand = "Vol";
	car1.color = "Red";
	car1.model = "Polo";
	car1.numberMirror= 2;
	car1.Wheel=6;
	car1.running();
	car1.notRunning();
	
	Car car2= new Car();
	car2.brand = "BMW";
	car2.color = "Black";
	car2.model = "X";
	car2.numberMirror= 2;
	System.out.println(car2.Wheel);
	car2.running();
	car2.notRunning();
	
	}

}
