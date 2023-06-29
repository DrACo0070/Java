package controlstatement;

public class laddertest {
	/*
	 * 
	 * if (condition-1){
	 * }
	 * else if(condition-2){
	 * }
	 * else if(condition-3){
	 * }
	 * else{
	 * }
	 * 
	 * 
	 */
	public static void main(String[] args) {
	
	int marks = 75;
	
	if(marks>= 80) {
		System.out.println("Distinction");
	}
	else if(marks >= 50) {
		System.out.println("First");
	}
	else if(marks >=43) {
		System.out.println("Second");
	}
	else if(marks >= 56) {
		System.out.println("Third");
	}
	else {
		System.out.println("Failed"); 
	}
	}
}
