package LeetCode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public List<List<Integer>> combinationSum3(int repect, int target) {
		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 1,1,1/1,1,2..
		// 1,2,1/1,2,2/1,2,3/1,2,4
		List<List<Integer>> mainList = new ArrayList<List<Integer>>();
		int index = 1;
		while (index <= 9) {
			List<Integer> list = new ArrayList<Integer>();
			int innerIndex = 1;
			while (innerIndex <= repect) {
				for (int j = 0; j < numbers.length; j++) {
					int sum = index + innerIndex + numbers[j];
					System.out.println(index + " " + innerIndex + " " + numbers[j]);
					if ((index != innerIndex) && (index != numbers[j]) && (innerIndex != numbers[j])
							&& (sum == target)) {
						System.out.println(index + " " + innerIndex + " " + numbers[j]);
						list.add(index);
						list.add(innerIndex);
						list.add(numbers[j]);
						mainList.add(list);
					}
				}
				innerIndex++;
			}
			index++;
		}
		return null;
	}

	public static void main(String[] args) {
		Combination_Sum sum = new Combination_Sum();
		List<List<Integer>> list = sum.combinationSum3(9, 45);
	}
}
