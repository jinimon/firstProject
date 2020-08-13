package com.yedam.ref;

import java.util.Scanner;

public class AdvancedForExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int[] scores = { 9, 3, 8, 7, 5 };
		int[] scores = new int[5];
		
		System.out.print("숫자 5개 입력해 주세요");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scan.nextInt();
		}
		
		int sum = 0;
		double avg = 0;
		int maxVal = 0;

		for (int num : scores) {
			sum += num;
			if(num > maxVal) {
				maxVal = num;
			}
		}
		System.out.println("점수 총합 : " + sum);
		
		avg = (double) sum / scores.length;
		System.out.println("점수 평균 : " + avg);
		
		System.out.println("최고 점수 : " + maxVal);
	}
}
