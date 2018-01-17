package thread;

import java.util.Random;

class BankAccount {
	int balance = 0;

	// 인출
	public synchronized void withdraw(int money) {	// withdraw 메소드 전체를 임계영역으로 잡는다.

		// 현재 출금하려는 금액보다 잔고가 많은지 검사
		
		if (money > 0 && balance >= money) {
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}*/
			balance -= money;
			System.out.printf("%s %d 인출하여 현재잔고 %d입니다. %n", Thread.currentThread().getName(), money, balance);
		} else if (balance < money) {
			System.out.println("잔고가 부족하여 인출할 수 없습니다.");
		}
	}

	// 입금
	public void deposit(int money) {
		synchronized (this) {	// 중괄호 시작부터 중괄호 끝나느 부분까지 임계영역으로 설정
			if (money > 0) {
				balance += money;
				System.out.printf("%s가 %d 입금하여 현재잔고 %d입니다. %n", Thread.currentThread().getName(), money, balance);
			}
		}
	}
}

public class SyncTest implements Runnable {
	BankAccount act = new BankAccount();

	@Override
	public void run() {
		// while (true) {
		for (int i = 0; i < 3; i++) {
			int amount = new Random().nextInt(10000);
			amount = amount % 10 * 1000;
			System.out.printf("[%s] 금액 = %d %n", Thread.currentThread().getName(), amount);
			act.deposit(amount);
			act.withdraw(amount * 2);
			if (act.balance < 0) {
				System.out.printf("[%s] ", Thread.currentThread().getName());
				System.out.println("잔고: " + act.balance + " => 오류 종료");
				return;
			}
		}
	}

	public static void main(String[] args) {
		Runnable r = new SyncTest();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);

		th1.setName("철수");
		th2.setName("영희");

		th1.start();
		th2.start();
	}
}
