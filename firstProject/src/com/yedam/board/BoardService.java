package com.yedam.board;

import java.util.List;
import java.util.Map;

public interface BoardService {
	// 로그인
	public Map<String, String> loginCheck(Map<String, String> m);

	// 조회
	public List<Board> getBoardList();

	// 입력
	public void insBoard(Board board);

	// 수정
	public void updBoard(Board board);

	// 삭제
	public void delBoard(int boardNo);

	// 한건조회
	public Board getBoard(int boardNo);

	// 글권한체크
	public boolean responsCheck(int bNo, String user);
}
