package com.yedam.ref;

public class MorningCode {
	public static void main(String[] args) {
		double[] dAry = new double[5];
		dAry[0] = 1.2;
		for (int j = 0; j < 5; j++) { // j 범위가 배열 크기를 초과할 경우 ERROR(예외발생)
//			System.out.println("dAry[" + j + "] : " + dAry[j]);
		}

		int[][] iAry = new int[5][5];
		int num1 = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				iAry[i][j] = num1++;
				System.out.printf("%2d", iAry[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("-------------------");

		// int result = iAry[0]는 배열이기 때문에 정수 result에 넣을 수 없다. 구분 잘하기
		int result = iAry[0][0];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d", iAry[j][i]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
