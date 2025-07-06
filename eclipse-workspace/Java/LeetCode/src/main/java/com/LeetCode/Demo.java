package com.LeetCode;

public class Demo {
	static int a = 10;

	public static void main(String[] args) {
		sum(true, 2 != 2 ? 2 : 5, 'c', 40.51, "String");
	}

	public static void sum(Object ...a) {
		for (Object value : a) {
			System.out.println(value);
		}

	}
}
