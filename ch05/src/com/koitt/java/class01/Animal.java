package com.koitt.java.class01;

/*Object 클래스
- 자바에서 모든 클래스가 기본으로 상속받는 클래스
- 이미 기본으로 구현되어 있는 클래스
- extends로 선언하지 않아도 기본으로 상속받는 클래스
*/

/*접근 제한자
- private: 같은 클래스 내부에서만 사용가능
- (default): 같은 패키지(폴더) 내부에서만 사용가능
- protected: dafault 범위 + 상속받은 클래스까지 사용가능
- public: 어느 곳이든 사용 가능
*/


public class Animal extends Object{

	// 필드 (Field)
	private String name;
	private int age;
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
