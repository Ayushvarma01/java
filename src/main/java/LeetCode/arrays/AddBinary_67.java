package LeetCode.arrays;

public class AddBinary_67 {
	public String addBinary(String a, String b) {
		int sum = a.hashCode() + b.hashCode();
		byte[] byt = a.getBytes();
		StringBuilder builder = new StringBuilder();
		System.out.println(Integer.toBinaryString(sum));
		return String.valueOf(sum);
	}

	public static void main(String[] args) {
		String a = "11", b = "1";
		AddBinary_67 binary_67 = new AddBinary_67();
		System.out.println(binary_67.addBinary(a, b));
	}
}
