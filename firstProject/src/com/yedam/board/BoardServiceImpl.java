package com.yedam.board;

import java.util.List;
import java.util.Map;

public class BoardServiceImpl implements BoardService {
	BoardDAO dao = new BoardDAO();

	@Override
	public Map<String, String> loginCheck(Map<String, String> m) {
		return dao.loginCheck(m);
	}

	@Override
	public List<Board> getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public void insBoard(Board board) {
		dao.insertBoard(board);
	}

	@Override
	public void updBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public void delBoard(int boardNo) {
		dao.deleteBoard(boardNo);
	}

	@Override
	public Board getBoard(int boardNo) {
		return dao.getBoard(boardNo);
	}

	@Override
	public boolean responsCheck(int bNo, String user) {
		return dao.resCheck(bNo, user);
	}

}
