package prac;

import java.util.Scanner;

public class Student extends Person{

	// 학교명,학과,학번, 8개학기 평균평점을 저장할 배열로 선언
	String univ;
	String subject;
	int id;
	double[] data;

	// 생성자 학교명,학과,학번 지정
	public Student(String name, int age, String address, String univ, String subject, int id) {
		super(name, age, address);
		this.univ = univ;
		this.subject = subject;
		this.id = id;
		this.data = new double[8];
	}

	// 메소드 averager(): 8개 학기 평균평점의 평균을 반환
	public double average() {
		double sum = 0;
		for ( int i = 0; i<data.length; i++) {
			sum += data[i];
		}
			return sum / data.length;
	}




	public static void main(String[] args) {
		Student me = new Student("김다정", 20, "서울시 관악구", "동양서울대학교", "전산정보학과", 2013222);
		System.out.println("이름 : " + me.name);
		System.out.println("나이 : " + me.age);
		System.out.println("주소 : " + me.address);
		System.out.println("학교 : " + me.univ);
		System.out.println("학과 : " + me.subject);
		System.out.println("학번 : " + me.id);
		
		System.out.println("--------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("8학기 학점을 순서대로 입력하세요");
		
		for(int i = 0; i < me.data.length; i++) {
			System.out.print((i+1) + "학기 학점 -> ");
		}

		System.out.println("--------------------------");
		
		System.out.println(me.data.length + "학기 총 평균 평점은 " + me.average() + "점 입니다.");
	}
}
