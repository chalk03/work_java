package com.koitt.java.deliver;

/*
 *  디자인 패턴 - 템플릿 메소드 패턴(Template Method Pattern)
 */
public abstract class Process {
	// 1. 주문 받기
	public abstract void ordering();
	
	// 2. 요리 하기
	public abstract void cooking();
	
	// 3. 배달 하기
	public abstract void delivering();
	
	// 4. 결제 하기
	public abstract void payment();
	
	// 순서대로 호출하는 메소드 구현
	public void processing() {
		this.ordering();
		this.cooking();
		this.delivering();
		this.payment();
	}
	
	public static void main(String[] args) {
		Process c = new Chinese();
		Process p = new Pizza();
		Process ch = new Chicken();
		
		Process[] stores = new Process[3];
		stores[0] = c;
		stores[1] = p;
		stores[2] = ch;
		
		for (int i = 0; i<stores.length; i++) {
			stores[i].processing();
		}
	}
}
