package Thread;

public class CheckTime {
	public static void main(String[] args) throws InterruptedException {

		long start = System.currentTimeMillis();

		StringBuffer task = new StringBuffer();
		task1Time task1Time = new task1Time(task);
		task2Time task2Time = new task2Time(task);

		task1Time.start();
		task2Time.start();

		task1Time.join();
		task2Time.join();

		long end = System.currentTimeMillis();

		System.out.println(end - start);
		System.out.println(task.length());
	}
}

class task1Time extends Thread {
	StringBuffer task = new StringBuffer();

	public task1Time(StringBuffer task) {
		this.task = task;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			task.append("a");
		}
	}
}

class task2Time extends Thread {
	StringBuffer task = new StringBuffer();

	public task2Time(StringBuffer task) {
		this.task = task;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			task.append("a");
		}
	}
}