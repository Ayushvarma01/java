package LeetCode.arrays;

import java.util.Arrays;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int output[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					break;
				}
			}
		}
		Arrays.stream(output).forEach(num -> System.out.println(num));
		return output;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis(); // start time
		int arr[] = { 2, 11, 7, 15 };
//		int arr[] = { 3, 3 };
//		int arr[] = { 3, 2, 4 };
		int target = 9;
		TwoSum sum = new TwoSum();
		sum.twoSum(arr, target);
		long end = System.currentTimeMillis(); // end time

		System.out.println("Execution time: " + (end - start) + " ms");
	}
}
