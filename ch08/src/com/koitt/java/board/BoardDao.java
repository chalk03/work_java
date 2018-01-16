package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	List<Board> list; // 게시물을 저장할 자료구조

	public BoardDao() {
		this.list = new ArrayList<Board>();
	}

	public void insert(Board b) throws BoardException {
		for (Board item : this.list) {
			if (item == b) {
			}
		}
		this.list.add(b);
	}

	// 전체 목록 가져오기
	public List<Board> selectAll() {
		return this.list;
	}

	// Argument로 전달받은 객체를 list에서 제거
	public void delete(Board b) throws BoardException {
		// list에서 Argument로 전달받은 객체의 id와 동일한 객체가 있는지 확인
		
		for (Board item : this.list) {
			if (item.equals(b)) {
				list.remove(item);
				return;
			}
		}
		
		throw new BoardException("E01: 삭제할 게시글이 없습니다.");
	}

	// Argument로 전달받은 객체를 list에서 수정
	public void update(Board b) throws BoardException {
		// list에서 Argument로 전달받은 객체의 id와 동일한 객체가 있는지 확인
		for (Board item : this.list) {
			if (item.equals(b)) {
				item.setTitle(b.getTitle());
				item.setContent(b.getContent());
				return;
			}
		}
		
		throw new BoardException("E02: 수정할 게시글이 없습니다.");
	}
}
