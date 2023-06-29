package arraywithmethod;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAYwithmethod {
	/*
	 * 
	 * ======Array With Method ============
	 * 
	 * 1. array as argument
	 *  //5000  values
	 *  
	 *  void sum(int a[]){
	 *  
	 *  
	 *  }
	 *  sum(array);
	 *  
	 *  
	 *  int[] getvalue(){
	 *  array =  200,700,400,500;
	 *  
	 *  return array;
	 *  }
	 *  
	 *  
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int data[] = {5,67,8,907,65,43,567,89,765};
////		sum(data);
//		System.out.println("Enter your choices");
//		Scanner sc =new Scanner(System.in);
//		String name = sc.next();
		
//		if (name == "largest") {
		largestValue(data);
		smallestValue(data);
		

//		int oddnos[] = getOddnosfrom1to100();
//		for(int x: oddnos) {
//		System.out.print(x+",");
//		}
	
	}
	//======== array as arguments-------
	
	static void sum(int[] values) {
		int s=0;
		for(int x: values) {
			System.out.println(x);
			s = s + x;
		}
	System.out.println("total:\t" + s);
	}
	
	
	//=====array as return========
	static int[] getOddnosfrom1to100(){
		
		int a[] = new int[50];
		int j=0;
		
		for (int i = 1; i<=100; i++) {
			
			if(i%2 != 0) {
				a[j]=i;
				j++;
			}
		
		}
		return a;
	}
	
	//largest Value
	static void largestValue(int n[]) {
		
		int a = 0;

		for(int i = 0; i < n.length; i++) {
			if(n[i] > a) {
			 a = n[i];
			}
		}
			System.out.println("The greatest number is:" + a);
	}
	
	
	//smallest value
	static void smallestValue(int n[]) {
		int b = 6;
		
		for (int i = 0; i<n.length; i++ ) {
			if(n[i]<b) {
				b = n[i];
			}
		}
		System.out.println("The smallest value is" + b);
	}
}
