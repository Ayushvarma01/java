package LeetCode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
	List<List<Integer>> combinationSum3(int repect, int target) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();

		for (int i = 1; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				for (int e = j + 1; e < 10; e++) {
					if ((i + j + e) == target) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(i);
						list.add(j);
						list.add(e);
						finalList.add(list);
					}
				}
			}
		}

//		for (int i = 1; i < 10; i++) {
//			int j = 1;
//			while (j < 10) {
//				List<Integer> list = new ArrayList<Integer>();
//				list.add(i);
//				for (int k = 1; k < repect; k++) { // 1
//					list.add(j);
//					j++;
//				}
//				finalList.add(list);
//			}
//		}
//
		System.out.println(finalList);
//		List<List<Integer>> outputList = new ArrayList<List<Integer>>();
//		for (List<Integer> list : finalList) {
//			int total = 0;
//			for (int l = 0; l < list.size(); l++) {
//				total += list.get(l);
//			}
//			if (total == target) {
//				outputList.add(list);
//			}
//		}
//		System.out.println(outputList);
		return finalList;

	}

	public static void main(String[] args) {
		Combination_Sum sum = new Combination_Sum();
		List<List<Integer>> list = sum.combinationSum3(3, 9);
	}
}
