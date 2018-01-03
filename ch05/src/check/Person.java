package check;

public class Person {

	String name;

	public Person(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Person p = new Person("예진");
		System.out.println(p.name);
		Person s = new Person("진태");
		System.out.println(s.name);
	}
}
