package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		// Calendar 클래스의 static getInstance() 메소드 호출
		Calendar cal = Calendar.getInstance(); // 2020-08-19
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)); // MONTH : 0~11
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println();

		cal.set(2022, 2, 0); // 2월의 마지막날(0)
		System.out.println("년 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + cal.get(Calendar.MONTH));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println();

		createCalendar(2020, 8); // 8월 달력
	}

	// main 메소드가 static(정적)이니까 위에서 사용하려면 아래 클래스도 static으로 생성
	public static void createCalendar(int year, int month) {

		int startDayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		int endDay = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("startDayOfWeek : " + startDayOfWeek); // 4. 수요일부터 시작
		System.out.println("endDay : " + endDay); // 31
		System.out.println();
		System.out.println("\t" + month + "월");
		System.out.println(" 일    월    화    수    목    금    토");

		for (int i = 1; i < startDayOfWeek; i++) { // 시작일 자릿수 맞추기 위함
			System.out.print("   ");
		}
		int count = startDayOfWeek - 1;
		for (int i = 1; i <= endDay; i++) {
			System.out.printf("%2d ", i);
			count++; // 토요일에는 6. count++하면 7 되면서 아래 조건문 적용
			if (count == 7) {
				count = 0;
				System.out.println();
			}
		}
	}
}
