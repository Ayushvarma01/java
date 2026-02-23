package Oops;

public class Dog extends Animal {

	public int a = 10;

	void get() {
		System.out.println("Dog");
	}

	@Override
	public String getA(String name) {
		System.out.println("Dog");
		return name;
	};

}
