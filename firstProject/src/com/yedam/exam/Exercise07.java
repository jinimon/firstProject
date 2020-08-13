package com.yedam.exam;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			int menu = scanner.nextInt();
			int money;
			if (menu == 1) {
				System.out.print("예금액> ");
				money = scanner.nextInt();
				balance += money;
				System.out.println(money + "원 예금되었습니다.");
			} else if (menu == 2) {
				System.out.print("출금액> ");
				money = scanner.nextInt();
				balance -= money;
				System.out.println(money + "원 출금되었습니다.");
			} else if (menu == 3) {
				System.out.println("잔고> " + balance);
			} else if (menu == 4)
				run = false;
		} // end of while
		System.out.println("프로그램 종료");
	} // end of main
} // end of class
