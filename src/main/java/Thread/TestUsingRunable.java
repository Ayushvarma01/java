package Thread;

public class TestUsingRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello World In Runnable ");
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable runable = new TestUsingRunable();
		Thread thread = new Thread(runable);
		thread.start();
		thread.setPriority(1);
//		thread.wait(1000);
		System.out.println(Thread.currentThread().getName());
	}

}
