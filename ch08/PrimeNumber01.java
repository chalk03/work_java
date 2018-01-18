package practice;

public class PrimeNumber01 extends Thread {

	private int i;

	public PrimeNumber01(int i) {
		this.i = i;
	}

	public void run() {
		for (int i = 2; i <= 20; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

				} else {
					System.out.printf("%d ", i);
				}
			}

		}
	}
}
