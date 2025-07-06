package List;

import java.util.ArrayList;
import java.util.List;

public class Add_numbers_and_print {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);

		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}
}
