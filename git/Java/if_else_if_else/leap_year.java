package Basic_programs;

import java.util.*;

public class leap_year {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " leap year");
		}

		else {
			System.err.println(year + " not leap year");
		}

	}

}
