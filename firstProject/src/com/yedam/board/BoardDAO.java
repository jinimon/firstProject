package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDAO {
	Connection conn = DBConnection.getConnection();
	PreparedStatement pstmt;
	ResultSet rs;

	public boolean resCheck(int no, String user) {
		String sql = "select * from board where board_no = ? and writer = ?";
		boolean result = false;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setString(2, user);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// 로그인 처리.
	public Map<String, String> loginCheck(Map<String, String> m) {
		String sql = "select * from b_user where user_id = ? and user_pw = ?";
		Map<String, String> map = new HashMap<>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.get("user_id"));
			pstmt.setString(2, m.get("user_pw"));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				map.put("user_id", rs.getString("user_id"));
				map.put("user_name", rs.getString("user_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}

	// 조회
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		String sql = "select * from board";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreateDate(rs.getString("create_date"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 입력
	public void insertBoard(Board board) {
		String sql = "insert into board (board_no, title, content, writer, create_date) "
				+ "values((select nvl(Max(board_no),0)+1 from board),?,?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 수정
	public void updateBoard(Board board) {
		String sql = "update board set content = ? where board_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getContent());
			pstmt.setInt(2, board.getBoardNo());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 변경됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 삭제
	public void deleteBoard(int boardNo) {
		String sql = "delete from board where board_no = " + boardNo;
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 상세보기
	public Board getBoard(int boardNo) {
		String sql = "select * from board where board_no = " + boardNo;
		Board board = new Board();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreateDate(rs.getString("create_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
	}

}
