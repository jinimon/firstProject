package com.yedam.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseBall2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> comList = new ArrayList<>();
		List<Integer> userList = new ArrayList<>();
		int strike = 0, ball = 0, out = 0;
		int count = 0;
		boolean play = true;

		// 컴퓨터가 랜덤 숫자(중복x) 3개 생성
		while (comList.size() < 4) {
			int random = (int) (Math.random() * 9) + 1;
			if(!comList.contains(random)) {
				comList.add(random);
			}
		}

		while (play) {
			System.out.println("-----------------------------------");
			System.out.print("숫자 야구를 시작합니다. ");
			System.out.println("중복없이 숫자를 입력해 주세요");
			System.out.println("-----------------------------------");

			// Input이라는 Label을 지정해준다. BUT 이방식은 권장하지x
			for (int i = 0; i < comList.size(); i++) {
				System.out.print(i + "번째 >");
				int input = scan.nextInt();
				int check = userList.get(i);
				if(!userList.contains(input)){
	                userList.add(input);	                
	            } else {
					System.out.println("중복값을 입력하셨습니다.");
	            }
				if(comList.contains(userList.get(i))) {
					if (userList.indexOf(check) == comList.indexOf(check)) {
						strike++;
					} else {
						ball++;
					}
				}
			}

			count++;
			System.out.println("count : " + count);

			if (ball == 0 && strike == 0) {
				out++;
				System.out.println(out + " 아웃");
			} else if (ball == 0 && strike != 0) {
				if (strike == 3) {
					System.out.println(strike + " 스트라이크! 정답입니다!");
					play = false;
				} else {
					System.out.println(strike + " 스트라이크 입니다.");
				}
			} else if (ball != 0 && strike == 0) {
				System.out.println(ball + " 볼 입니다.");
			} else {
				System.out.println(strike + " strike | " + ball + " ball");
			}

			ball = 0;
			strike = 0;

			if (count == 9 || out == 3) {
				System.out.print("패배했습니다. 정답은 ");
				for (int i = 0; i < comList.size(); i++) {
					System.out.print(comList.get(i));
				}
				System.out.println("입니다.");
				play = false;
			}
		}
	}
}
