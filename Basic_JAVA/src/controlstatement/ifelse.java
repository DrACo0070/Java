package controlstatement;

public class ifelse {
	public static void main(String[] args) {
		int l = 4;
		int b = 5;
		int area;
		
		if (l != 0 && b != 0) {
			area = l * b;
			System.out.println("The area is :" + area);
		
		}
		else if (l == 0 && b == 0) {
			area = 2*(l+b);
			System.out.println(area);
		}
	}

}
