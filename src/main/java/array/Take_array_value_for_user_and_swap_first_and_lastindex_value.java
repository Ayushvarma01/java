package array;

import java.util.Scanner;

public class Take_array_value_for_user_and_swap_first_and_lastindex_value {
	public static void main(String[] args) {
		String name[] = { "Ayush", "Sakshi", "Aadi", "Ram", "Aashi", "Nothing" };
		String temp;
		if (name.length % 2 != 0) {
			System.out.println(name.length + " is Odd number Array ");
		} else {
			for (int i = 0; i < name.length; i += 2) {
//				if (i > 0) {
//					for (int a = 0; a < name.length; a++) {
				temp = name[i];
				name[i] = name[i + 1];
				name[i + 1] = temp;
				System.out.println(temp);
//					}
//				}
			}
		}
		for (String i : name) {
			System.out.print(i + " ");
		}
	}
}
