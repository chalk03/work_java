package practice;

public class Ex03 {

	
	public static void main(String[] args) {
		/*// 2번 문제
		BankAccount ba = new BankAccount(-100000);
		try {
			ba.withdraw(500000);
		} catch (InvalidWithdraw e){
			System.out.println(e.getMessage());
		}*/
		
		
		// 3-1,2번 문제 (1번 비체크, 2번 예외발생)
		BankAccount ba = new BankAccount(0);
		try {
			ba.deposit(100000);
			ba.withdraw(100000);
			ba.withdraw(200000);
		} catch (InvalidWithdraw e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
