package LeetCode.arrays;

import java.util.ArrayList;
import java.util.List;

public class LengthofLastWord_58 {
	public int lengthOfLastWord(String s) {
		List<Integer> list = new ArrayList<Integer>();
		String newValue = s.strip();
		for (int i = newValue.length() - 1; i >= 0; i--) {
			if ((int) newValue.charAt(i) != 32) {
				list.add((int) newValue.charAt(i));
			} else {
				break;
			}
		}
		return list.size();
	}

	public static void main(String[] args) {
		String str = "  Hello World    ";
		LengthofLastWord_58 word_58 = new LengthofLastWord_58();
		word_58.lengthOfLastWord(str);
	}
}
