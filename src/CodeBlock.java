
public class CodeBlock {
	
	public static void main(String args[]){
		
		boolean gameOver= true ;
		int score =5000;
		int levelCompleted =5;
		int bonus= 100;
		
		int higherScore=calculateScore(true,score,levelCompleted,bonus);
	 System.out.println("abcd"+higherScore);
		
		
		 score= 1000;
		levelCompleted =8;
		bonus= 200;
		//calculateScore(gameOver,score,levelCompleted,bonus);
		
		higherScore=calculateScore(true,score,levelCompleted,bonus);
		 System.out.println("abcd"+higherScore);
		
		/*if (gameOver){
			int finalScore= score +(levelCompleted*bonus);
			System.out.println(finalScore);
		}
			
			score =1000;
			levelCompleted =8;
			bonus= 200;
			
			if (gameOver){
				int finalScore= score +(levelCompleted*bonus);
				System.out.println(finalScore);
			
			
			
		}*/
		
		
	}
	
	public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
	
		
		if (gameOver){
		 int finalScore= score +(levelCompleted+bonus);
			System.out.println(finalScore);
			return finalScore;
		}else
		return -1;
		
	}
}


