package prac;

public class Regular extends Employee {
	
	public Regular() {
		super();
	}

	// 2-1 생성자: 이름,나이,주소,부서를 지정하는 상위 생성자 호출
	public Regular(String name, int age, String adress, String department) {
		super(name, age, adress, department);
	}
	
	public void printInfo() {
		System.out.println("저는 " + name + "입니다.");
		System.out.println("월급은 " +   "원 입니다.");
	}
	
	public static void main(String[] args) {
		Regular regular = new Regular();
		regular.name = "정규직";
		regular.printInfo();
	}
}
