package BasicJavaCode;

public class FloatandDouble {
	
	public static void main(String args[]){
		float myFloatValue= 5f;
		double myDoubleValue=(double) 5.25;
		
		int myIntegerValue = 5/2;
		
		System.out.println(myIntegerValue);
		
		double myPounds= 86d;
		
		double myTotal = myPounds*0.45359237d;
		
		System.out.println(myTotal);
		
		char  myChar = 'D';
		
		char myCharacter = '\u00AE';
		
		System.out.println(myCharacter);
		
		boolean isCar = true;
		boolean myCar = isCar ?true : false;
		if(myCar)
		System.out.println(myCar);
		
		double myValue1 = 20d;
		double myValue2 = 80d;
		double myAdd= (myValue1 + myValue2)*25d;
		
		double myReminder = myAdd%40;
		
		boolean newGameover = true;
		int score1=10000;
		int levelcompleted1= 8;
		int bonus1=200;
		
		if (newGameover){
			int finalscore = score1+(levelcompleted1*bonus1);
			System.out.println(finalscore);
			
		
		}
		
		
		
		boolean gameOver = true;
		int score= 800;
		int levelCompleted= 5;
		int bonus=100;
		
		if (score<5000 && score >1000)
		{
			System.out.println("true");
		} else if(score<1000){
			System.out.println("jayita");
		}
		else
		{
			System.out.println("false");
		}
		
		if (myReminder<= 20)
		 System.out.println("total was over the limit");
		 
		
		
		
		
		
		
	}

}
