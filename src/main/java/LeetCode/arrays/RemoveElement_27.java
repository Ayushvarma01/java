package LeetCode.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement_27 {
	public int removeElement(int[] nums, int val) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				list.add(nums[i]);
			}
		}

		int index = 0;
		for (int i : list) {
			nums[index] = list.get(index);
			index++;
		}
		return list.size();
	}

	public static void main(String[] args) {
//		int num[] = { 3, 2, 2, 3 };
		int num[] = { 0, 1, 2, 2, 3, 0, 4, 2 }; // 0,1,4,0,3
		int val = 2;
		RemoveElement_27 element_27 = new RemoveElement_27();
		element_27.removeElement(num, val);
	}
}
