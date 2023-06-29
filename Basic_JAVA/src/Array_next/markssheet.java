package Array_next;

import java.util.Arrays;
import java.util.Scanner;

public class markssheet {
	public static void main(String[] args) {

		System.out.println(" ");

		String array[] = { "StuName", "   Science", "     Math", "      Nepali", "    English", "      Social",
				"       Opt.Math" };
		int a[][] = new int[5][7];

		System.out.println("Enter Student Name");
		Scanner sc1 = new Scanner(System.in);

		String name[][] = new String[5][1];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				name[i][j] = sc1.next();

			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {
				for (int k = 0; k < array.length; k++) {
					System.out.println("Enter marks of " + name[i][j] + " in " + array[k]);

					Scanner sc = new Scanner(System.in);
					
					for (int m = 0; m < 7; m++) {
						
						a[i][m] = sc.nextInt();
						break;
						
					}
					
				
				}
			}
		}
		System.out.println(
				"\t===========================================Subjects===========================================");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");

		}

		
		array3(name, a);

	}

	static void array3(String Name[][], int n[][]) {
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1; j++) {

				System.out.print(Name[i][j] + "\t");
			}
			for (int k = 0; k!=7; k++) {
				System.out.print("|");
				System.out.print("\t" + n[i][k] + "\t");
			}

			System.out.println();
		}
		System.out.println(
				"=======================================================================================================");

	}
}
