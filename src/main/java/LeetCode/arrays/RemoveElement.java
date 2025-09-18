package LeetCode.arrays;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int temp = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val && i != nums.length) {
				temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i] = 0;
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 2, 3 };
		int val = 3;
		RemoveElement element = new RemoveElement();
		element.removeElement(arr, val);
		Arrays.stream(arr).forEach(num -> System.out.println(num));
	}
}
