package Start_pattern;

public class Right_Pascals_Triangle {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//output
/*

*
**
***
****
***
**
*

*/
