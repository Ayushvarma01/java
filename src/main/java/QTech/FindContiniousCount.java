package QTech;

import java.util.HashMap;

public class FindContiniousCount {
	public static void main(String[] args) {
		String a = "aabbcccdacccc";
		// Map to store character and its maximum consecutive count
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 1; // This variable keeps track of consecutive character count
		for (int i = 0; i < a.length(); i++) {
			// Current character
			char ch1 = a.charAt(i);
			// Next character (initialize with space)
			char ch2 = ' ';
			// Check if next character exists
			if (i < a.length() - 1) {
				ch2 = a.charAt(i + 1);
			}
			// If current character and next character are same
			if (ch1 == ch2) {
				count++; // Increase consecutive count
				// Check if current count is greater than already stored count in map
				if (count > map.getOrDefault(ch1, 1)) {
					// ❌ Problem is here:
					// You are using getOrDefault inside getOrDefault incorrectly.
					// This line does not store the correct value in the map.
					map.put(ch1, map.getOrDefault(map.getOrDefault(ch1, 0) + count, count));
				}
			} else {
				// If characters are different, reset count
				count = 1;
			}
		}
		// Print final map
		System.out.println(map);
	}
}
