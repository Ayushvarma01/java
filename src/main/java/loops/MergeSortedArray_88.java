package loops;

public class MergeSortedArray_88 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = nums1.length - 1;
		for (int i = 0; i < nums2.length; i++) {
			nums1[index--] = nums2[i];
		}
		int temp = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = i; j < nums1.length; j++) {
				if (nums1[i] > nums1[j]) {
					temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
//		int arr1[] = { 1, 2, 3, 0, 0, 0 };
//		int arr2[] = { 2, 5, 6 };
		int arr1[] = { 1 };
		int arr2[] = {};
		merge(arr1, 3, arr2, 3);
	}
}
