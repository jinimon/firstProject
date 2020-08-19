package com.yedam.apiSelf;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];

		System.out.print("입력 > ");
		int readyByteNo = System.in.read(bytes); // 배열에 읽은 바이트 저장하고 읽은 바이트 수를 리턴

		String str = new String(bytes, 0, readyByteNo - 2); // 배열을 문자열로 변환
		System.out.println("str : " + str);
	}
}