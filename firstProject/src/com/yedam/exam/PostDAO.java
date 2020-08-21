package com.yedam.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yedam.database.DBConnection;

public class PostDAO {
	static String sql = "";
	static Connection conn = DBConnection.getConnection();

	public static int memLogin(String id, String pwd) {
		int result = 1;
		sql = "select * from member where mem_id=\'" + id + "\' and mem_pwd=\'" + pwd + "\'";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next() == true) {
				result = 0;
			} else {
				result = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void insertPost(Post post) {
		sql = "insert into post values(pnum.NEXTVAL, \'" + post.getPostId() + "\', \'" + post.getTitle() + "\', \'"
				+ post.getContents() + "\', SYSDATE)";
		System.out.println(sql);

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int userCheck(String id, int pnum) {
		int result = 1;
		sql = "select * from post where user_id=\'" + id + "\'and pnum=" + pnum;
		System.out.println(sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next() == true) {
				result = 0;
			} else {
				result = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void deletePost(int pnum) {
		sql = "delete from post where pnum = " + pnum;
		System.out.println(sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void updatePost(int pnum, String contents) {
		sql = "update post set contents = \'" + contents + "\' where pnum = " + pnum;
		System.out.println(sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Post[] getPostList() {
		Post[] posts = new Post[100];

		try {
			sql = "select * from post";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;

			while (rs.next()) {
				Post post = new Post();
				post.setPnum(rs.getInt("pnum"));
				post.setTitle(rs.getString("title"));
				post.setPostId(rs.getString("user_id"));

				posts[idx++] = post;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return posts;
	}

	public static Post getPostDetail(int pnum) {
		Post post = new Post();
		sql = "select * from post where pnum = " + pnum;

//		System.out.println(sql);
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;

			while (rs.next()) {
				post.setPnum(rs.getInt("pnum"));
				post.setTitle(rs.getString("title"));
				post.setContents(rs.getString("contents"));
				post.setPostId(rs.getString("user_id"));
				post.setPostDate(rs.getString("regdt"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return post;
	}

	public Member[] getMemberList() {
		System.out.println("gemMemberList");
		Member[] members = new Member[100];

		try {
			sql = "select * from member";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("member rs : " + rs.next());
			int idx = 0;

			while (rs.next()) {
				Member member = new Member();
				member.setMemId(rs.getString("mem_id"));
				member.setMemPwd(rs.getString("mem_pwd"));

				members[idx++] = member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return members;
	}
}
