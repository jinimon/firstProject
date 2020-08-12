package com.yedam.oper;

public class OverflowExample {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		// Integer 범위 : 2147483647, -2147483648
//		int result = safeAdd(2147483647, 10);
		int result = safeAdd(-2147483648, -10);
		System.out.println("result : " + result);
	}

	public static int safeAdd(int a, int b) {
		int sum = 0;
		// 범위 벗어나는거 막아주기 위해 조건문을 줄것이다.
		// MAX_VALUE보다 합이 크다고 조건(Integer.MAX_VALUE < a+b)을 하면 결과가 -가 나와서 정확한 답x.
		// 그러니 대신(Integer.MAX_VALUE -b < a)로 조건을 줘서 예외처리 해 줄것이다...
		if (Integer.MAX_VALUE - b < a) { // MAX_VALUE 범위 벗어나는 조건
			System.out.println("MAX_VALUE OVERFLOW");
			sum = 0;
		} else if (Integer.MIN_VALUE - b > a) { // MIN_VALUE 범위 벗어나는 조건
			System.out.println("MIN_VALUE OVERFLOW");
			sum = 0;
		} else {
			sum = a + b;
		}
		return sum;
	}
}