package prac;

public class Temporary extends Employee {

	private int WorkHours;
	private int pay = 10000;
	
	public Temporary() {}
	
	// 3-1 생성자: 이름,나이,주소,부서를 지정하는 상위 생성자 호출
		public Temporary(String name, int age, String adress, String department) {
			super(name, age, adress, department);
		}

		public void setWorkHours(int WorkHours) {
			this.WorkHours = WorkHours;
		}
		
	
		public void printInfo() {
			System.out.println("이름은: " + super.name + "이며, " + "나이는 " + age + "살 입니다. ");
			System.out.println("주소는 " + super.adress + "입니다.");
			System.out.println("부서는 " + super.department + "입니다.");
			System.out.println("저는 " + this.name + "입니다.");
			System.out.println("월급은 " + pay + "원 입니다.");
		}
		
		/*public static void main(String[] args) {
			Temporary your = new Temporary();
			your.name = "비정규직";
			your.setWorkHours(209);
			your.setPay(10000);
			your.printInfo();
		}*/
		
		public static void main(String[] args) {
			Regular r = new Regular("이순신", 35, "서울", "인사부");
			Temporary t = new Temporary("장보고", 25, "인천", "경리부");
			r.setSalary(5000000);
			r.printInfo();
			//t.setWorkHours(120);
			t.printInfo();
		}

		
		
		
	
		
		
		
}
