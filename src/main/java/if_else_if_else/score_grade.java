package if_else_if_else;

import java.util.*;

public class score_grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your exam score");
		int score = scanner.nextInt();
		if (score >= 90) {
			System.out.println("Grade A (Excellent work)");
		} else if (score < 90 && score >= 80) {
			System.out.println("Grade B (very good)");
		} else if (score < 80 && score >= 70) {
			System.out.println("Grade C (nice work)");
		} else if (score < 70 && score >= 60) {
			System.out.println("Grade D ");
		} else {
			System.err.println("you are fail");
		}

	}

}
