package Basic_syntax;

public class Swap_two_array_index_value {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				temp = arr[0];
				arr[0] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		for (int i : arr) {
			System.out.print(i+" ");
		}
//		System.out.println(temp);
	}
}
