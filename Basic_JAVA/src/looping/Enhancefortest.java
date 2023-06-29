package looping;

public class Enhancefortest {
	/*
	 * 
	 *= = = = =  = == = Enhance  for loop  ===========
	 *# use to read from collection
	 *
	 * syntax:
	 * 
	 *  for (data_type var_name : collection){
	 *  //statements
	 *  
	 *  }
	 *
	 */
	public static void main(String[] args) {
		
		int data[] = {9,8,23,43,32,34,12};
		int sum = 0;
		for(int x: data) {
			System.out.println(x);
			sum =  sum + x;
		}
		System.out.println("Total:"+ sum);
		
	}
}
