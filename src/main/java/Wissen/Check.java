package Wissen;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Check {
	public static final int load(int a) {
		return 0;
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		executor.submit(() -> System.out.println("Hello World"));
		List<Callable<String>> list = Arrays.asList(() -> "Task 1");
		executor.invokeAll(list);
		executor.shutdown();

	}
}
