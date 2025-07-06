package array;

public class How_to_sort_int_number {
	public static void main(String[] args) {
		int number = 312;
		char temp = '0';
		String num = Integer.toString(number);
		char ch[] = num.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[j] < ch[i]) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		for (char s : ch) {
			System.out.println(s);
		}
//		System.out.println(temp);
	}
}
