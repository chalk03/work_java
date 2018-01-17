package practice;

public class BankAccount {

	private int balance;	// 최저잔금 저장할 필드

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
		System.out.printf("%d원을 입금하여 현재잔고: %d원 입니다. %n", money, balance);
	}
	
	public void withdraw(int money) {
		if (money < 0 || money>balance) {
			System.out.println("인출 금액이 잘못됐습니다.");
			return;
		}
		balance -= money;
		System.out.printf("%d원을 인출하여 현재잔고: %d원 입니다. %n", money, balance);
	}
	
	
}
