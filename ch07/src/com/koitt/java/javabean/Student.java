package com.koitt.java.javabean;

import java.io.Serializable;

public class Student implements Serializable{

	// 1. 필드선언
	private int studentId;		// 학번
	private String name;		// 이름

	// 2. 생성자 구현
	public Student() {}

	public Student(int studentId, String name) {

		this.studentId = studentId;
		this.name = name;
	}

	// 3. getter, setter 구현
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	// 4. equals 비교
	@Override
	public boolean equals(Object obj) {

		// 3-1. 나 자신과 Argument의 객체 주소값 비교
		if (this == obj) {
			return true;
		}

		// 3-2. obj가 현재 클래스를 상속받고 있는지 확인
		if(!(obj instanceof Student)) {
			return false;
		}

		// 3-3. studentId 필드가 같다면 같은 객체로 결과를 리턴
		Student s = (Student) obj;
		if (this.studentId == s.studentId){
			return true;
		}

		return false;
	}


	// toString 
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentId=");
		builder.append(studentId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.studentId;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1111, "홍길동");
		Student s2 = new Student(1111, "홍길자");
		Student s3 = new Student(2222, "홍길자");


		// 1. equals 사용법
		if(s1.equals(s2)) {		// 
			System.out.println("두 사람은 같은 사람입니다.");
		}
		else {
			System.out.println("두 사람은 다른 사람입니다.");
		}
		if(s2.equals(s3)) {		
			System.out.println("두 사람은 같은 사람입니다.");
		}
		else {
			System.out.println("두 사람은 다른 사람입니다.");
		}
		
		// 2. hashcode
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());


		// 3. toString 메소드 사용
		System.out.println(s1.toString());
		System.out.println(s2);		// println 메소드에서 자동으로 객체의 toString을 호출
		System.out.println(s3);		// println 메소드에서 자동으로 객체의 toString을 호출

	}
}
