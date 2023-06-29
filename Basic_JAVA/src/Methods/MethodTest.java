package Methods;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
//		sum();
//		area();
//		System.out.print("Enter a number: ");
//		Scanner ns = new Scanner(System.in);
//		int n = ns.nextInt();
//		printTable(12);
//		OddEven(n);
		int a = getSumof1to100();
		System.out.println(a);
		int b= findSmallestValue(20,30);
		System.out.println(b);
		
		
	}
	
	
	//1. no return type with no arguments
	
	static void sum() {
		int a =40;
		int b =30;
		int c =a+b;
		System.out.println("Total = "+c);
	}
	
	
	static void area() {
		System.out.print("Enter any number:");
		Scanner sy = new Scanner(System.in);
		int a = sy.nextInt();
		
		Scanner sys = new Scanner(System.in);
		int b = sys.nextInt();
		
		int area = a*b;
		System.out.println(area);
	}
	
	// 2. no return type with arguments
	static void printTable(int n) {
		for (int i =1 ; i <= 10; i++) {
			System.out.println(n + "*" + i +"=" + n*i);
		}
	}
	
	
	//odd and even determine garne
	static void OddEven(int n){
		 
		if(n%2 == 0) {
			System.out.println("The Number is Even ");
			
		}
		else {
			System.out.println("The Number is Odd");
		}
		
		
	}

	//3. return type with no  arguments
	static int  getSumof1to100() {
		int s= 0;
		 for (int i = 0; i<=100; i++) {
			 s = s+i;
		 }
		 return s;
		
	}
	
	//4 . return type with arguments
	 static int findSmallestValue(int x,int y) {
		  if(x<y) {
			  return x;
		  }
		  return y;
	 }
	
}