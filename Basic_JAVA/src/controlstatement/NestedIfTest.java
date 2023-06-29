package controlstatement;

public class NestedIfTest {
	public static void main(String[] args) {
		/*
		 * 
		 * syntax:
		 * 	if (condition 1){
		 * 
		 * 
		 * 		if (condition 2){
		 * 		
		 * 		else{
		 * 
		 * } 
		 *  String citizen = "nepali";
		 *  int age =  28;
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		String citizen = "nepali";
		int age = 28;
		boolean haveVoterId =  true;
		
		if(citizen.equals("nepali")) {
			if(age>= 18) {
				
				if (haveVoterId) {
					System.out.println("you can vote");
				}	
				else {
					System.out.println("you are not capable to vote");
				}
			}
			else {
				System.out.println("you are under age");
			}	
		}	
		else {
			System.out.println("invalid citizenship");
	}
}
}