package important_program;

import java.util.*;

public class Sort_linked_list {
	public static void main(String[] args) {

		LinkedList<Integer> number = new LinkedList<>();
		number.add(5);
		number.add(6);
		number.add(2);
		number.add(1);
		number.add(3);
		number.add(4);
		// Convert LinkedList to an integer array
		int arr[] = new int[number.size()];
		int index = 0;
		for (int num : number) {
			arr[index++] = num;
		}
		// Sorting the integer array (bubble sort)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
		}
		for (int num : arr) {
			System.out.println(num);
		}

	}
}
