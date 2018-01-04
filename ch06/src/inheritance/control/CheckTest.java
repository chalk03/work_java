package inheritance.control;

import inheritance.access.SavingAccount;

public class CheckTest {

	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 234567654, 0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);
		//System.out.println(myAccount.open);
		//System.out.println(myAccount.number);
		//System.out.println(myAccount.balance);
		
		CheckAccount cAccount = new CheckAccount("이민정", 87542356, 500000);
		cAccount.deposit(250000);
		cAccount.withdraw(50000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name);
		System.out.println(cAccount.minimum);
		//System.out.println(cAccount.open);
		//System.out.println(cAccount.number);
		//System.out.println(cAccount.balance);
	}
}
