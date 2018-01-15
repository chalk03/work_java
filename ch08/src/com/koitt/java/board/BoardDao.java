package com.koitt.java.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	List<Board> list;	// DB 대신에 게시물을 저장할 자료구조
	
	public BoardDao() {
		this.list = new ArrayList<Board>();
	}
	
}
