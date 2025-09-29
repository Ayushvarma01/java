package LeetCode.arrays;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int count = 0;
		int index = 0;
//		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				nums[index++] = val;
				count++;
			} else {
				nums[index++] = 0;
			}
			for (int j = i; j < nums.length; j++) {
				if (nums[j] == 0) {
					
				}
			}

		}
		Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 2, 3 };
//		int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		RemoveElement element = new RemoveElement();
		element.removeElement(arr, val);
	}
}
