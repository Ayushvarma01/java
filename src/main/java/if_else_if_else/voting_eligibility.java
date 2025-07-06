package if_else_if_else;

import java.util.*;

public class voting_eligibility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age =scanner.nextInt();
		if(age>=18) {
			System.out.println("You Can Apply For voting Card");
		}
		
		else {
			System.err.println("You Are Not Eligible");
		}

	}

}