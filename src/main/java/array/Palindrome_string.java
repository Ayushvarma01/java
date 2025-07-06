package array;

import java.util.*;

public class Palindrome_string {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String word = "malayalam";
//		char[] arr = word.toCharArray();
		char revch = 0;
		String revfinalword = "";
		boolean condition = true;
		for (int i = word.length() - 1; i >= 0; i--) {
			revch = word.charAt(i);
			revfinalword += revch;
		}

		for (int i = 0; i < revfinalword.length(); i++) {
			char ch = revfinalword.charAt(i);
			for (int j = 0; i < word.length(); j++) {
				char letter = word.charAt(i);

				if (ch != letter) {
					condition = false;
					break;
				} else {

					condition = true;
					break;

				}
			}
		}
		if (condition) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}

