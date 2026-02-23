package LeetCode.arrays;

public class FindTheDuplicateNumber_287 {
	public int findDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 2; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return nums[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 2, 2 };
//		int nums[] = { 3, 1, 3, 4, 2 };
//		int nums[] = { 3, 3, 3, 3, 3 };
		FindTheDuplicateNumber_287 number_287 = new FindTheDuplicateNumber_287();
		System.out.println(number_287.findDuplicate(nums));
	}
}
