package com.yedam.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고 점수 받은 아이디
		int maxScore = 0;
		int totalScore = 0;

		Set<String> keySet = map.keySet();
		for (String ky : keySet) {
			int value = map.get(ky);
			totalScore += value;
			if (maxScore < value) {
				maxScore = value;
				name = ky;
			}
		}
//		System.out.println("총점 : " + totalScore);
		System.out.println("평균 점수 : " + totalScore / map.size());
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
	}
}
