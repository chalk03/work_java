package com.koitt.java.board;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardController {

	private BoardService service;
	private Scanner input;

	public BoardController() {
		this.service = new BoardService();
		this.input = new Scanner(System.in);
	}

	public static void main(String[] args) {
		BoardController controller = new BoardController();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("=== 게시판 관리 프로그램 ===");
			System.out.println("1. 게시판 글 작성");
			System.out.println("2. 게시판 글 전체출력");
			System.out.println("3. 게시판 글 삭제");
			System.out.println("4. 게시판 글 수정");
			System.out.println("5. 게시판 나가기");
			System.out.print("메뉴번호 입력 > ");

			int menu = -1;
			try {
				menu = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("메뉴는 숫자로만 입력해");
				continue;
			}

			switch (menu) {
			case 1:
				controller.menuAdd();
				break;

			case 2:
				controller.menuRead();
				break;

			case 3:
				controller.menuRemove();
				break;

			case 4:
				controller.menuModify();
				break;

			case 5:
				System.out.println("게시판 나가기.");
				System.exit(0);
				break;

			default:
				System.out.println("번호를 똑바로 보렴");
			}
		}
	}

	public void menuAdd() {
		System.out.println("=== 게시글 정보를 입력해 주세요 ===");
		
		/*System.out.print("글 번호: ");
		Integer id = Integer.parseInt(this.input.nextLine()); // 글번호 입력
*/
		System.out.print("제목: ");
		String title = this.input.nextLine(); // 글 제목 입력

		System.out.print("내용: ");
		String content = this.input.nextLine(); // 글 내용 입력

		System.out.print("작성자: ");
		String writer = this.input.nextLine(); // 글 작성자 입력

		Date regData = new Date(); // 작성한 시간을 저장

		// 입력받은 정보를 객체화
		Board b = new Board(0, title, content, writer, regData);
		
		// Service로 입력받은 게시글 객체를 전달 (추가)
		/*this.service.add(b);
		System.out.println("게시글이 작성되었습니다.");*/
		
		try {
			this.service.add(b);
			System.out.println("게시글이 작성되었습니다.");
		} catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}

	// 작성한 게시글 확인 (전체목록)
	public void menuRead() {
		System.out.println("=== 게시글 전체 목록 ===");

		// Service를 통해 입력했던 게시글 모두를 불러오기.
		List<Board> list = this.service.read();

		// for-each문을 통해 list에 담긴 게시글 하나하나 출력하기.
		for (Board item : list) {
			System.out.println(item);
		}
	}

	// 게시글 삭제 메소드
	public void menuRemove() {
		System.out.println("=== 삭제할 게시글 번호를 입력해 주세요 ===");

		// 삭제할 게시글 번호 입력
		System.out.print("번호: ");
		int id = Integer.parseInt(this.input.nextLine());

		Board b = new Board(id, null, null, null, null);

		try {
			service.remove(b);
			System.out.println(b.getId() + "번 게시글이 삭제되었습니다.");
		} catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}

	// 게시글 수정 메소드
	public void menuModify() {
		System.out.println("=== 수정할 게시글 번호를 입력해 주세요 ===");

		// 수정할 게시글 번호 입력
		System.out.print("게시글 번호: ");
		int id = Integer.parseInt(this.input.nextLine());

		// 게시글 제목 변경
		System.out.print("제목: ");
		String title = this.input.nextLine();

		// 게시글 내용 변경
		System.out.print("내용: ");
		String content = this.input.nextLine();

		Board b = new Board(id, title, content, null, null);

		try {
			service.modify(b);
			System.out.println(b.getId() + "의 게시글이 수정되었습니다.");
		} catch (BoardException e) {
			System.out.println(e.getMessage());
		}
	}

}
