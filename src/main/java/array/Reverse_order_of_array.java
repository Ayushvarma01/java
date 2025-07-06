package array;

import java.util.Scanner;

public class Reverse_order_of_array {
	public static void main(String[] args) {
		String name[] = { "Ayush", "Sakshi", "Aadi", "Ram", "Aashi", "Nothing" };
		String temp;

		for (int i = name.length-1; i >= 0; i--) {

			System.out.println(name[i]);
		}

	}
}

//for (String i : name) {
//	System.out.print(i + " ");
//}