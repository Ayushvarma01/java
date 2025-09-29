package LeetCode.arrays;

public class PlueOne_66 {
	public int[] plusOne(int[] digits) {
		int number = 1;
		int total = 0;
		int temp[] = null;

		for (int i = digits.length - 1; i >= 0; i--) {
			total = digits[i] + number;
			digits[i] = total;
			number = 0;
			if (total > 9) {
				digits[i] = 0;
				number = 1;
			}
		}
		if (total > 9) {
			temp = digits;
			temp = new int[digits.length + 1];
			temp[0] = number;
		} else {
			temp = digits;
		}
		return temp;
	}

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3 };
		int arr[] = { 9 };
//		int arr[] = { 0 };
//		int arr[] = { 4, 3, 2, 1 };
//		int arr[] = { 4, 3, 2, 9 }; // 4, 3, 3, 0
//		int arr[] = { 9, 9 }; //
//		int arr[] = { 8, 9, 9, 9 }; // 9,0,0,0
//		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }; // 9,8,7,6,5,4,3,2,1,1
		PlueOne_66 one_66 = new PlueOne_66();
		one_66.plusOne(arr);
	}
}
