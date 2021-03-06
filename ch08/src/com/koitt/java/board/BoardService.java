package com.koitt.java.board;

import java.util.List;

public class BoardService {

	private BoardDao dao;
	private int count;

	
	public BoardService() {
		this.dao = new BoardDao();
	}

	public void add(Board b) throws BoardException {
		Board board = new Board(++count, b.getTitle(), b.getContent(), b.getWriter(), b.getRegDate());
		dao.insert(board);
	}

	public List<Board> read() {
		return dao.selectAll();
	}

	public void remove(Board b) throws BoardException {
		dao.delete(b);
	}

	public void modify(Board b) throws BoardException {
		dao.update(b);
	}
}
