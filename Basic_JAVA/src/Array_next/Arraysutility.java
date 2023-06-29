package Array_next;

import java.util.Arrays;

public class Arraysutility {
	public static void main(String[] args) {
		int [] array = {7,68,90,7,4,54,45,56,78,90};
//		Arrays.sort(array);
//		
//		System.out.println(Arrays.toString(array));
//		
//		
//		
//		
//		/*******************Printing Array in reverse order************************/
//		for (int i=array.length-1; i>=0; i--) {
//			System.out.print(array[i]+" ");
//		}
		
		
//		Arrays.fill(array,80);
		Arrays.fill(array, 5,10,60);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(Arrays.copyOf(array, 5)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(array, 3, 5)));
	}
}

