package looping;

import java.util.Scanner;

public class WhileTest {
	
	public static void main(String[] args) {
		 System.out.print("Enter any number:");
		 try (Scanner num = new Scanner(System.in)) {
			int n =  num.nextInt();
			 int fact = 1;
			  
			while( n > 1) {
				fact = fact * n;
				n--;
			}
			System.out.println("Result = " + fact);
		}
		catch(Exception e){
			System.out.println("The number you entered is invalid"); 
			 
		 }
	}
}
