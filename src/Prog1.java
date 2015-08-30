/* A simple program to read in a mark and convert
 * it to a letter grade.
 */

import java.util.Scanner;

public class Prog1 {

	public Prog1() {
		int mark;
		String grade = "";
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a mark: ");
		mark = kb.nextInt();
		if (mark >= 90 && mark <= 100)
			grade = "A";
		else if (mark >= 85 && mark < 90)
			grade = "B+";
		else if (mark >= 80 && mark < 85)
			grade = "B";
		else if (mark >= 75 && mark < 80)
			grade = "C+";
		else if (mark >= 70 && mark < 75)
			grade = "C";
		else if (mark >= 65 && mark < 70)
			grade = "D+";
		else if (mark >= 60 && mark < 65)
			grade = "D";
		else if (mark >= 0 && mark < 60)
			grade = "F";
		else
			System.out.println(mark + " is an Invalid Grade.");

		System.out.printf("Mark: %03d\tGrade: %2s\n", mark, grade);

		kb.close();
	}

	public static void main(String[] args) {
		new Prog1();
	}
}
