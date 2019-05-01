package JavaCode;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		
		{
			
			int m,n,c,d;
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Inputs for rows of matrix");
			
			 m = in.nextInt();
					 
			System.out.println("Inputs for coloumns of matrix");
			
			n= in.nextInt();
			
			int a1[][]= new int[m][n];
			int a2[][]= new int[m][n];
			int sum[][] = new int[m][n];
			
			System.out.println("enter inputs for first matrix");
			
			for( c=0;c<m;c++)
				for( d= 0; d< n; d++ )
					a1[c][d]=in.nextInt();
			
			System.out.println("enter inputs for second matrix");
			
			for( c=0;c<m;c++)
				for( d= 0; d< n; d++ )
					a2[c][d]=in.nextInt();
			
			for( c=0;c<m;c++)
				for( d= 0; d< n; d++ )
					sum[c][d]=a1[c][d]+a1[c][d];
			
			System.out.println("Sum of the matrices:-");
			
			for( c=0;c<m;c++)
				for( d= 0; d< n; d++ )
					System.out.println(sum[c][d]);
			
			System.out.println();
			
		}}
}
