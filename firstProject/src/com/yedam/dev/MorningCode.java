package com.yedam.dev;

public class MorningCode {
	public static void main(String[] args) {
		// String : 문자열
		String str1 = "Hello";
		String str2 = "World";
		String name = "이화진";

		// +로 문자열 연결
		System.out.println(str1 + ", " + name);

		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println("add result : " + result);
		
		result = minus(v1, v2);
		System.out.println("minus result : " + result);
		
		introduce("이화진");
	}

	public static void introduce(String name) {
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	}

	public static int add(int x, int y) { // method
		int sum = x + y;
		return sum;
	}

	public static int minus(int x, int y) { // method
		int minus = x - y;
		return minus;
	}
}