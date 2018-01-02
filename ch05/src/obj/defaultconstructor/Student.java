package obj.defaultconstructor;

public class Student {
	public String name;
	
	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("학생이름: " + this.name);
	}
	
	public static void main(String[] args) {
		Student lee = new Student("이승훈");
		lee.print();
		
		Student kim = new Student();
		kim.name = "김다빈";
		kim.print();
	}
}
	
