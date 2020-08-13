package com.yedam.ref;

public class ArrayExample2 {
	public static void main(String[] args) {
		int num = 3;
		add(num);

		int[] numAry = { 2, 4, 5, 3, 5 };
//		int result = addAry(numAry);
		// 배열 변수 말고 바로 값으로 넣어줘도 된다.
		int result = addAry(new int[] { 2, 3, 4 });

		System.out.println("배열의 합 : " + result);
	}

	public static int add(int a) {
		return a * 3;
	}

	// addAry 메소드 : ary 매개변수에 배열을 매개값으로 받아서 int를 반환
	public static int addAry(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}

		return sum;
	}
}