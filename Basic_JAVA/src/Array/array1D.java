package Array;

import java.util.Scanner;

public class array1D {
	public static void main(String[] args) {
		
	
	int[] age = new int[5];
	Scanner sc = new Scanner(System.in);
	
	
	for(int i = 0; i<age.length; i++) {
		System.out.println("Enter your age");
		age[i]= sc.nextInt();
	}
	for(int x:age) {
		System.out.println(x);
	}
	}
}

