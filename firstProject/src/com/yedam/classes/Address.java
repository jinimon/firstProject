package com.yedam.classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {

		boolean run = true;
		Friend[] fAry = new Friend[100];
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("친구 주소 관리 ver1.0");
			System.out.println("1.정보입력 | 2.리스트 | 3.이름조회 | 4.이름수정 | 9.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scan.nextInt(); // scan.nextLine();

			if (selectNo == 1) { // 정보입력(이름, 나이, 전화번호)
				System.out.print("이름 입력해주세요 : ");
				// Friend에 필드를 private로 생성 해서 fre.name 불가능
//				String name = scan.nextLine();
				String name = scan.next();
				System.out.print("나이 입력해주세요 : ");
				int age = scan.nextInt(); // scan.nextLine();
				// .nextInt()하고 enter시 ph 입력으로 바로 넘어가져서 scan.nextLine()을 추가해줘야한다.
				System.out.print("연락처를 입력해주세요 : ");
//				String pnum = scan.nextLine();
				String pnum = scan.next();
				Friend fre = new Friend(name, age, pnum); // heap 영역에 new 해서 새로 만들거다. 이걸 fre에 저장
				for (int i = 0; i < fAry.length; i++) {
					if (fAry[i] == null) { // fAry.length : 100회 돌기 때문에 if문으로 제한. 빈칸이면 삽입하겠다.
						fAry[i] = fre;
						break; // 그리고 1개 정보 삽입 후 break로 빠져나오도록한다.
					}
				}
			} else if (selectNo == 2) { // 리스트
				for (Friend frnd : fAry) {
					if (frnd != null) { // 값이 있는 것만 출력
						System.out.println(
								"이름 : " + frnd.getName() + ", 나이 : " + frnd.getAge() + ", 연락처 : " + frnd.getPnum());
					}
				}
			} else if (selectNo == 3) { // 이름 조회
				System.out.print("검색할 이름을 입력해 주세요 : ");
				String keyword = scan.next();
				for (Friend frnd : fAry) {
					if (frnd != null && frnd.getName().equals(keyword)) { // 값이 있는 것만 출력
						System.out.println(
								"이름 : " + frnd.getName() + ", 나이 : " + frnd.getAge() + ", 연락처 : " + frnd.getPnum());
					}
				}
			} else if (selectNo == 4) { // 이름 조회 후 수정
				System.out.print("검색할 이름을 입력해 주세요 : ");
				String keyword = scan.next();
				for (Friend frnd : fAry) {
					if (frnd != null && frnd.getName().equals(keyword)) {
						System.out.print("수정할 이름을 입력해 주세요 : ");
						keyword = scan.next();
						frnd.setName(keyword);
					}
				}
			} else if (selectNo == 9) { // 종료
				run = false;

			}
		} // end of while()
		System.out.println("프로그램 종료");
		scan.close();
	} // end of main()
} // end of class