package looping;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
	System.out.println("Enter any number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int mul = 1;
	
	//post iteration
	 do {
		 mul++;
		 System.out.println(n+ "x" + mul +"=" +(n*mul)); 
		 
	 }while(mul<10);
	 sc.close();
	}
  
}
