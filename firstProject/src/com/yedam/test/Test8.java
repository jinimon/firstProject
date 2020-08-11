package com.yedam.test;

public class Test8 {
	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;

		// 이거는 왜 오류나지.. 형변환 해주기
		byte result1 = (byte) (byteValue + byteValue);
		int result2 = 5 + byteValue;
		float result3 = 5 + floatValue;
		double result = 5 + doubleValue;
	}
}
