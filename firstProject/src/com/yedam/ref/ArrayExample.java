package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {
		// int[] score와 같음
		int score[] = { 10, 20, 30, 40, 50 };
		int sum = 0;

		score[0] = 100; // 인덱스 0에 100 대입가능

		// 범위를 .length로 지정해주면 배열의 value 값이 늘어나도 변경해줄 필요가 없다.
		for (int i = 0; i < score.length; i++) {
//			System.out.println("> " + score[i]);
			sum += score[i];
		}
		System.out.println("sum : " + sum);
		System.out.println();

		double[] dAry = { 2.3, 4.3 };
		String[] sAry = { "hi", "hello", "nice", "hoho" };

		for (int i = 0; i < sAry.length; i++) {
			System.out.println("sAry[" + i + "] : " + sAry[i]);
		}
		System.out.println();

		// 이렇게 선언시 배열 크기만 미리 지정할 수 있음
		// int 변수라 초기값 0. double 변수는 0.0. String 변수는 null
		String[] scoreAry = new String[5];

		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println("scoreAry: " + scoreAry[i]);
		}
		System.out.println();

		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";

		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println("scoreAry: " + scoreAry[i]);
		}

		// 배열 선언하고 다음 줄에서 값을 부여 시, new int[]해서 부여해야한다.
		int[] mathAry;
		mathAry = new int[] { 1, 2, 3, 4 };
	}
}