package com.yedam.exam;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];

		System.out.print("숫자를 5개 입력해 주세요");
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		System.out.println("num.length : "+num.length);

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}

		System.out.println("--------");
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " :" + num[i]);
		}

		System.out.println("--------");
		System.out.println("MIN : " + num[0]);
		System.out.println("MAX : " + num[num.length - 1]);
	}
}
