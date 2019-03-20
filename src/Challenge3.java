
public class Challenge3 {
	
	public static void main(String args[]){
		
		
		
	
		
		
		int positionHighScoreTable=calculateHighScorePosition(1000);
		displayHighScorePosition("Jayita",positionHighScoreTable);
		positionHighScoreTable=calculateHighScorePosition(500);
		 displayHighScorePosition("ayan",positionHighScoreTable);
		 positionHighScoreTable=calculateHighScorePosition(100);
		 displayHighScorePosition("ran",positionHighScoreTable);
		 positionHighScoreTable=calculateHighScorePosition(50);
		 displayHighScorePosition("shyam",positionHighScoreTable);
	}
	
	public static void displayHighScorePosition(String playersName,int positionHighScoreTable){
		
		
	System.out.println(playersName+"managed to get position"+positionHighScoreTable+"on the high score table");
		
	}
	
	public static int calculateHighScorePosition( int score){
		
		if (score>=1000){
			return 1;
		}
		else if(score>=500 && score<1000){
			
			return 2;
		}
		else if(score>=100 && score <500){
			return 3;
		}
		else
		{
			return 4;
			
		}
		
		
		
		
		
	}

}
