package Thread;

public class TestUsingThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello World Using Thread");
	}

	public static void main(String[] args) {
		TestUsingThread thread = new TestUsingThread();
		thread.start();
	}
}
