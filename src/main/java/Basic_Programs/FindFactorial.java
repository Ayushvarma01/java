package Basic_Programs;

public class FindFactorial {
	public static void main(String[] args) {
		System.out.println(factorical(6));
	}

	public static int factorical(int a) {
		if (a == 1) {
			return 1;
		}
		return a + factorical(a - 1);
	}
}
