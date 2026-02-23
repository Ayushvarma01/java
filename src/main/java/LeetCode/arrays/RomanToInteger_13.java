package LeetCode.arrays;

import java.util.HashMap;

public class RomanToInteger_13 {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int amount = 0;
		for (int i = 0; i < s.length(); i++) {
			int nextCharIndex = (i < s.length() - 1) ? i + 1 : (s.length() - 1);
			if (s.charAt(i) == 'I' && (s.charAt(nextCharIndex) == 'V' || s.charAt(nextCharIndex) == 'X')) {
				amount += map.getOrDefault(s.charAt(nextCharIndex), 0) - map.getOrDefault(s.charAt(i), 0);
				i++;
			} else if (s.charAt(i) == 'X' && (s.charAt(nextCharIndex) == 'L' || s.charAt(nextCharIndex) == 'C')) {
				amount += map.getOrDefault(s.charAt(nextCharIndex), 0) - map.getOrDefault(s.charAt(i), 0);
				i++;
			} else if (s.charAt(i) == 'C' && (s.charAt(nextCharIndex) == 'D' || s.charAt(nextCharIndex) == 'M')) {
				amount += map.getOrDefault(s.charAt(nextCharIndex), 0) - map.getOrDefault(s.charAt(i), 0);
				i++;
			} else {
				amount += map.getOrDefault(s.charAt(i), 0);
			}
		}
		return amount;
	}

	public static void main(String[] args) {
		String s = "MCMXCIV";
		RomanToInteger_13 integer_13 = new RomanToInteger_13();
		System.out.println(integer_13.romanToInt(s));
	}
}
