package com.yedam.classes.exam;

public class MemberServiceExample {
	public static void main(String[] args) {
		
		// 로그인 정보
		Member user1 = new Member("윤땡땡", "yoon");
		user1.setPwd("yoon123");

		MemberService memberService = new MemberService();
		boolean result = memberService.login(user1.getId(), user1.getPwd());

		if (result) {
			System.out.println(user1.getName() + "님 로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는  password가 올바르지 않습니다.");
		}
	}
}
