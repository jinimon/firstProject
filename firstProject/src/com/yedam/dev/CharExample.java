package com.yedam.dev;

// com.yedam.dev.CharExample
public class CharExample {
	public static void main(String[] args) {
//		char c1 = 44032;	// 65에 해당되는 unicode : A. 97 : a
//		for (int i=0; i<26; i++) {
//			System.out.print(c1++ + "\t");
//		}

		char c2 = 'A';
		System.out.println(c2);
		// 입력한 문자를 정수형(int) 타입으로 강제 형변환
		System.out.println((int) c2);
		System.out.println((double) c2);

		char c3 = '가';
		// byte가 범위내에 출력을 못해서 0 출력함..
		System.out.println((byte) c3);
		System.out.println((int) c3);
	}
}