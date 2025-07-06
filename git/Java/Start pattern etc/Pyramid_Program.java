package Ayush;

import java.util.Scanner;

public class Pyramid_Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

//output
/*

    * 
   * * 
  * * * 
 * * * * 
* * * * *

*/
