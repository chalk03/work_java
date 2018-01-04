package prac;

public class AccountTest {

	public static void main(String[] args) {
		Account myMoney = new Account("강동민", 1000000);
		System.out.println("현재잔액: " + myMoney.withdraw(1100000));
	}
}
