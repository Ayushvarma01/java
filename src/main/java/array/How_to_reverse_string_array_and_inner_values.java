package array;

import java.util.Scanner;

public class How_to_reverse_string_array_and_inner_values {

	public static void main(String arg[]) {

		String[] arr = { "java ", " c++ ", " python" };

		for (int i = arr.length - 1; i >= 0; i--) {
			String ch = arr[i];
			for (int j = ch.length() - 1; j >= 0; j--) {
				char aa = ch.charAt(j);
				System.out.print(aa);
			}
		}

	}

}