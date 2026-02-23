package Wissen;

public class Outer {

	class Inner {
		static final int a = 10;

		static void show() {
			System.out.println(Inner.a);
			System.out.println("Hello");
		}

	}

	public static void main(String[] args) {
		Outer.Inner.show();
	}
}
