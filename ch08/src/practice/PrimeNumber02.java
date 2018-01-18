package practice;

public class PrimeNumber02 extends Thread {

	private int end;

	public PrimeNumber02(int end, String name) {
		this.end = end;
		setName(name);
	}

	public void run() {
		System.out.println(getName());

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
