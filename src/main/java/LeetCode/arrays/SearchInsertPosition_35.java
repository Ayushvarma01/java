package LeetCode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SearchInsertPosition_35 {
	public int searchInsert(int[] nums, int target) {
		int position = 0;
		int start = 0;
		int end = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
			if (nums[start] < target && nums[end] > target) {
				start++;
			}
			if (nums[start] < target && nums[end] < target) {
				start++;
			}

		}
		if (position == 0) {
			position = start;
		}
		return position;
	}

	public static void main(String[] args) {
//		int nums[] = { 1, 3, 5, 6 };
//		int target = 2; // 1
		int nums[] = { 1, 3, 5, 6 };
		int target = 7;
		SearchInsertPosition_35 position_35 = new SearchInsertPosition_35();
		int index = position_35.searchInsert(nums, target);
		System.out.println(index);
	}
}
