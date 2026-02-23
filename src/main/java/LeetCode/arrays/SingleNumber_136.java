package LeetCode.arrays;

public class SingleNumber_136 {
	public int singleNumber(int[] nums) {
		int number = 0;
		for (int i : nums) {
			for (int j = 0; j < nums.length; j++) {
				if (i == nums[j]) {
					break;
				}
			}
		}
		return number;
	}

	public static void main(String[] args) {
//		int nums[] = { 2, 2, 1 };
		int nums[] = { 4, 1, 2, 1, 2 }; // 4
		SingleNumber_136 number_136 = new SingleNumber_136();
		System.out.println(number_136.singleNumber(nums));
	}
}
