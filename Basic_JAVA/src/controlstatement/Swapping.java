package controlstatement;
import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner myproj =  new Scanner(System.in);
		
		System.out.println("Enter a");
		int a  = myproj.nextInt();
		
		System.out.println("Enter b");
		int b = myproj.nextInt();
		boolean b1 = true;
		
		try {
		if (b1 == true){
			int c = b;
			b = a;
			a = c;
			System.out.println ("The value of a is : "  + a);
			System.out.println("The valur of b is : " + b);
		}
		else if (b1 ==  false){
			System.out.println("Mamu pechan khon 😄");
		}
		
		else {
			System.out.println("😆😆😆😆😆");
		}
		myproj.close();
		}
		catch(Exception e) {
			System.out.println("you are  wrong");
		}
	}

}
