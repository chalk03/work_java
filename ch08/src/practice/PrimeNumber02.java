package practice;

public class PrimeNumber02 extends Thread {

	private int end;

	public PrimeNumber02(int end, String name) {
		this.end = end;
		setName(name);
	}

	public void run() {
		System.out.println(getName());
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
