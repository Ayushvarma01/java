package collection;

import java.util.*;

public class Reverse_linked_list {
	public static void main(String[] args) {

		LinkedList<Integer> number = new LinkedList<>();
		number.add(5);
		number.add(6);
		number.add(2);
		number.add(1);
		number.add(3);
		number.add(4);

		for (int i = number.size() - 1; i >= 0; i--) {
			System.out.println(number.get(i));
		}
//	for(int num:arr){
//		System.out.println(num);
//	}

	}
}
