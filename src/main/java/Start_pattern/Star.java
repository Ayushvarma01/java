package Start_pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Star {
	public static void main(String[] args) {
//		int number = 1;
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(number);
//				number = number * 10;
//			}
//			System.out.println();
//		}

//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

//		int n = 46734633;
//		while (n > 0) {
//			n = n / 10;
//			System.out.println(n);
//		}

//		int i = 5;
//		int result = 1;
//		while (i > 0) {
//			result = i * result;
//			i--;
//		}
//		System.out.println(result);

//		String[] arr = { "Ayush", "addi" };
//		System.out.println(arr);

//		List<Integer> list = new ArrayList<Integer>();
//		int arr[] = { 2, 12, 4322, -32, 22, 0 };
//		int last = arr[0];
//		int secondLast = arr[0];
//		for (int a : arr) {
//			if (a > last) {
//				last = a;
//			} else if (a > secondLast && a < last) {
//				secondLast = a;
//			}
//		}
//		System.out.println(last);
//		System.out.println(secondLast);
//		Collections.sort(list);
//		System.out.println(list.get(list.size() - 2));
		int arr[] = { -1, -5, -2, -8, -3, -10, -1 };
		int min = arr[0];
		int secondMin = arr[0];
		for (int a : arr) {
			if (a > min) {
				min = a;
			} else if (a < secondMin && secondMin > min) {
				secondMin = a;
			}
		}
		System.out.println(min);
//		System.out.println(secondMin);
	}
}
