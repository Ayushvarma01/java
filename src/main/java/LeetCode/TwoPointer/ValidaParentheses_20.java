package LeetCode.TwoPointer;

public class ValidaParentheses_20 {
	public boolean isValid(String s) {
		int len = s.length() / 2;
		int left = len - 1;
		int right = len;
		boolean valid = false;
		while (len > 0) {
			int nextCharValue;
			if (s.charAt(left) == '(') {
				nextCharValue = s.charAt(left) + 1;
				if (s.charAt(right) == nextCharValue) {
					valid = true;
				}
				left--;
				right++;
			}
			if (s.charAt(left) == '[' || s.charAt(left) == '{') {
				nextCharValue = s.charAt(left) + 2;
				if (s.charAt(right) == nextCharValue) {
					valid = true;
				}
				left--;
				right++;
			} else {
				valid = false;
				break;
			}
			len--;
		}
		System.out.println(valid);
		return valid;
	}

	public static void main(String[] args) {
		System.out.println((int) '(');
		System.out.println((int) ')');
//		String parenthess = "()[]{}";
		String parenthess = "()";
		ValidaParentheses_20 parentheses_20 = new ValidaParentheses_20();
		parentheses_20.isValid(parenthess);
	}
}
