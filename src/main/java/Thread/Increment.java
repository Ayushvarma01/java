package Thread;

class numberIncrement {
	int i = 0;

	public void increment() {
		this.i += 1;
	}

	public int getIncrement() {
		return i;
	}
}

public class Increment {
	public static void main(String[] args) throws InterruptedException {
		numberIncrement increment = new numberIncrement();
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					increment.increment();
				}
			}
		};
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					increment.increment();
				}
			}
		};
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		System.out.println(increment.getIncrement());
	}
}
