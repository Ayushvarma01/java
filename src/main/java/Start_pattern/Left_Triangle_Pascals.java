package Start_pattern;

public class Left_Triangle_Pascals {
	public static void main(String[] args) {
		int rows = 4;
		for (int i = 1; i <= rows; i++) {
			for (int j = 3; j >= i; j-- ) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 3; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

//output

/*
 
 ****
  ***
   **
    *

*/
