package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
//		TreeSet은 크다 작다의 개념을 갖고있다.
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));

		Integer t = tSet.first(); // first() : 제일 작은값 출력
		t = tSet.last(); // 제일 큰 값
		t = tSet.floor(new Integer(87)); // 85(매개값.floor.바닥)를 기준으로 이보다 작은 값들. 기준값보다 작거나 같다(기준값 포함). <=
		t = tSet.lower(new Integer(87)); // 기준값보다 작다(기준값 미포함). <
		t = tSet.ceiling(new Integer(85)); // 기준값보다 크거나 같다(기준값 포함). >=
		t = tSet.higher(new Integer(85)); // 기준값보다 크다(기준값 미포함). >

		Iterator<Integer> dIter = tSet.descendingIterator(); // 역순 정렬
		while (dIter.hasNext()) {
			System.out.println(dIter.next());
		}

		System.out.println("------------------------------");

		NavigableSet<Integer> nSet = tSet.descendingSet(); // 순차 저장. 역순 정렬
		for (Integer icnt : nSet) {
			System.out.println(icnt);
		}

		System.out.println("------------------------------");

		int size = tSet.size(); // 범위에 tSet.size()를 하니까 pollFirst()로 하나씩 없어지니까 size가 변동된다.
		for (int i = 0; i < size; i++) {
			t = tSet.pollFirst(); // 제일 작은 값부터 끄집어내서 기존에있는 요소를 빼오고 지우는 것. 컬렉션에 요소가 남아있지 않다.
//			t = tSet.pollLast();	// 제일 큰 값부터
			System.out.println(t + ", " + tSet.size()); // size() : 남아있는 요소 수
		}

		// iterator 반복자 생성
		Iterator<Integer> iter = tSet.iterator(); // iterator() : 반복자. 해당되는 요소를 하나씩 끄집어 내기 위한것
		while (iter.hasNext()) { // 가져올 요소가 있는가. 더이상 가져올 요소가 없으면 false
			Integer icnt = iter.next();
//			System.out.println(icnt);
		}
	}
}
