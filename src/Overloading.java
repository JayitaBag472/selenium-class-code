
public class Overloading {
	
	public static void main(String args[]){
		
		int totalScore=calculateScore("Jayita",67);
		System.out.println(totalScore);
		int highScore=calculateScore(90);
		System.out.println(highScore);
		calculateScore();
		
		
	}
	
	public static  int calculateScore(String playerName, int score){
		System.out.println(playerName +"scored"+score);
		return 1000 * score;
	}
	public static  int calculateScore(int score){
		System.out.println( "player"+"scored"+score);
		return 1000 * score;
		
	}
	
	public static int calculateScore(){
			System.out.println("No played are playing the match");
			return 0;
			}
		

		
	
}
