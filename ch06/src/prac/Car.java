package prac;

public class Car {

	// 최대속도와 현재속도 필드선언
	int maxSpeed;	//최대속도
	int Speed;		//현재속도
	
	//최대속도를 지정하는 생성자 구현
	public Car() {}
	
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int speedUp() {
		System.out.println("호출: 최대속도: " + maxSpeed + "현재속도: " + Speed);
		return Speed += 5;
	}
	
	public void speedUp(int Speed) {
		if ( Speed < 0) {
			System.out.println("호출: 속도가 음수 이므로 0으로 지정: 최대속도: " + maxSpeed + "현재속도: " + Speed);
		}
		
	}
/*	
	public int speedDown() {
		
	}
	
	public int speedDown() {
		
	}
	*/
	public static void main(String[] args) {
		Car mycar = new Car(300);
		mycar.speedUp();
		mycar.speedUp();
		mycar.speedUp(-50);
		/*mycar.speedUp(50);
		mycar.speedUp(-30);
		mycar.speedUp(30);
		mycar.speedUp(30);
		mycar.speedUp(30);
		mycar.speedUp(100);
		mycar.speedUp(300);	*/
	}
	
}
