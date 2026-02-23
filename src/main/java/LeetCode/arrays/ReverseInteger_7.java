package LeetCode.arrays;

public class ReverseInteger_7 {
	public int reverse(int x) {
		String numString = String.valueOf(Long.valueOf(Math.abs(x)));
		String newnum = "";
		for (int i = numString.length() - 1; i >= 0; i--) {
			if (!("-".equals(numString.charAt(i) + ""))) {
				newnum = newnum.concat(numString.charAt(i) + "");
			}
		}
		if ((Math.floor(Math.log(Long.valueOf(newnum)) / Math.log(2)) + 1) > 32) {
			return 0;
		}
		if (x < 0) {
			x = Integer.valueOf("-" + newnum);
		} else {
			x = Integer.valueOf(newnum);
		}
		return x;
	}

	public static void main(String[] args) {
		ReverseInteger_7 integer_7 = new ReverseInteger_7();
//		System.out.println(integer_7.reverse(900000));
//		System.out.println(Long.bitCount(9));
//		System.out.println(integer_7.reverse(1534236469));
//		System.out.println(integer_7.reverse(-2147483648));
		System.out.println(integer_7.reverse(1563847412));
	}
}
