package com.yedam.classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarSelfExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 : ");
		int year = scan.nextInt();
		System.out.println("월 : ");
		int month = scan.nextInt();
		createCal(year, month);
	}

	public static void createCal(int year, int month) {
		Calendar cal = Calendar.getInstance();

		cal.set(year, month - 1, 1);
		int startDate = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일
		int endDate = cal.getActualMaximum(Calendar.DATE);

		System.out.println("startDate : " + startDate);
		System.out.println("endDate : " + endDate);

		System.out.println("\t" + year + "년 " + month + "월");
		System.out.println("----------------------");
		System.out.println(" 일    월    화    수    목    금    토");
		
		for (int i = 1; i < startDate; i++) {
			System.out.printf("%3s", "");
		}
		int count = startDate - 1;
		for (int i = 1; i <= endDate; i++) {
			System.out.printf("%2d ", i);
			count++;
			if (count % 7 == 0) {
				System.out.println();
			}
		}

	}
}