package Even;

public class Evenandodd {
	public static void main(String[] args) {
		int n = 4, num;
		int sum = 0;
		String obj = "sqr";
		for (n=0; n<=100; n++) {
			
		switch(obj) {
		case "even":
			num = 2 * n;
			sum = sum +num;
			System.out.println("Even number is " + sum);
		
		case "odd":
			num = 2 * n + 1;
			sum = sum +num;
			System.out.println("Odd number is " + sum);
			break;
			
		case "sqr":
			num = pow(n);
//			System.out.println(num);
			System.out.println("Sqr number is " + num);
			break;
			
		default:
			System.out.println("Successfully achieved");
		}	
		
//		if (n % 2 == 0) {
//				System.out.println(n);
//				
//			}
		}
		
	}
	private static int pow(int n) {
		// TODO Auto-generated method stub
		return n*n;
	}

}
