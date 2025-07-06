package array;

import java.util.*;

public class Spaces_remove {
	public static boolean condition(String name) {
		boolean check = false;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch != ' ') {
				check = true;
				if (check) {
					System.out.print(ch);
				} else {
					System.out.println("Some thing wrong");
				}
			}
		}
		return check;
	}

	public static void main(String[] args) {
		String text = "  Ayush,  varma,  !     ";
		System.out.println("Original text: \"" + text + "\"");
		condition(text);

	}

}
