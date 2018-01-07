package prac;

public class Employee {
	
	// 1-1 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
	String name;
	int age;
	String adress;
	String department;
	int salary;
	
	
	
	//2-1번
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 1-2 생성자: 이름, 나이, 주소, 부서를 지정하는 생성자 정의
	public Employee() {}
	
	public Employee(String name, int age, String adress, String department) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.department = department;
	}
	
	// 메소드는 인자가 없고 자신의 필드 이름, 나이, 주소, 부서를 출력
	public void printInfo() {
		System.out.println("이름은: " + name);
		System.out.println("나이는: " + age);
		System.out.println("주소는 " + adress);
		System.out.println("부서는 " + department);
	}
	
	public static void main(String[] args) {
		
		
		/*Employee me = new Employee();
		me.name = "강동민";
		me.age = 28;
		me.adress = "인천";
		me.department = "SI사업부";
		me.printInfo();*/
	}
	
	
	
	
}
