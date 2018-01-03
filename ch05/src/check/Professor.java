package check;

public class Professor {

	String dept;
	int uNumber;
	
	public Professor(int uNumerb) {
		this.uNumber = uNumber;
	}

	public Professor(String dept) {
		this.dept = dept;
	}

	public Professor(String dept, int uNumber) {
		this.dept = dept;
		this.uNumber = uNumber;
	}
}
