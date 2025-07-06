package JDBC;

import java.util.Scanner;//import Scanner class

public class Perfect_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");//printing this in console so user enter number
		int num = scanner.nextInt();//taking number and storing number into num variable 
		int temp = 0;//make one temp variable to store all number sum
		for (int i = 1; i < num; i++) {//looping the num to get all number from start to end
			if (num % i == 0) {//checking if num is fully divided by i or not
				temp += i;//if num is divided by i is come to temp and save in temp and add all divided number one by one 
			}
		}
		if (temp == num) { //checking all divided number sum is equal to original number or not 
			System.out.println("perfect number " + num);//if both number is equal then print this 
		} else {
			System.err.println("not perfect number " + num);//or not then print this 
		}
	}
}
