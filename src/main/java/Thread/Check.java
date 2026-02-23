package Thread;

public class Check {

	public static void main(String[] args) throws InterruptedException {
		StringBuilder name = new StringBuilder();

		task1 thread1 = new task1(name);
		task2 thread2 = new task2(name);
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();

		System.out.println(name.length());

	}

}

class task1 extends Thread {
	StringBuilder name = new StringBuilder();

	public task1(StringBuilder name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			name.append("a");
		}
	}
}

class task2 extends Thread {
	StringBuilder name = new StringBuilder();

	public task2(StringBuilder name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			name.append("a");
		}
	}
}
