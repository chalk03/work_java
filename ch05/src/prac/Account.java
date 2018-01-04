package prac;

public class Account {

	// 6-1번 2개의 필드를 선언하기.
	private String owner;
	private long balance;
	
	// 6-2번 위 모든 필드에 대한 getter와 setter를 구현하기.
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	// 6-3번 위 모든 필드를 사용하는 가능한 모든 생성자 구현하기.
	public Account() {
	}
	
	public Account(long balance) {
		super();
		this.balance = balance;
	}
	public Account(String owner) {
		super();
		this.owner = owner;
	}
	public Account(String owner, long balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
	// 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드 작성.
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	
	// 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드 작성.
	public long withdraw(long amount) {
		balance -= amount; 

		if (this.balance < amount) {
		System.err.println("잔액이 부족합니다.");
			return this.balance = 0;
		}
		return this.balance -= amount;
	}

	// Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력하기.
	public static void main(String[] args) {
		Account myMoney = new Account("강동민", 1000000);
		System.out.println("현재잔액: " + myMoney.deposit(100000));
		System.out.println("인출액: " + myMoney.withdraw(50000));
	}
}
