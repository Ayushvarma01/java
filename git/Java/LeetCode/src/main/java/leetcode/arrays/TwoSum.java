package leetcode.arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] numbers = {3,2,4};
		int target = 6;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				int result = numbers[i] + numbers[j];
				if (result == target) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
