package com.yedam.classes;

import java.util.Scanner;

public class FriendAddress {
	// static이 붙으면 FriendAddress 시작 시 이미 정의(?)되어있음
	static Scanner scn = new Scanner(System.in);
	// friends에는 ComFriend, UnivFriend도 담을 수 있다.
	static Friend[] friends = new Friend[100];

	public static void main(String[] args) {
		while (true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학교친구 | 2.회사친구 | 3.친구 | 4.리스트 | 9.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");
			int selectNo = scn.nextInt();
			scn.nextLine();
			// 뒷 구문에 영향 안끼칠려고 scn.nextLine(); 추가

			if (selectNo == 1) {
				addUnivFriend();
			} else if (selectNo == 2) {
				addComFriend();
			} else if (selectNo == 3) {
				addFriend();
			} else if (selectNo == 4) {
				friendList();
			} else if (selectNo == 9) {
				break;
			} else {
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	} // end of main()

	// 학교 친구 등록 메소드
	public static void addUnivFriend() {
		System.out.println("-- 학교 친구 등록 --");
		System.out.print("이름 입력 : ");
		String name = scn.nextLine();
		System.out.print("전화번호 입력 : ");
		String phone = scn.nextLine();
		System.out.print("전공 입력 : ");
		String major = scn.nextLine();

		UnivFriend friend = new UnivFriend();
		friend.setName(name);
		friend.setPnum(phone);
		friend.setMajor(major);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("입력 완료");
	}

	// 회사 친구 등록 메소드
	public static void addComFriend() {
		System.out.println("-- 회사 친구 등록 --");
		System.out.print("이름 입력 : ");
		String name = scn.nextLine();
		System.out.print("전화번호 입력 : ");
		String phone = scn.nextLine();
		System.out.print("회사명 입력 : ");
		String comName = scn.nextLine();

		ComFriend friend = new ComFriend();
		friend.setName(name);
		friend.setPnum(phone);
		friend.setComName(comName);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("입력 완료");
	}

	// 친구 등록 메소드
	public static void addFriend() {
		System.out.println("-- 친구 등록 --");
		System.out.print("이름 입력 : ");
		String name = scn.nextLine();
		System.out.print("전화번호 입력 : ");
		String phone = scn.nextLine();

		Friend friend = new Friend();
		friend.setName(name);
		friend.setPnum(phone);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("입력 완료");
	}

	// 친구 목록
	public static void friendList() {
		for (Friend friend : friends) {
			if(friend != null) {
				System.out.println(friend.toString());
			}
		}
	}
}
