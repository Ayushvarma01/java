package array;

import java.util.Scanner;

public class How_to_convert_letter_into_lower_case {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "AYUSHH";
		char[] ch = str.toCharArray();
		int val, temp;
		for (int i = 0; i < ch.length; i++) {
			temp = (int) ch[i];

			if (temp >= 65 && temp <= 90) {
				val = temp + 32;
				ch[i] = (char) val;
			}
			System.out.println(ch[i]);

		}

	}
}
