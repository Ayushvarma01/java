package Ayush;

public class Remove_special_char_spaces {
	public static void main(String[] args) {
		String str = "2 Race@ e cAr 2"; // 2raceecar2
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int temp = ch[i];
			if (temp >= 65 && temp <= 90) {
				temp = temp + 32;
				ch[i] = (char) temp;
			}
			if ((temp >= 48 && temp <= 57) || (temp >= 97 && temp <= 122)) {
				ch[i] = (char) temp;
				System.out.print(ch[i]);
			}
		}

	}
}

// 2raceecar2