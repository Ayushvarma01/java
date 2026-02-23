package Wissen;

import Oops.Dog;

public class Test1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.a = 20;
		get(dog);
		System.out.println(dog.a);

		String nameString = "Ayush";
		System.out.println(nameString.intern());
	}

	public static void get(Dog dog) {
		dog.a = 100;
	}

}
