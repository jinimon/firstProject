package com.yedam.apiSelf;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		String str1 = new String(bytes);
		// byte 배열을 문자열로 변환
		System.out.println("str1 : " + str1); // Hello Java

		String str2 = new String(bytes, 6, 4); // bytes 배열에 6번째부터 4개
		System.out.println("str2 : " + str2);	// Java
	}
}
