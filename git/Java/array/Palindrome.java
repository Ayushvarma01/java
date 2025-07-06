package important_program;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = "wow";
		char ch = 0, rev = 0;
		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
//			System.out.println(ch);
		}
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = string.charAt(i);
//			System.out.println(rev);
		}
		if (ch == rev) {
			System.out.println(string + " String is Palindrome ");
		} else {
			System.out.println(string + " String is not a Palindrome ");
		}

	}
}
