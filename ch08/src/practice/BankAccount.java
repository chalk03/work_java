package practice;

public class BankAccount {

	private int balance; // 최저잔금 저장할 필드

	// 생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}

	// deposit(money) 입금메소드
	public void deposit(int money) {
		if (money < 0) {
			System.out.println("입금 금액이 잘못됐습니다.");
			return;
		}
		balance += money;
		System.out.printf("정상 입금처리: 입금금액=%6d, 잔금=%6d %n", money, balance);
	}

	// withdraw(money) 출금메소드
	public void withdraw(int money) throws InvalidWithdraw {
		if (money > 0 && balance >= money) {
			balance -= money;
			System.out.printf("정상 출금처리: 인출금액=%6d, 잔금=%6d %n", money, balance);
		}
		throw new InvalidWithdraw("초과출금 요구 예외");
	}
}
