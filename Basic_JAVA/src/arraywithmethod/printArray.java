package arraywithmethod;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class printArray {
	public static void main(String[] args) {
//		int[] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter  array");
		int[] array = new int[10];
		for (int i=0; i< array.length; i++) {
			Scanner sc = new Scanner(System.in);
			array[i]= sc.nextInt();
		}
		print(array);
	}
	
	static void print(int[] values) {
			System.out.println(Arrays.toString(values));
		for(int x: values) {
			System.out.print(x+ ",");
			System.out.println();
//			
		}
	}
}
