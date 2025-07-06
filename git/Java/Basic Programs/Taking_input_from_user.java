package Basic_programs;

import java.util.*;

public class Taking_input_from_user {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name, number, check, character, decimal , desimald");
		String name = scanner.nextLine();
		int number = scanner.nextInt();
		boolean check = true; // default value false
		char character = scanner.next().charAt(0);
		float decimalf = scanner.nextFloat();
		double decimald = scanner.nextDouble();
		System.out.println("name " + name);
		System.out.println("number " + number);
		System.out.println("check " + check);
		System.out.println("character " + character);
		System.out.println("desimalf " + decimalf);
		System.out.println("desimald " + decimald);

	}

}
