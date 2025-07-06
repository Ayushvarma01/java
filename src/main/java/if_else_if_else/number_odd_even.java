package if_else_if_else;

import java.util.*;

public class number_odd_even {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " even number");
		}

		else {
			System.err.println(number + " odd number");
		}

	}

}
