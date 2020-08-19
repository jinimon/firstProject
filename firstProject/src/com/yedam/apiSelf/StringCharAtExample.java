package com.yedam.apiSelf;

import java.util.Scanner;

public class StringCharAtExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민 번호를 입력해라 : ");
		String ssn = scan.next();
		
		if(ssn.replace("-", "").charAt(6) == '3') {
			System.out.println("나는 남자다!");
		}
		
		char sex = ssn.charAt(7);
//	String sex = ssn.substring(7,8);  // substring으로도 가능

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자다");
			break;
		case '2':
		case '4':
			System.out.println("여자다");
			break;
		default:
			System.out.println("잘못 입력했다.");
			break;
		}
	}
}