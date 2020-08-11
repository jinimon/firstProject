package com.yedam.test;

public class Test6 {
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var1 = (double)intValue;
		byte var2 = (byte)intValue;
		int var3 = (int)doubleValue;
		// 4번 ERROR. String 클래스를 char로 형변환 하는거 자체가 x
//		char var = (char)strValue;
	}
}
