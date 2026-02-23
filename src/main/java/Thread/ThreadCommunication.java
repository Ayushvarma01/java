package Thread;

class ShareResource {
	int data;
	boolean hasData;

}

class Producer implements Runnable {
	public ShareResource resource;

	public Producer(ShareResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {

	}

}

class Consumer implements Runnable {
	public ShareResource resource;

	public Consumer(ShareResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {

	}

}

public class ThreadCommunication {
	public static void main(String[] args) {
		ShareResource resource = new ShareResource();
		Thread thread1 = new Thread(new Producer(resource));
		Thread thread2 = new Thread(new Producer(resource));
	}
}
