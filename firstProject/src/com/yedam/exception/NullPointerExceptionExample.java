package com.yedam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void showGender(String str) {
		String[] sp = { "*", "-", "/" };
		String newStr = str;
		for (int i = 0; i < sp.length; i++) {
			newStr = newStr.replace(sp[i], "");
		}
		System.out.println(newStr.charAt(6));
	}

	public static void main(String[] args) {
		// str에 인스턴스 할당 x. null로 초기화
		String str = null;

		// str에 참조하는 인스턴스가 없지만 .toString()해보자 -> ERROR
//		System.out.println(str.toString());

		// 해결 : 예외처리를 해 줘야함. 컴파일 에러는 x
		try { // 예외 발생할 수 있는 경우
			System.out.println(str.toString());
		} catch (NullPointerException e) { // 예외 발생 시 실행
			System.out.println("Null 값을 참조하고 있습니다.");
		} catch (Exception e1) { // 예외 중 최상위 예외 : Exception
			System.out.println("알 수 없는 예외가 발생했습니다.");
		}

		int[] intAry = new int[5];
		// 배열 크기보다 많이 돌면 ERROR
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("intAry[i]의 값 : " + intAry[i]);
			} catch (ArrayIndexOutOfBoundsException e) { // AIOOBE
				System.out.println("배열의 범위를 초과했습니다.");
			}
		}

		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 입력하세요 : ");
		try {
			int menu = scn.nextInt();
			System.out.println("입력된 값 : " + menu);
		} catch (InputMismatchException e) { // IME
			System.out.print("잘못 입력하셨습니다. 숫자 입력하세요 : ");
			scn.nextLine();
			scn.nextInt();
		}

		System.out.println("정상 종료");
	}
}
