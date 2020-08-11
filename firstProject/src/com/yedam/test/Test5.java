package com.yedam.test;

public class Test5 {
	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue1 = byteValue;
		int intValue2 = charValue;
		// 3번 ERROR. 형태가 안맞아서. 형변환을 해서 형태를 맞춰준다
		short shortValue = (short) charValue;
		double doubleValue = byteValue;
	}
}