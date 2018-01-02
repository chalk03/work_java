package obj.constructor;

public class Student {

	public String name;
	
	// 생성자 (Constructor)
	public Student(String name) {
		super();	// super는 나의 부모
		this.name = name;
	}

	
	public void print() {
		System.out.println("학생이름: " + this.name);
	}
	

	public static void main(String[] args) {
		Student i = new Student("김민정");
		System.out.println(i.name);
		i.print();
	}
}
