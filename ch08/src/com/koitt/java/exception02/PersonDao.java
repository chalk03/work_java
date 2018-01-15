package com.koitt.java.exception02;

import java.util.ArrayList;
import java.util.List;

/*
 * DAO (Date Access Object): 실제 데이터에 접근하는 객체를 위한 클래스
 * insert(Person p): 사람 객체를 저장
 * readAll(): 저장된 사람 전체 리스트를 가져오기 
 */

public class PersonDao {

	List<Person> list; // DB 대신에 사용자를 저장할 자료구조

	public PersonDao() {
		this.list = new ArrayList<Person>();
	}

	public void insert(Person p) throws MyException {
		// list에서 중복된 인적정보 찾기
		for (Person item : this.list) {
			// 사람 이름끼리 비교해서 같다면 중복된 사람으로 처리
			if (item.equals(p)) {
				throw new MyException("E01: Person 객체 중복");
			}
		}
		this.list.add(p);
	}

	// 전체 목록 가져오기
	public List<Person> selectAll() {
		return this.list;
	}

	// Argument로 전달받은 객체를 list에서 제거
	public void delete(Person p) throws MyException {
		// list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		for (Person item : this.list) {
			if (item.equals(p)) {
				list.remove(item);
				return;
			}
		}
		
		throw new MyException("E02: 삭제할 사람이 없습니다.");
	}
}
