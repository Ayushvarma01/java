package Oops;

public class Oops {
	String name;

//	Oops() {
//		this.name = "Ayush";
//		System.out.println(this);
//	}

	protected void show() {
		System.out.println("Oops");
	}

	public static void main(String[] args) {
		Oops Obj = new Oops();
		System.out.println(Obj);
	}
}
