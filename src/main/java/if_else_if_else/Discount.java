package if_else_if_else;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		float discount;
		float finalprice = 0;
		if (price <= 50) {
			discount = (float) (price - (price * 0.5));
			System.out.println("discount below $50 and  final price is " + discount);
		} else if (price <= 100 && price >= 50) {
			discount = (float) (price - (price * 0.10));
			System.out.println("discont above $50 and $100 below and final price is " + discount);
		} else {
			discount = (float) (price - (price * 0.15));
			System.out.println("Discount above $100 and final price is " + discount);
		}

	}

}