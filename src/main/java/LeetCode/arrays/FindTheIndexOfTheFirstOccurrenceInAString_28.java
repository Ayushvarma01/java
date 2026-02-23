package LeetCode.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FindTheIndexOfTheFirstOccurrenceInAString_28 {
	public int strStr(String haystack, String needle) {
//		List<Character> list = new ArrayList<Character>();

//		for (char ch : haystack.toCharArray()) {
//			list.add(ch);
//		}

//		int startIndex = list.indexOf(needle.charAt(0));

		String nameString = " ";
		System.out.println(nameString.length());
		System.out.println(nameString.isEmpty());
		System.out.println(nameString.isBlank());

//		int i = 0;
//		for (i = startIndex; i < list.size(); i++) {
//			if (needle.charAt(charIndex) == list.get(i)) {
//				if (needle.charAt(0) == list.get(i)) {
//					resetIndex = i;
//				}
//				charIndex++;
//				check = true;
//			} else {
//				startIndex = resetIndex;
//				charIndex = 0;
//				check = false;
//			}
//			if (check && charIndex == needle.length()) {
//				return resetIndex;
//			}
//
//		}

//		for (int i = 0; i < haystack.length(); i++) {
//			String val = haystack.substring(i, needle.length());
//			if (val.equals(needle)) {
//				return i;
//			}
//
//		}
		return -1;
	}

	public static void main(String[] args) {
		String haystack = "mississippi", needle = "issip";
//		String haystack = "leetcode", needle = "leeto";
		FindTheIndexOfTheFirstOccurrenceInAString_28 aString_28 = new FindTheIndexOfTheFirstOccurrenceInAString_28();
		System.out.println(aString_28.strStr(haystack, needle));
	}
}
