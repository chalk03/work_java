package practice;

public class PrimeNumber03 implements Runnable {

	private int end;

	public PrimeNumber03(int end) {
		this.end = end;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 2; i <= this.end; i++) {
			for (int j = 2; j <= i; j++) {
				if (!(i == j) && i % j == 0) {
					break;
				}
				if (i == j) {
					System.out.printf("%4d", i);
				}
			}
		}
	}
}
