package com.yedam.classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		Friend[] sAry = new Friend[3];
		Friend fre = new Friend();

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("친구 주소 관리 ver1.0");
			System.out.println("1.정보입력 | 2.리스트 | 3.이름조회 | 4.이름수정 | 9.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				for(int i = 0; i<sAry.length;i++) {
					System.out.print("이름 입력해주세요 : ");
					fre.name = scan.next();
					System.out.print("나이 입력해주세요 : ");
					fre.age = scan.nextInt();
					System.out.print("연락처를 입력해주세요 : ");
					fre.pnum = scan.next();
					
					sAry[i] = fre;
				}

//				for(int i=0;i<profile.length;i++) {
//					for (int j = 0; j < profile[i].length; j++) {
//						profile[i][j] = scan.next();
//					}
//				}
			} else if (selectNo == 2) {
//				for(int i=0;i<profile.length;i++) {
//					for (int j = 0; j < profile[i].length; j++) {
//						System.out.println(profile[i][j]);
//					}
//				}
				System.out.println("이름 : " + fre.getName());
				System.out.println("나이 : " + fre.getAge());
				System.out.println("연락처 : " + fre.getPnum());
			} else if (selectNo == 3) {
				System.out.print("검색할 이름을 입력해 주세요 : ");
				String keyword = scan.next();
				if (fre.getName().equals(keyword)) {
					System.out.println("이름 : " + fre.getName());
					System.out.println("나이 : " + fre.getAge());
					System.out.println("연락처 : " + fre.getPnum());
				}
			} else if (selectNo == 4) {
				System.out.print("검색할 이름을 입력해 주세요 : ");
				String keyword = scan.next();
				if (keyword != null || keyword != "") {
					System.out.print("수정할 이름을 입력해 주세요 : ");
					keyword = scan.next();
					fre.name = keyword;
				}
			} else if (selectNo == 9) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}
}
