package prac;

import java.util.Arrays;
import java.util.Scanner;

public class Student extends Person{

	// 학교명,학과,학번, 8개학기 평균평점을 저장할 배열로 선언
	String univ;
	String subject;
	int id;
	double[] data = new double[8];
	double sum;
	double avg;


	public Student() {}

	// 생성자 학교명,학과,학번 지정
	public Student(String name, int age, String address, String univ, String subject, int id) {
		super(name, age, address);
		this.univ = univ;
		this.subject = subject;
		this.id = id;
	}

	// 메소드 averager(): 8개 학기 평균평점의 평균을 반환
	public double averager() 
	{
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("학교 : " + univ);
		System.out.println("학과 : " + subject);
		System.out.println("학번 : " + id);
		System.out.println("-----------------------------");
	}

	public double output(double score) {
		Scanner input = new Scanner(System.in);
		double a,b,c,d,e,f,g,h;

		System.out.println("8학기 학점을 순서대로 입력하세요");

		System.out.print("1학기 학점 -> ");
		a = input.nextDouble();

		System.out.print("2학기 학점 -> ");
		b = input.nextDouble();

		System.out.print("3학기 학점 -> ");
		c = input.nextDouble();

		System.out.print("4학기 학점 -> ");
		d = input.nextDouble();

		System.out.print("5학기 학점 -> ");
		e = input.nextDouble();

		System.out.print("6학기 학점 -> ");
		f = input.nextDouble();

		System.out.print("7학기 학점 -> ");
		g = input.nextDouble();

		System.out.print("8학기 학점 -> ");
		h = input.nextDouble();

		System.out.println("-----------------------------");
		
		//System.out.printf("8학기 총 평균 평점은 %f점 입니다.", );
		return 0;
	}

	public static void main(String[] args) {


		Student me = new Student();
		me.name = "김다정";
		me.age = 20;
		me.address = "서울시 관악구";
		me.univ = "동양서울대학교";
		me.subject = "전산정보학과";
		me.id = 20132222;
		me.printInfo();
		me.output();
	}
}
