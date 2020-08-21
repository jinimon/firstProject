package com.yedam.board;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BoardMain {

	private static BoardMain singleton = new BoardMain();

	private BoardMain() {
	}

	public static BoardMain getInstance() {
		return singleton;
	}

	Scanner scn = new Scanner(System.in);
	BoardService service = new BoardServiceImpl();
	Map<String, String> map = new HashMap<>();

	public void boardMain() {

		loginCheck();

		while (true) {
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("1.작성 2.수정 3.삭제 4.전체글 5.상세 9.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				insertBoard();

			} else if (selectNo == 2) {
				modifyBoard();

			} else if (selectNo == 3) {
				deleteBoard();

			} else if (selectNo == 4) {
				viewList();

			} else if (selectNo == 5) {
				viewDetail();

			} else if (selectNo == 9) {
				break;
			}
		}

	} // end of main

	public void loginCheck() {
		while (true) {
			map = checkLogin();
			if (map.get("user_name") == null)
				continue;
			else {
				System.out.println(map.get("user_name") + "님 환영합니다.!!");
				break;
			}

		}
	}

	public Map<String, String> checkLogin() {
		System.out.print("사원아이디 입력> ");
		String userId = scn.nextLine();
		System.out.print("사원비번 입력> ");
		String userPw = scn.nextLine();
		Map<String, String> m = new HashMap<>();
		m.put("user_id", userId);
		m.put("user_pw", userPw);
		return service.loginCheck(m);
	}

	public void viewList() {
		List<Board> list = service.getBoardList();
		System.out.println("게시글번호   제목\t\t\t작성자");
		System.out.println("==========================================");
		for (Board board : list) {
			System.out.printf("%7s  %-20s   %-10s\n", board.getBoardNo(), board.getTitle(), board.getWriter());
		}

	}

	public void viewDetail() {
		System.out.print("글번호 선택> ");
		int boardNo = scn.nextInt();
		Board board = service.getBoard(boardNo);
		String text = "글번호:{0}\t\t\t 제목:{1}\n내용: {2}\n작성자:{3}\t작성일자:{4}";
		String result = MessageFormat.format(text, board.getBoardNo(), board.getTitle(), board.getContent(),
				board.getWriter(), board.getCreateDate());
		System.out.println("**********************************************");
		System.out.println(result);
		System.out.println("**********************************************");

		if (responseCheck(boardNo, map.get("user_id"))) {
			System.out.print("1)수정 2)삭제 9)이전 ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.print("수정할 내용 입력> ");
				String content = scn.nextLine();

				Board board1 = new Board();
				board1.setBoardNo(boardNo);
				board1.setContent(content);

				service.updBoard(board1);

			} else if (menu == 2) {
				service.delBoard(boardNo);

			}
		}
	}

	public void insertBoard() {
		System.out.println("제목입력> ");
		String title = scn.nextLine();
		System.out.println("내용입력> ");
		String content = scn.nextLine();

		Board board = new Board(title, content, map.get("user_id"));
		service.insBoard(board);
	}

	public void modifyBoard() {
		System.out.print("수정할 글번호 선택> ");
		int boardNo = scn.nextInt();
		scn.nextLine();
		if (responseCheck(boardNo, map.get("user_id"))) {
			System.out.print("수정할 내용 입력> ");
			String content = scn.nextLine();
			Board board = new Board();
			board.setBoardNo(boardNo);
			board.setContent(content);
			service.updBoard(board);
		} else {
			System.out.println("수정권한 없습니다.");
		}
	}

	public void deleteBoard() {
		System.out.print("삭제할 글번호 선택> ");
		int boardNo = scn.nextInt();
		scn.nextLine();
		if (responseCheck(boardNo, map.get("user_id"))) {
			service.delBoard(boardNo);
		} else {
			System.out.println("수정권한 없습니다.");
		}
	}

	public boolean responseCheck(int boardNo, String userId) {
		return service.responsCheck(boardNo, userId);
	}
} // end of class
