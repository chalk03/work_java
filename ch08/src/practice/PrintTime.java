package practice;

import java.util.Date;

public class PrintTime implements Runnable {

	private int end;

	public PrintTime(int end) {
		this.end = end;
	}

	public void run() {
		for (int i = 0; i < end; i++) {
			try {
				Thread.sleep(1000);
				Date date = new Date();
				System.out.println("순위: " + Thread.currentThread().getPriority() + " " + date + " "
						+ Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
