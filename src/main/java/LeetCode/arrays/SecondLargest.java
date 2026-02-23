package LeetCode.arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 7, 1 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > max) {
				max = num;
			}
			if (num > min && num < max) {
				min = num;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
