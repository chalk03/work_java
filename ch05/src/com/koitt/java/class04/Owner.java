package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {

	private String name;		// 주인 이름
	private Car car;			// 차 이름
	
	
	public Owner(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}

	// 자동차를 소개하는 메소드 출력입니다.
	public void introCar() {
		System.out.print(name + "의 자동차 브랜드 이름은: " );
		System.out.print(car.getBrandName() + "이고 ");
		System.out.println("최고속도는 " + car.getMaxSpeed()  + "km/h 입니다.");
	}
	
	public static void main(String[] args) {
		Car car = new Car("포르쉐", 500);
		Owner nm = new Owner("강동민", car);
		nm.introCar();
		
		Car car1 = new Car("부가쉐", 500);
		Owner nm1 = new Owner("강동민민", car1);
		nm1.introCar();
		
	}
}
