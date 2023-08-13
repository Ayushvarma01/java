package Basic_syntax;

import java.util.Scanner;

public class Take_array_value_for_user_and_swap_first_and_lastindex_value {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Index of array");
		int index = scanner.nextInt();
		int arr[] = new int[index];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				temp = arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
