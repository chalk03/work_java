package thread;

class MyThread extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++)
			System.out.println(getName() + ": " + i + "/ 실제스레드: " + Thread.currentThread().getName());
	}
}

public class SimpleThread {

	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
		
		MyThread th2 = new MyThread();
		th2.start();
	}
}
