package com.yedam.cond;

public class SwitchExample {
	public static void main(String[] args) {
		// Math 클래스에 저장된 메소드를 사용해보겠음
		// .random() : 0~1사이의 임의의 수 출력하는 메소드
		int m = (int) (Math.random() * 6) + 1; // *6을 해서 0 < m < 6
		System.out.println(m);

		switch (m) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		case 6:
			System.out.println("6번");
			break;
		}
	}
}
