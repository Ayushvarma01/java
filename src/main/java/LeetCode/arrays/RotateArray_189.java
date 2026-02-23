package LeetCode.arrays;

import java.util.Arrays;

/*@Author
 * 
 * */
public class RotateArray_189 {
	public void rotate(int[] nums, int k) {
		int index;
		int lastNum = 0;
		int temp = 0;
		for (int i = 1; i <= k; i++) {
			lastNum = nums[nums.length - 1];
			index = nums[nums.length - i];
			for (int j = nums.length - i; j >= 0; j--) {
				temp = nums[index];
				nums[j] = temp;
			}
			nums[0] = lastNum;
		}
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
//		int nums[] = { 1, 2 };
//		int k = 7;
		RotateArray_189 rotateArray_189 = new RotateArray_189();
		rotateArray_189.rotate(nums, k);
		Arrays.stream(nums).forEach(num -> System.out.print(num + ","));
	}
}
