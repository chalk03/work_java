package check;

public class check05 {

	String name;
	int age;
	
	public check05(int age) {
		super();
		this.age = age;
	}
	public check05(String name) {
		super();
		this.name = name;
	}
	public check05(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

