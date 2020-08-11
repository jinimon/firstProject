package com.yedam.dev;

public class BooleanExample {
	public static void main(String[] args) {
		long l1 = 10L;
		int i1 = 10;
		
		boolean trueOrFalse = false;
		
//		trueOrFalse = (l1 == i1);	// TRUE
		trueOrFalse = (l1 != i1);	// FALSE
		if(trueOrFalse) {
			System.out.println("이 내용은 참일 경우에 출력");
		} else {
			System.out.println("이 내용은 거짓일 경우에 출력");
		}
		
		// >, <, >=, <=
		if(l1 > i1) {
			System.out.println("왼쪽이 크다");
		} else if(l1 < i1) {
			System.out.println("오른쪽이 크다");
		} else {
			System.out.println("값이 같다");
		}
		
		System.out.println(trueOrFalse);
	}
}
