package prac;

public class Student {

	private String subject;
	private int id;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		Student myinfo = new Student();
		myinfo.setSubject("전자과");
		myinfo.setId(1016084);;
		
		System.out.println("학과: " + myinfo.getSubject());
		System.out.println("학번: " + myinfo.getId());
	}

}
