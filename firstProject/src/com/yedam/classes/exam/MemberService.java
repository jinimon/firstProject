package com.yedam.classes.exam;

public class MemberService {
	// Member라는 배열 클래스 ms 추가
	public boolean login(String id, String pwd) {

		// db 역할
		Member[] members = new Member[3];
		// members[0] : 인스턴스가 담겨져있는 변수로 인식하면 된다.
		members[0] = new Member("홍길동", "hong");
		members[0].setPwd("hong123");
		members[1] = new Member("윤땡땡", "yoon");
		members[1].setPwd("yoon123");
		members[2] = new Member("이화진", "lee");
		members[2].setPwd("lee123");

		boolean result = false; // result의 default 값
		// ms의 길이가 0이면 boolean 값을 return 할 수 없기 때문에 boolean result 추가
		for (int i = 0; i < members.length; i++) {
			// ms 배열 안에 해당 id, pwd가 있는지 알아보자
			if (id.equals(members[i].getId()) && pwd.equals(members[i].getPwd())) {
				result = true;
				break; // 같은 계정을 찾으면 빠져나와야한다.
			} else
				result = false;
		}
		return result;
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
