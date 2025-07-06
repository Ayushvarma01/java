package Basic_programs;

import java.util.*;

public class valid_date {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = scanner.nextInt();
		System.out.print("Enter month 1-12: ");
		int month = scanner.nextInt();
		System.out.print("Enter day 1-31: ");
		int day = scanner.nextInt();

		if ((year >= 1000 && year <=9999) && (month <= 12 && month >= 1) && (day >= 1 && day <= 31)) {
			System.out.println("valid date");
		}else {
			System.err.println("Invalid data");
		}
	}
}
