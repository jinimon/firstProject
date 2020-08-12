package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		// ~ : 비트 반전 연산자
		int v2 = ~v1;
		
		System.out.println("v1 : "+v1);
		System.out.println("v2 : "+v2);
		
		byte b1 = 10;
		byte b2 = 5;
		// 산술 연산자는 int로 자동  형변환되서 연산되기때문에 int형 결과값이 나옴.
		// 그래서 결과값 변수를 byte로 하면 ERROR
		int b3 = b1 % b2;
		
		// 자동 형변환으로 int가 되기떄문에 double형태로 결과 출력하고 싶으면 피연산자 중 하나는 반드시 실수로 입력해줘야한다(n.0)
		double result = 10 / 4;	// 2.5
		System.out.println("result1 : "+result);
		result = 10 / 4.0;	// 2.5
		System.out.println("result2 : "+result);
	}
}
