package practice;

public class PrimeNumber03 implements Runnable {

	private int end;

	public PrimeNumber03(int end) {
		this.end = end;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		boolean b;
		for (int i = 2; i <= this.end; i++) {
			b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
				}
			}
			if (b == true) {
				System.out.print(i + " ");
			}
		}
	}
}
