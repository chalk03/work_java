package prac;

public class Regular extends Employee {
	
	public Regular() {
		super();
	}
	
	// 2-1 생성자: 이름,나이,주소,부서를 지정하는 상위 생성자 호출

	public Regular(String name, int age, String adress, String department) {
		super(name, age, adress, department);

	}
	
	// 2-2 setter 월급 정보 필드를 지정
	public void setSalary(int Salary) {
		super.setSalary(Salary);
	}
	

	// 2-3 메소드는 인자가 없고, "정규직" 이라는 정보와 월급을 출력
	@Override
	public void printInfo() {
		System.out.println("정규직: " + super.getSalary());
	}
}
