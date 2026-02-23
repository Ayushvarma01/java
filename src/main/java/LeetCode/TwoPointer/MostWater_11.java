package LeetCode.TwoPointer;

public class MostWater_11 {
	public int maxArea(int[] height) {
		int totalWater = 0;
		int mid = height.length % 2;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			int difference = right - left;
			int small = height[left] > height[right] ? height[right] : height[left];
			int area = difference * small;
			if (area > totalWater) {
				totalWater = area;
			}
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
			mid--;
		}
		return totalWater;
	}

	public static void main(String[] args) {
		int num[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
//		int num[] = { 4, 3, 2, 1, 4 };
//		int num[] = { 1, 1 };
//					  0  1  2    3   4	
//		int num[] = { 1, 2, 3, 1000, 9 };
		MostWater_11 water_11 = new MostWater_11();
		System.out.println(water_11.maxArea(num));
	}
}
