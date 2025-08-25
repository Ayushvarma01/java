package loops;

public class week {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			if (i == i) {
				System.err.println("*****");
				System.out.println("week " + i);
				System.err.println("*****");
			}
			for (int j = i; j <= i; j++) {
				System.out.println("Monday");
				System.out.println("Tuesday");
				System.out.println("Wednesday");
				System.out.println("Thursday");
				System.out.println("Friday");
				System.out.println("Saturday");
				System.out.println("Sunday");
			}
		}
	}
}
