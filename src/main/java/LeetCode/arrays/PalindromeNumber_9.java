package LeetCode.arrays;

public class PalindromeNumber_9 {
	public boolean isPalindrome(int x) {
		char ch[] = String.valueOf(x).toCharArray();
		int last = ch.length - 1;
		for (int i = 0; i < ch.length / 2; i++) {
			if (ch[i] != ch[last--]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 10;
		PalindromeNumber_9 number_9 = new PalindromeNumber_9();
		System.out.println(number_9.isPalindrome(num));
	}
}
