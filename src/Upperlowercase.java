

public class Upperlowercase {
	
	public static void main(String args[]){

		 
		String s = "ABCDefghIJKLmnopQRSTuvWXYz";
			
				
					int uppercase=0,lowercase=0;
					//looping until the string length is zero
					for(int i=0;i<s.length();i++){
						
						if(Character.isLowerCase(s.charAt(i))){
							lowercase++;
						}
						else if(Character.isUpperCase(s.charAt(i))){
							uppercase++;
						}
					}
				
					System.out.println("No. of lowercase letter : " + lowercase);
					System.out.println("No. of uppercase letter : " + uppercase);
					
					System.out.println();
				}
	}