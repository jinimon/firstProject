package com.yedam.dev;

public class IntExample {
	public static void main(String[] args) {
		int var1 = 10; // 10진수 10
		int var2 = 012; // 8진수 12 = 10
		int var3 = 0xA; // 16진수(0x) A = 10
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);

		byte b1 = 10;
		// cast : 형변환을 의미. ex) (byte) 같은거
		// =을 기준으로 양쪽의 데이터 형태를 맞춰줘야한다. Default int이다.
//		byte result = (byte) (b1 + 10);
		
		// 아래에 오류가 나지 않는 이유는 작은 범위(왼쪽)에서 큰 범위(오른쪽) 담을 수 있기 때문
		int reslut = (byte) (b1 + 10);
	}
}
