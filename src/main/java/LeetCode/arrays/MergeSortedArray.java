package LeetCode.arrays;

import java.util.Arrays;

// This code is submitted on LeetCode because test case failed.
// According to ChatGPT this code output is same but there is logic issue.
public class MergeSortedArray {
	public static void main(String[] args) {
		int num1[] = { 1, 2, 3, 0, 0, 0 };
		int num2[] = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		merge(num1, m, num2, n);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int temp[] = new int[m + n];
		int index = 0;
		for (int i = 0; i < m; i++) {
			if (nums1[i] > 0) {
				if (nums1[i] <= nums2[i]) {
					temp[index] = nums1[i];
					index++;
				}
				if (nums2[i] >= nums1[i]) {
					temp[index] = nums2[i];
					index++;
				}
			}
		}
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
	}
}
