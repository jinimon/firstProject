package com.yedam.exam;

import java.util.Scanner;

public class Test0821 {

	public static void main(String[] args) {
		String loginId = "";
		String loginPwd = "";
		int result = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);

		PostDAO dao = new PostDAO();
		Post[] posts = dao.getPostList();

		while (run) {
			System.out.print("아이디 입력 : ");
			loginId = scan.next();
			System.out.print("패스워드 입력 : ");
			loginPwd = scan.next();
			System.out.println();
			result = dao.memLogin(loginId, loginPwd);

			if (result == 0) {
				System.out.println(loginId + "님 로그인되셨습니다.");
				System.out.println();
				break;
			} else {
				System.out.println("로그인 실패");
				System.out.println();
				continue;
			}
		}

		while (run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.게시글작성 | 2.게시글수정 | 3.게시글삭제 | 4.리스트 | 5.상세보기 | 9.종료");
			System.out.println("---------------------------------------------------------");

			System.out.print("입력 > ");
			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				System.out.print("제목 : ");
				String title = scan.next();
				System.out.print("내용 : ");
				String contents = scan.next();

				Post post = new Post(loginId, title, contents);
				dao.insertPost(post);
			} else if (selectNo == 2) {
				System.out.print("수정할 게시글 번호 : ");
				int pnum = scan.nextInt();
				result = dao.userCheck(loginId, pnum);
				if (result == 0) { // 작성자이다.
					System.out.print("수정할 내용 : ");
					String contents = scan.next();
					dao.updatePost(pnum, contents);
					System.out.println("수정 완료");
				} else {
					System.out.println("작성자만 수정 할 수 있습니다.");
					continue;
				}
			} else if (selectNo == 3) {
				System.out.print("삭제할 게시글 번호 : ");
				int pnum = scan.nextInt();
				result = dao.userCheck(loginId, pnum);
				if (result == 0) {
					dao.deletePost(pnum);
					System.out.println("삭제 완료");
				} else {
					System.out.println("작성자만 삭제 할 수 있습니다.");
					continue;
				}
			} else if (selectNo == 4) {
				System.out.println("----------------------------------------");
				System.out.println("   게시물번호   |\t제목\t|\t작성자");
				System.out.println("----------------------------------------");
				for (Post post : posts) {
					if (post != null) {
						System.out.println(post.toString());
					}
				}
			} else if (selectNo == 5) {
				boolean detailRun = true;
				System.out.print("상세조회 할 게시글 번호 : ");
				int pnum = scan.nextInt();
				Post postDetail = dao.getPostDetail(pnum);
				while (detailRun) {
					System.out.println("--------------------------");
					System.out.println(postDetail.toStringDetail());
					System.out.println("--------------------------\n");
					
					System.out.println("\n1.수정 | 2.삭제 | 9.종료");
					System.out.print("입력 > ");
					int selNo = scan.nextInt();

					if (selNo == 1) {
						result = dao.userCheck(loginId, postDetail.getPnum());
						if (result == 0) { // 작성자이다.
							System.out.print("수정할 내용 : ");
							String contents = scan.next();
							dao.updatePost(pnum, contents);
							System.out.println("수정 완료");
						} else {
							System.out.println("작성자만 수정 할 수 있습니다.");
							continue;
						}
					} else if (selNo == 2) {
						System.out.println("정말 삭제하시겠습니까?(y/n)");
						System.out.print("> ");
						String selOpt = scan.next();
						if (selOpt.equals('y')) {
							result = dao.userCheck(loginId, postDetail.getPnum());
							if (result == 0) {
								dao.deletePost(pnum);
								System.out.println("삭제 완료");
							} else {
								System.out.println("작성자만 삭제 할 수 있습니다.");
								System.out.println();
								continue;
							}
						} else {
							System.out.println("삭제가 취소되었습니다.");
							continue;
						}
					} else if (selNo == 9) {
						detailRun = false;
					}
				}
				System.out.println("상세 화면 닫기");
			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
