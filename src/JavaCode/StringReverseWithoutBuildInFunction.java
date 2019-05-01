package JavaCode;

public class StringReverseWithoutBuildInFunction {
	
	public static void main(String[] args){
		String str ="Jayita";
		
		char[] strarray = str.toCharArray();
		for(int i=strarray.length-1;i>=0;i--){
			System.out.println(strarray[i]);
		}
	}

}
