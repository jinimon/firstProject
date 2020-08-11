package com.yedam.dev;

import java.math.BigDecimal;

public class LongFloatExample {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		// 2147483648를 넣으면 int MAX 범위를 넘어가서 ERROR 뜬다(Default는 int이기때문)
		// 정수형 범위를 벗어나는 수(2147483647이상)는 L을 붙여서 long타입으로 인식하도록 한다.
		long l1 = 2147483648L;
		
		float f1 = 0.1234567890123456789F;
		double d1 = 0.1234567890123456789;
		double d2 = 0.1234567890123456789;
		double d3 = d1 + d2;
		// 0.24691357802469135로 출력 -> 정밀도가 떨어져서 근사치 값으로 출력
		// 기본 타입의 double형을 이용한 출력. 정확한 값을 가져오지는 못한다.
		System.out.println("d3 : "+d3);
		
		BigDecimal bd1 = new BigDecimal("0.1234567890123456789");
		BigDecimal bd2 = new BigDecimal("0.1234567890123456789");
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println("bd3 : "+bd3);	// 0.2469135780246913578
	}
}