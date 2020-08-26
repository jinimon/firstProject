package com.yedam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseMain {
	static Scanner scan = new Scanner(System.in);
	static Student stu = new Student("", 0, 0);
	static Course course = new Course("", 0);
	static List<Course> cList = new ArrayList<>();
	static List<Student> sList = new ArrayList<>();
	static int count = 0;

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.과정등록 | 2.학생등록 | 3.리스트 | 9.종료");
			System.out.println("---------------------------------");
			System.out.print("입력 > ");

			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				insertCourse();
			} else if (selectNo == 2) {
				insertStudent();
			} else if (selectNo == 3) {
				showCourseInfo(course);
			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void insertCourse() {
		System.out.print("과목명 : ");
		String cname = scan.next();
		System.out.print("최대 수강 인원 : ");
		int cmax = scan.nextInt();

		course = new Course(cname, cmax);
		cList.add(course);
		System.out.println(cname + " 과정이 등록되었습니다.");
	}

	public static void insertStudent() {
		if (cList.size() != 0) {
			System.out.print("과목명 : ");
			String cname = scan.next();
			int max = 0;
			if (course.getCname().equals(cname)) {
				max = course.getCmax();
			}
			if (count < max) {
				System.out.print("학생명 : ");
				String sname = scan.next();
				System.out.print("나이 : ");
				int sage = scan.nextInt();
				System.out.print("점수 : ");
				int score = scan.nextInt();

				stu = new Student(sname, sage, score);
				sList.add(stu);
				if (course.getCname().equals(cname)) {
					System.out.println("해당하는 과정 : " + cname);
					course.add(stu);
				}
				System.out.println(cname + " 과정 " + sname + " 학생이 등록되었습니다.");
				count++;
			} else {
				System.out.println("수강 인원이 초과되었습니다.");
			}
		} else {
			System.out.println("등록된 과정이 없습니다. 과정을 등록해주세요");
		}
	}

	public static void showCourseInfo(Course c) {
		int sum = 0;
		if (cList.size() != 0) {
			System.out.print("과목명 : ");
			String cname = scan.next();
			if (c.getCname().equals(cname)) {
				if (!c.getsList().isEmpty()) {
					System.out.println("==== " + c.getCname() + " ====");

					for (Student s : c.getsList()) {
						System.out.println(s.getSname() + ", " + s.getSage() + ", " + s.getScore());
						sum = sum + s.getScore();
					}
					System.out.println("총 점수 : " + sum);
					System.out.println("평균 : " + sum / c.getsList().size());
				} else {
					System.out.println(cname + "에 등록된 수강생이 없습니다.");
				}
			} else {
				System.out.println(cname + "에 등록된 수강생이 없습니다.");
			}
		} else {
			System.out.println("조회할 리스트가 없습니다.");
		}
	}
}
