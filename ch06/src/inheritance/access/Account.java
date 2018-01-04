package inheritance.access;

import java.util.Date;

/* 
 * 접근 제한자 (접근지정자)
 * - private : 같은 클래스 내부에서만 사용가능
 * - (default, package 방식) : 패키지 내부에서만 사용가능
 * - protected : default 접근 범위 + 상속받은 클래스까지 사용가능
 * - public : 어디서든 접근이 가능
 */

public class Account {
	
		public String name;		// 계좌주인
		protected Date open;	// 계좌일자
		int number;				// 계좌번호
		private long balance;	// 잔고
		
		// 기본 생성자
		public Account() {}
		
		protected Account(String name, int number) {
			this.name = name;
			this.number = number;
			this.open = new Date();
		}
		
			public long deposit(long amount) {
				return balance += amount;
			}
			
			public long withdraw(long amount) {
				return balance -= amount;
			}
			
			public long checkBalance() {
				System.out.println(name + ": 계좌번호 " + number + ", 잔액 " + balance);
				return balance;
			}
}
