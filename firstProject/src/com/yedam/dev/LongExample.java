package com.yedam.dev;

public class LongExample {
	public static void main(String[] args) {
		long l1 = 10;

		System.out.println("long 최소값 : " + Long.MIN_VALUE);
		System.out.println("long 최대값 : " + Long.MAX_VALUE);

		long l2 = 20;

		// int:4byte. long:8byte
		// int는 자기보다 큰 long을 저장할 수 없다.
		int result = (int) (l1 * l2);
		System.out.println("result : " + result);
	}
}