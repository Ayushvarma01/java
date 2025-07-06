package Ayush;

import java.util.Scanner;

public class Sandglass_Star_Pattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= 4 ; k++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
}

//output
/*

 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 
 */
