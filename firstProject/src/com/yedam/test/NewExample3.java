package com.yedam.test;

public class NewExample3 {
	public static void main(String[] args) {
		nvl(null, "초기값"); // null 이면 뒤에 값 출력
		nvl("입력값", "초기값");
	}

	public static void nvl(String str1, String defaultValue) {
		System.out.println((str1 == null ? defaultValue : str1));
	}
}
