package Wissen;

public class CheckString {
	public static void main(String[] args) {
		String str = "aabbcde";
		for (int i = 0; i < str.length(); i++) {
			String ch = String.valueOf(str.charAt(i));
			String sub = str.substring(str.length() - i, str.length());
			System.out.println(ch + " " + sub + " " + sub.contains(ch));
			if (!sub.contains(ch)) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
