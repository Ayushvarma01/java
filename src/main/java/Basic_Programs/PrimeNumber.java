package Basic_Programs;

public class PrimeNumber {
	public static void main(String... args) {
		System.out.println(checkPrime(4));
		
	}

	public static Boolean checkPrime(int number) {
		int res = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				res++;
			}
		}
		return res == 2;
	}
}
