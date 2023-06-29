package Array_next;

import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		
		/*
		 * 
		 * 4  5  6
		 * 10 20 30
		 * 20 30 40
		 * 
		 * 
		 *//*-----------row ------row-------row */
//		int mat1[][] = {{4,5,6},{10,20,30},{20,30,40}};
		int mat2[][] = {{2,3,4},{3 ,4 ,5 },{4 ,5 ,4 }};
		
		int mat1[][] = new int [3][3];
		Scanner sc =new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				mat1[i][j]=sc.nextInt();
				
			}
		}
		
		int mat[][] = new int[3][3];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				mat[i][j] =mat1[i][j]+ mat2[i][j];
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
