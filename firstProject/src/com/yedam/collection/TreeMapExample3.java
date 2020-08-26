package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		// TreeMap -> 크다 작다가 있어야 정렬이 가능함
		// 수학점수 기준으로 정렬하고싶다.
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");

		// 1. 정렬하기 위해서는 Student 클래스에 implements Comparable<Student> 해줘야한다.
		// comparable은 제네릭 타입
		// 2. 수학 점수를 기준으로 하기위해서는 Student 클래스에 재정의된 compareTo에 기준을 작성한다.
		SortedMap sMap = tMap.headMap(new Student("Base", 80, 88));// 80점 이하인 결과 가져오기
		Set<Student> set = sMap.keySet(); // 키 값(Student)만 가져온다.
		System.out.println("--- 80점 이하 ---");
		for (Student s : set) {
			System.out.println("1 : " + s.getName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}
		System.out.println();

		sMap = tMap.tailMap(new Student("Base", 80, 79)); // 80점 이상
		set = sMap.keySet();
		System.out.println("--- 80점 이상 ---");
		for (Student s : set) {
			System.out.println("2 : " + s.getName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}
		System.out.println();

		sMap = tMap.subMap(new Student("Base", 70, 50), new Student("Base", 80, 90)); // 70에서 80 사이
		set = sMap.keySet();
		System.out.println("--- 70에서 80 ---");
		for (Student s : set) {
			System.out.println("3 : " + s.getName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}
	}
}
