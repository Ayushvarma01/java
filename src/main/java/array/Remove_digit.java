package array;

import java.util.*;
import java.text.*;

public class Remove_digit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input ");
		String input = scanner.nextLine();//taking input from user and storing into input variable  

		String temp = new String();//taking new object String to store new String after loop
		for (int i = 0; i < input.length(); i++) {//looping input string 
			char ch = input.charAt(i);// converting input String into char array format

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ( ch==' ')) {//checking if ch array have a to z( A to Z ) character into char array or not  
				temp += ch;//and storing only character into temp object
			}

		}
		System.out.println(temp);//and finally printing temp variable to user console
	}

}
