package if_else_if_else;

import java.util.*;

public class Income_tax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int income = scanner.nextInt();
		float tax = 0;
		if (income <= 10000) {
			System.out.println("no income for income with: " + income);
		} else if (income >= 10001 && income <= 30000) {
			tax = income % 30;
			System.out.println("Tax on " + income + " is " + tax);
		} else if (income >= 30001 && income <= 60000) {
			tax = (float) (income * 0.20);
			System.out.println("Tax on " + income + " is " + tax);
		} else if (income >= 60000) {
			tax = (float) (income * 0.30);
			System.out.println("Tax on " + income + " is " + tax);
		} else {
			tax = (int) (0.30 * income);
			System.out.println("Tax on " + income + " is " + tax);
		}
	}

}