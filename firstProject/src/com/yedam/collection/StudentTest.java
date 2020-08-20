package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		/*
		 * 1. 학생이름, 수학점수, 영어점수 입력받기 2. 수학평균, 영어평균 계산 3. 수학 최고 점수와 학생 조회 9. 종료 ->
		 * ArrayList 사용
		 */
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		List<Student> list = new ArrayList<Student>();

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.입력 | 2.평균조회 | 3.최고조회 | 9.종료");
			System.out.println("--------------------------------");
			System.out.print("입력 > ");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("수학점수 : ");
				int mScore = scan.nextInt();
				System.out.print("영어점수 : ");
				int eScore = scan.nextInt();

				list.add(new Student(name, mScore, eScore));
			} else if (selectNo == 2) {
				int mSum = 0;
				int eSum = 0;
				for (Student stu : list) {
//					System.out.println(stu.getName() + ", " + stu.getMathScore() + ", " + stu.getEngScore());
					mSum += stu.getMathScore();
					eSum += stu.getEngScore();
				}
				System.out.println("수학 평균 : " + mSum / list.size());
				System.out.println("영어 평균 : " + eSum / list.size());
			} else if (selectNo == 3) {
				Student best = new Student();
				int max = 0;
				for (Student stu : list) {
					if (max < stu.getMathScore()) {
//						max = stu.getMathScore();
						best = stu;
					}
				}
				System.out.println("- 수학 우수자 -");
				System.out.println(best.getName() + " " + best.getMathScore() + "점 취득");
			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
