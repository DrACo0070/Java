package Array;

import java.util.Scanner;

public class arrayclasswork {
	public static void main(String[] args) {
		String[] subjects = {"Nepali  " , "English ", "Computer", "Science " , "Social  ", "Math    "};
		int[] marks = new int[6];
		Scanner sc = new Scanner (System.in);
		for (int i =0; i< marks.length; i++) {
			System.out.println("Enter marks of\t"+ subjects[i]);
			marks[i]= sc.nextInt();
		}
		//read
		int total = 0;
		System.out.println("Subjects \t Marks");
		System.out.println("---------\t---------");
		for (int i =0; i< marks.length; i++) {
			total = total  + marks[i];
		
		System.out.println(subjects[i] + "\t" + marks[i]);
		}
		System.out.println("=====================");
		System.out.println("Total:"+ total);
		System.out.println("================");
	}

}
