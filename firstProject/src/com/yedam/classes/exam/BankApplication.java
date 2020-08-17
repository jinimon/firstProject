package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountAry = new Account[10];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String cnum = scanner.next();
		for (Account ac : accountAry) {
			if (ac != null && ac.getAno().equals(cnum)) {
				System.out.println("동일한 계좌번호가 이미 존재합니다.");
				break;
			} else {
				System.out.print("예금주 : ");
				String owner = scanner.next();
				System.out.print("초기입금액 : ");
				int money = scanner.nextInt();

				Account acount = new Account(cnum, owner, money);
				for (int i = 0; i < accountAry.length; i++) {
					if (accountAry[i] == null) {
						accountAry[i] = acount;
						break;
					}
				}
				System.out.println("계좌 발급이 정상적으로 완료되었습니다.");
				break;
			}
		}
	}

	// 계좌 목록
	private static void accountList() {
		for (Account ac : accountAry) {
			System.out.println("------");
			System.out.println("계좌목록");
			System.out.println("------");
			if (ac != null) {
				System.out.println(ac.getAno() + "\t" + ac.getOwner() + "\t" + ac.getBalance());
			} else {
				System.out.println("계좌가 존재하지 않습니다.");
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.print("계좌번호 : ");
		String cnum = scanner.next();
		for (Account ac : accountAry) {
			if (ac != null && ac.getAno().equals(cnum)) {
				System.out.print("입금액 : ");
				int money = scanner.nextInt();
				money = ac.getBalance() + money;
				ac.setBalance(money);
				System.out.println("예금이 정상적으로 완료되었습니다.");
			} else {
				System.out.println("계좌번호가 잘못되었습니다.");
				break;
			}
		}
	}

	// 출금하기
	private static void withdraw() {
		System.out.print("계좌번호 : ");
		String cnum = scanner.next();
		for (Account ac : accountAry) {
			if (ac != null && ac.getAno().equals(cnum)) {
				System.out.print("출금액 : ");
				int money = scanner.nextInt();
				if (ac.getBalance() >= money) {
					money = ac.getBalance() - money;
					ac.setBalance(money);
					System.out.println("출금이 정상적으로 완료되었습니다.");
				} else {
					System.out.println("잔액이 부족합니다. 잔액 " + ac.getBalance() + "원");
					break;
				}
			} else {
				System.out.println("계좌번호가 잘못되었습니다.");
				break;
			}
		}
	}

//	private static Account findAccount(String ano) {
//		Account searchAcnt = null;
//		for (int i = 0; i < accountAry.length; i++) {
//			if (accountAry[i] != null && accountAry[i].getAno().equals(searchAcnt)) {
//				searchAcnt = accountAry[i]; // Account[]
//			}
//		}
//		return searchAcnt;
//	}
}
