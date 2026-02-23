package collection.List;

import java.util.ArrayList;
import java.util.List;

public class Add_and_skip_print_number {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			num.add(i);
		}

		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}
}
