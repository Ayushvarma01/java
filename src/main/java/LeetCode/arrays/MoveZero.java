package LeetCode.arrays;

import java.util.Arrays;

public class MoveZero {
	public void moveZeroes(int[] nums) {
		int firstIndexVal = 0;
		int secondIndexVal = 0;

		for (int index = 0; index < nums.length; index++) {
			firstIndexVal = nums[index];

			if (firstIndexVal != 0) {
				if (index != nums.length - 1) {

					secondIndexVal = nums[index + 1];
					int tempIndexVal = firstIndexVal;
					nums[index] = secondIndexVal;
					nums[index + 1] = tempIndexVal;

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
