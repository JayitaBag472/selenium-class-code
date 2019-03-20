
import java.util.Scanner;
public class abc {
	
	public static void main(String args[]){

		 
		

		
			
				//Scanner is a class used to get the output from the user
				Scanner Kb=new Scanner(System.in);
				System.out.println("How man strings u want to check?");
				//Take the input of no. of test cases
				int t=Kb.nextInt();
				//looping until the test cases are zero
				while(t-->0){
					//Input the string
					System.out.println("Enter the string!");
					String s=Kb.next();
					//counter to count the uppercase and lowercase letters 
					int uppercase=0,lowercase=0;
					//looping until the string length is zero
					for(int i=0;i<s.length();i++){
						/*this function ---> isLowercase checks a particular character of the string by its index(charAt(index)) 
						that whether that character is a uppercase letter or lowercase letter,
						if it will be an uppercase letter then uppercase counter will be incremented and if 
						it is a lowercase character then lowercase counter will be incremented
						*/
						if(Character.isLowerCase(s.charAt(i))){
							lowercase++;
						}
						else if(Character.isUpperCase(s.charAt(i))){
							uppercase++;
						}
					}
					//Print the output 
					System.out.println("No. of lowercase letter : " + lowercase);
					System.out.println("No. of uppercase letter : " + uppercase);
					//to give a space of one line
					System.out.println();
				}
	}
}
   
