package LeetCode.arrays;

public class PowerOfTwo_231 {
	public boolean isPowerOfTwo(int n) {
		if (n == 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		if ((n > 0) && (n & (n - 1)) == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
//		int powerNumber = 16;
//		int powerNumber = 6;
		int powerNumber = -2147483648;
		PowerOfTwo_231 ofTwo_231 = new PowerOfTwo_231();
		System.out.println(ofTwo_231.isPowerOfTwo(powerNumber));

	}
}
