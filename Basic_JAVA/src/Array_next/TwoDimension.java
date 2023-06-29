package Array_next;

import java.util.Scanner;

public class TwoDimension {
	/*
	 * 
	 * 
	 * ================MultiDarray===============
	 * # use to represent data in table/Matrix form.
	 * 
	 * data_type  array_name[][] = new data_type[][];
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int mat[][] =  new int[2][2];
		
		//write data in array
		/*
		 * 
		 *    c0 c1
		 * R0 [0] [0] 
		 * R1 [55] [1]
		 * 
		 * 
		 * 
		 * 
		 */
		
		//write data in array
//		mat[0][0] = 70;
//		mat[0][1] = 88;
//		mat[1][0] = 44;
//		mat[1][1] = 54;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an array:\t");
		for(int i=0 ; i<2; i++) {
			for (int j=0; j<2; j++) {
				
				mat[i][j]=sc.nextInt();
			}
		}
		
		for (int i= 0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
