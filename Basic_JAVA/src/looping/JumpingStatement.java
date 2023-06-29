package looping;

public class JumpingStatement {
	public static void main(String[] args) {
		/*
		 *  =====jumping Statements ======
		 *  a> break; :exit from loop
		 *  b> continue; :skip values
		 *  c> return; :exit from method 
		 * 
		 * 
		 * 
		 */
		
		for (int i = 1; i<= 10; i++) {
			
			if(i == 5 && i == 9 ){
				/*continue;*/
				System.out.println("Hari lala");
				return;
			}
			System.out.println(i);
			
		}
		System.out.println("End for loop");
	}

}
