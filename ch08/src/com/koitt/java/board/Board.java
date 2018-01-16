package com.koitt.java.board;

/* 
 * Board equals 조건 비교는 id 값으로 비교
 * Service
 * - 글 등록시, 증가하는 번호 관리하기. (삭제할때 글번호로 삭제)
 * - Integer counut (null) 값으로 
 */

import java.util.Date;

public class Board {

	private int id; // 게시물 번호
	private String title; // 제목
	private String content; // 내용
	private String writer; // 작성자
	private Date regDate; // 작성일

	public Board() {
	}

	public Board(int id, String title, String content, String writer, Date regDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + id;
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		// 1. 주소값 비교
		if (this == obj) {
			return true;
		}

		// 2. Board 클래스를 상속 받았는지 검사
		if (!(obj instanceof Board)) {
			return false;
		}

		// 3. Board의 id 필드값끼리 비교
		Board b = (Board) obj;
		if (this.id == b.id) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content=");
		builder.append(content);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append("]");
		return builder.toString();
	}
}
