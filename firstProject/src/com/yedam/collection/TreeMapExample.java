package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "이화진1");
		scores.put(new Integer(98), "이화진2");
		scores.put(new Integer(75), "이화진3");
		scores.put(new Integer(95), "이화진4");
		scores.put(new Integer(80), "이화진5");

		// firstEntry : Map.Entry 타입(key, value)으로 해당 맵에서 현재 가장 작은(첫 번째) 키와 그에 대응하는 값의 엔트리를 반환
		// Map은 key, value를 가지고 있다.
		Map.Entry<Integer, String> entry = scores.firstEntry();
		System.out.println("점수 : " + entry.getKey() + ", 이름 : " + entry.getValue());
		System.out.println("--------------------");

		// firstKey : integer 타입으로 해당 맵에서 현재 가장 작은(첫 번째) 키만 반환
		Integer icnt = scores.firstKey();
		scores.get(icnt);
		System.out.println("점수 : " + icnt + ", 이름 : " + scores.get(icnt));
		System.out.println("--------------------");
		
		// pollFirstEntry : 해당 엔트리 반환 후 제거
		Map.Entry<Integer, String> pEntry = scores.pollFirstEntry();		
	}
}
