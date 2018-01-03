package prac;

public class Account {

	private String owner;
	private long balance;
	public long amount;
	
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
	
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	
	public long withdraw(long amount) {
		balance -= amount; 

		if (amount > balance) {
		System.out.println("잔액이 부족합니다.");
			return getBalance();
		}
		return 0;
	}

	public static void main(String[] args) {
		Account myMoney = new Account();
		System.out.print("입금액: " + myMoney.deposit(100000));
		System.out.print("인출액: " + myMoney.withdraw(50000));
	}
}
