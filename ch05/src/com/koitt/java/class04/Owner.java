package com.koitt.java.class04;

import com.koitt.java.class03.Cat;

import obj.constructor.Car;

public class Owner {

	private String name;		// 주인 이름
	private Car[] car;			// 차 이름
	
	

public Owner(String name, Car[] car) {
		super();
		this.name = name;
		this.car = car;
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 자동차를 소개하는 메소드 출력입니다.
	public void introCar() {
		for (int i = 0; i < car.length; i++) {
		System.out.print(name + "의 자동차 브랜드 이름은: " );
		System.out.print(car[i].getBrandName() + "이고 ");
		System.out.println("최고속도는 " + car[i].getMaxSpeed()  + "km/h 입니다.");
		}
	}
	public static void main(String[] args) {
		Car[] car2 = new Car[3];
		car2[0] = new Car("포르쉐1호", 100);
		car2[1] = new Car("포르쉐2호", 200);
		car2[2] = new Car("포르쉐3호", 300);
		
		Car[] car3 = new Car[3];
		car3[0] = new Car("부가티1호", 100);
		car3[1] = new Car("부가티2호", 200);
		car3[2] = new Car("부가티3호", 300);

		//Car[] cars = new Car[](car2, 500);
		Owner nm = new Owner("홍길동", car3);
		nm.setCar(car3);
		nm.introCar();
	
		
		
	}	
}


