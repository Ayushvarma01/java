package LeetCode.arrays;

public class AddDigits_258 {
	public int addDigits(int num) {
		String digitString = String.valueOf(num);
		while (digitString.length() > 1) {
			int total = 0;
			for (int i = 0; i < digitString.length(); i++) {
				int digit = digitString.charAt(i) - '0';
				total += digit;
				System.out.println(total);
			}
			digitString = String.valueOf(total);
		}
		return Integer.valueOf(digitString);
	}

	public static void main(String[] args) {
		AddDigits_258 addDigits_258 = new AddDigits_258();
		addDigits_258.addDigits(0);
	}
}