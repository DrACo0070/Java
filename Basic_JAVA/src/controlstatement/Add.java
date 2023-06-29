package controlstatement;
import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		 
		 Scanner myapp = new Scanner (System.in);
		 System.out.println("Enter a :");
		 int a = myapp.nextInt(); //Reading int
		  
		 System.out.println("Enter b :");
		 int b = myapp.nextInt(); //Reading int
		 
		 System.out.println("Sum : " + (a + b));
	}

}
