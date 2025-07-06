package if_else_if_else;

import java.util.*;

public class largest_of_three_number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three number ");
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		int three = scanner.nextInt();
		if (one > two && one > three) {
			System.out.println(one + " is largest number");
		} else if (two > one && two > three) {
			System.out.println(two + " is largest number");
		} else if (three > one && three > two) {
			System.out.println(three + " is largest number");
		} else {
			System.err.println("Something is wrong ");
		}

	}

}
