package LeetCode.arrays;

import java.util.Arrays;

public class MoveZero {
	public void moveZeroes(int[] nums) {
		int first = 0;
		int second = 0;
		for (int i = 0; i < nums.length; i++) {
			first = nums[i];
			if (first > 0) {
				if (i != nums.length - 1) {
					second = nums[i + 1];
					int temp = first;
					nums[i] = second;
					nums[i + 1] = temp;
				}

			}
		}
		Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
	}

	public static void main(String[] args) {
		// 0 1 2 3 4
		int arr[] = { 0, 1, 0, 3, 12 };
		MoveZero moveZero = new MoveZero();
		moveZero.moveZeroes(arr);
	}
}
