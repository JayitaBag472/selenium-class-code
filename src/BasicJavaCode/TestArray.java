package BasicJavaCode;

public class TestArray {
	
	public static void main (String[] args){
		
		String str[]=new String[3];
		 str[0]= "Anand";
		 str[1]= "Bhare";
		 str[2]= "TechBodhi";
		 
		// System.out.println(str[0]);
		// System.out.println(str.length);
		
		//for (int i=0;i<str.length;i++){
			// System.out.println(str[i]);
		 
		 String std[][]= new String[3][2];
		 
		 std[0][0]="Aanad";
		 std[0][1]="Bhayre";
		 
		 std [1][0]="Jayita";
		 std[1][1] = "Bag";
		 
		 std [2][0]="A";
		 std [2][1]="B";
		 
		 
		 for (int i=0;i<std.length;i ++){
			 for ( int j=0;j<std[i].length;j++){
				 System.out.println(std[i][j]);
			 }
			 
			 
			 String std1[][][]= new String[120][8][6];
			 
			 std1[0][0][0]="Arup";
			 std1[0][0][1]="Sem1";		
			 
			 
			 for (int a=0;a<std.length;a ++){
				 for ( int b=0;b<std[a].length;b++){
					 System.out.println(std[a][b]);
				 }
			 }}}}
		 
		 
		 
		 
		 
	


