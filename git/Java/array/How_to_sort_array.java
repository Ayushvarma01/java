package important_program;

public class How_to_sort_array {
	public static void main(String[] args) {

		int arr[] = { 1, 5, 2, 6, 3, 4 };

		int temp;
//		ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
//		descending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp1 = arr[j];
					arr[j] = arr[i];
					arr[i] = temp1;
				}
			}
		}
		for (int num : arr) {
			System.out.println(num);
		}
		
	}
}
