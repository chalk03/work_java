package pratice;

import java.util.Date;

public class Person {

	String name;
	

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public boolean equals (Object person) {
		if (this.name.equals(((Person) person).name)) {
            return true;
            
        }
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person("강동");
		System.out.println(p1.equals(new Person("강동")));
		System.out.println(p1.equals(new Person("민민민")));
	}
}
