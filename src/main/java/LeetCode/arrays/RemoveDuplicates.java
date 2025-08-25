package LeetCode.arrays;

public class RemoveDuplicates {

	public int removeDuplicates(int[] arr) {
		int index = 0;
		int len = 0;
		boolean check = false;
		while (index < arr.length) {
			int first = arr[index];
			int second = 0;
			if (index != arr.length - 1) {
				second = arr[index + 1];
			}

			if (first != second) {
				arr[len] = first;
				len++;
				check = false;
			} else {
				if (first == 0 && second == 0) {
					arr[len] = first;
					check = true;
				} else {
					check = false;
				}
			}
			index++;
		}

		if (check) {
			len += 1;
		}
		return len;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2 };
//		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
//		int arr[] = { 0, 0, 0, 0, 0 };
//		int arr[] = { -3, -1, 0, 0 };
//		int arr[] = { 0, 0, 0, 0, 3 };
//		int arr[] = { -3, -1, -1, 0, 0, 0, 0, 0 };
		int k = new RemoveDuplicates().removeDuplicates(arr);
		for (int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}
	}

}
