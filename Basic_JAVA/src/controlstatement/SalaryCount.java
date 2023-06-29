package controlstatement;

public class SalaryCount {
	
	public static void main(String[] args) {
		String Post = "CEO";
		
		
		double salary;
		
		switch(Post){
		
		case "CEO":
			salary = 230000 + 17.89 *230000/100;
			System.out.println("Your Total Salary is " + salary);
		break;
		
		case "MD":
			salary = 280000 + 28 *280000/100;
			System.out.println("Your Total Salary is " + salary);
		break;
		
		case "MANAGER":
			salary = 150000 + 25.88 *150000/100;
			System.out.println("Your Total Salary is " + salary);
		break;
		
		case "HELPER":
			salary = 8500 + 15 *8500/100;
			System.out.println("Your Total Salary is " + salary);
		break;
		
		default:
			System.out.println("Invalid Post");
		
		}
	}

}
