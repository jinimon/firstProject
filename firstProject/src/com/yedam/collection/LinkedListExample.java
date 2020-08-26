package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		long startTime = System.nanoTime(); // 현재 시간을 나노 단위로 보여준다.
		for (int i = 0; i < 30000; i++) {
			aList.add(0, new Integer(i));
		}
		long endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime));

		List<Integer> bList = new LinkedList<>();
		startTime = System.nanoTime(); // 현재 시간을 나노 단위로 보여준다.
		for (int i = 0; i < 30000; i++) {
			bList.add(0, new Integer(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime));

	}
}
