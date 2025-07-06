package Basic_programs;

import java.util.*;

public class Triangle_type {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a == b && b == c && c == a) {
			System.out.println("Equilatera triangle");
		} else if (a == b || b == c || c == a) {
			System.out.println("isosceles triangle");
		} else if (a != b && b != c && c != a) {
			System.out.println("Scalene triangle");
		}

	}

}