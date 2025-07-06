package Basic_syntax;

import java.util.Scanner;

public class Bubble_sort_array {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your array index");
//		int index = scanner.nextInt();
//		int arr[] = new int[index];

//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scanner.nextInt();
//		}

		int arr[] = { -53, -62, -76, -1, 0, 5, 2, 4, 1, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		 
	}
}
