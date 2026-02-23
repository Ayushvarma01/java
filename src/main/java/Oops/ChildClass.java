package Oops;

public class ChildClass extends PerentClass {

	public static final int count;

	static {
		count = 1;
	}

	public ChildClass() {
	}

	@Override
	public void get() {
		System.out.println("This is child class.");
//		super.get();
	}

	void getMe() {
		System.out.println("This is getMe in child class.");
		super.get();
	}
}
