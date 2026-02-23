package LeetCode.arrays;

public class LexicographicallySmallestPalindrome_2697 {
	public String makeSmallestPalindrome(String s) {
		int mid = s.length() / 2;
		int start = 0;
		int end = s.length() - 1;
		char ch[] = s.toCharArray();
		while (mid >= 1) {
			int first = s.charAt(start);
			int second = s.charAt(end);
			if (first == second) {
				end--;
				start++;
				mid--;
				continue;
			}
			if (first < second) {
				ch[end] = ch[start];
			} else {
				ch[start] = ch[end];
			}
			end--;
			start++;
			mid--;
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		String str = "egcfe";
//		String str = "bhh";
//		String str = "abcd";
		LexicographicallySmallestPalindrome_2697 palindrome_2697 = new LexicographicallySmallestPalindrome_2697();
		System.out.println(palindrome_2697.makeSmallestPalindrome(str));
	}
}
