package controlstatement;

import java.util.Scanner;

public class Switchoperator {
	public static void main(String[] args) {
		String num;	
		float a= 20F,  b = 30.4F;
		
		for (int i=1; i<=4; i++) {
		Scanner sc =  new Scanner(System.in);
		num = sc.next();
		
		
		double add, sub,mul, div;
		
		
		switch(num) {
		
		case "-":
			sub = a - b;
			System.out.println(sub);
			break;
		
		case "+":
			add = a + b;
			System.out.println(add);
			break;
		
		case "*":
			mul = a * b;
			System.out.println(mul);
			break;
			
		case "/":
			div = a / b;
			System.out.println(div);
			break;
			
		case "":
			div = a;
			System.out.println(div);
			break;
			
		default:
			System.out.println("your have invalid operator");
		sc.close();
		}
		}	
	}

}
