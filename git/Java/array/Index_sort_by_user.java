package Basic_syntax;

import java.util.Scanner;

public class Sort_by_user {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter index");
		int index = scanner.nextInt();
		int swapindex = scanner.nextInt();
		int arr[] = { 1, 2, 3, 4, 5 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				System.out.println("if");
				temp = arr[i - index];
				arr[i - index] = arr[swapindex];
				arr[swapindex] = temp;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
//		System.out.println("temp "+temp);
	}
}
