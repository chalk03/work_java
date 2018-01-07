package prac;

public class Car {

	// 최대속도와 현재속도 필드선언
	int maxSpeed; // 최대속도
	int Speed; // 현재속도

	// 최대속도를 지정하는 생성자 구현
	public Car() {
	}

	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Car(int maxSpeed, int speed) {

		this.maxSpeed = maxSpeed;
		Speed = speed;
	}

	public void speedUp() {
		this.Speed += 5;
		System.out.println("호출: 최대속도: " + maxSpeed + "현재속도: " + this.Speed);
	}

	public void speedUp(int TempSpeed) {
		if (TempSpeed > 0) {
			this.Speed += TempSpeed;

			if (this.Speed > this.maxSpeed) {
				System.out.println("호출: 최대속도보다 높아 최대속도로 지정, 최대속도: " + this.maxSpeed + "현재속도: " + this.maxSpeed);
			} else {
				System.out.println("호출: 최대속도: " + maxSpeed + "현재속도: " + this.Speed);
			}
		} else {
			System.out.println("호출: 속도가 음수 이므로 0으로 지정: 최대속도: " + maxSpeed + "현재속도: " + this.Speed);
		}
	}

	public void speedDown(int TempSpeed) {
		if (TempSpeed > 0) {
			this.Speed -= TempSpeed;
			if (this.Speed < 0) {
				this.Speed = 0;
				System.out.println("호출: 속도가 0보다 작아져 0으로 지정, 최대속도: " + this.maxSpeed + "현재속도: " + this.Speed);
			} else {
				System.out.println("호출: 최대속도: " + maxSpeed + "현재속도: " + this.Speed);
			}
		} else {
			System.out.println("호출: 속도가 음수 이므로 0으로 지정: 최대속도: " + maxSpeed + "현재속도: " + this.Speed);
		}
	}

	// 클랙스 Car 객체로 SpeedUp()와 SpeedDown()을 점검하는 소스
	public static void main(String[] args) {
		Car mycar = new Car(300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-50);
		mycar.speedUp(50);
		mycar.speedDown(-30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedDown(30);
		mycar.speedUp(100);
		mycar.speedUp(300);
	}
}
