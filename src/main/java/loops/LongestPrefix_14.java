package loops;

@SuppressWarnings("unused")
public class LongestPrefix_14 {
	public String longestCommonPrefix(String[] strs) {
		int smallest = strs[0].length();
		int firstIndex = 0;
		String smallStr = "";
		for (String item : strs) {
			if (item.length() <= smallest) {
				smallStr = item;
				smallest = item.length();
			}
		}

		String prefix = "";
		for (int i = 0; i < smallStr.length(); i++) {
			char firstVal = smallStr.charAt(i);
			char secondVal = 0;
			firstIndex = 0;
			for (String item : strs) {
				for (int j = 0; j < item.length(); j++) {
					secondVal = item.charAt(i);
					if (firstVal == secondVal) {
						firstIndex++;
						break;
					}
				}
			}
			if (firstIndex == strs.length) {
//				if (!prefix.contains(String.valueOf(firstVal))) {
				prefix = prefix.concat(String.valueOf(firstVal));
//				}
			} else {
				break;
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
//		String arr[] = { "flower", "flow", "flight" };
//		String arr[] = { "aa", "aa" };
//		String arr[] = { "a" };
//		String arr[] = { "cir", "car" };
//		String arr[] = { "reflower", "flow", "flight" };
		String arr[] = { "aaa", "aa", "aaa" };
		LongestPrefix_14 longestPrefix_14 = new LongestPrefix_14();
		System.out.println(longestPrefix_14.longestCommonPrefix(arr));
	}
}
