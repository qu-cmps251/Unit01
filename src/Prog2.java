/* A simple program to randomly generate three marks
 * and convert them to letter grades.
 */

import java.util.Random;

public class Prog2 {

	public Prog2() {
		int mark;
		String grade = "";
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			mark = r.nextInt(101);
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

			System.out.printf("Mark: %03d\tGrade: %-2s\n", mark, grade);
		}
	}

	public static void main(String[] args) {
		new Prog2();
	}
}
