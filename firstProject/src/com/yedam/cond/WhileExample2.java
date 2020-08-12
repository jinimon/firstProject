package com.yedam.cond;

import java.io.IOException;

public class WhileExample2 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
//		int num = 10;
		int keyCode = 0;

		// 126P. System 클래스의 read() 메소드
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.print("입력해주세요 : ");
			}
			
			keyCode = System.in.read(); // 키보드 입력 받는 것
			
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("keyCode : " + keyCode);
			}

			if (keyCode == 57) {
				run = false;
			}
		}
		System.out.println("시스템 종료");

//		while (run) {
//			System.out.println("num : " + num);
//			if (num-- == 0) {
//				run = false; // break;
//			}
//		}
	} // end of main
} // end of class
