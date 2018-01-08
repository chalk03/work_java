package prac;

public class Temporary extends Employee {

	private int WorkHours;
	private int pay = 10000;
	
	public Temporary() {}
	
	// 3-1 생성자: 이름,나이,주소,부서를 지정하는 상위 생성자 호출
		public Temporary(String name, int age, String adress, String department) {
			super(name, age, adress, department);
		}

		@Override
		public void setWorkHours(int WorkHours) {
			this.WorkHours = WorkHours;
			super.setSalary(this.WorkHours * this.pay);
		}
	
		@Override
		public void printInfo() {
			System.out.println("비정규직: " + this.WorkHours + " / " + super.getSalary());
		}
		
		public static void main(String[] args) {
			/*Regular r = new Regular("이순신", 35, "서울", "인사부");
			Temporary t = new Temporary("장보고", 25, "인천", "경리부");*/
			Employee r = new Regular("이순신", 35, "서울", "인사부");
			Employee t = new Temporary("장보고", 25, "인천", "경리부");
			
			r.setSalary(5000000);
			r.printInfo();
			t.setWorkHours(120);
			t.printInfo();
		}
}
