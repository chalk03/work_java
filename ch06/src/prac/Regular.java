package prac;

public class Regular extends Employee {
	
	public Regular() {
		super();
	}
	
	// 2-1 생성자: 이름,나이,주소,부서를 지정하는 상위 생성자 호출
	public Regular(String name, int age, String adress, String department) {
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.department = department;
	}


	// 2-2 setter 월급 정보 필드를 지정
	public void setSalary(int Salary) {
		setSalary(2000000);
	}
	
	// 2-3 메소드는 인자가 없고, "정규직" 이라는 정보와 월급을 출력
	public void printInfo() {
		System.out.println("이름은: " + name);
		System.out.println("나이는: " + age);
		System.out.println("주소는 " + adress);
		System.out.println("부서는 " + department);
		System.out.println(this.name + "이고, " + getSalary() + "원 받습니다.");
	}
	
	
	public static void main(String[] args) {
		Regular re = new Regular();
		re.name = "정규직";
		re.printInfo();
	}
}
