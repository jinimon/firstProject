package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, Member> map = new HashMap<>();

		map.put(11, new Member("이화진", 20));
		map.put(12, new Member("윤땡땡", 21));
		map.put(13, new Member("김땡땡", 22));

//		System.out.println(map.get(11).getName() + ", " + map.get(11).getAge());

		Set<Integer> set = map.keySet(); // 모든 key 값을 Set 객체에 담아서 리턴
		for (Integer i : set) {
			Member m = map.get(i); // Member 타입으로 return
//			System.out.println(m.getName() + ", " + m.getAge());
		}

		// 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 return
		Set<Map.Entry<Integer, Member>> entSet = map.entrySet();
		for (Map.Entry<Integer, Member> m : entSet) {
//			System.out.println(m.getKey() + ", " + m.getValue().getName());
		}

		Map<String, String> m = new HashMap<>();
		m.put("이름", "이화진");
		m.put("전공", "컴정");
//		getInfo(m);

		Map<String, Integer> m2 = new HashMap<>();
		m2.put("이화진", 20);
		m2.put("윤땡땡", 23);
		m2.put("김땡땡", 26);
		getAge(m2);
		System.out.println();

		Set<Map.Entry<String, Integer>> m2Set = m2.entrySet();
		for (Map.Entry<String, Integer> m22 : m2Set) {
			System.out.println(m22.getKey() + ", " + m22.getValue());
		}
	}

	public static void getInfo(Map<String, String> m) {
		System.out.println("이름 : " + m.get("이름"));
		System.out.println("전공 : " + m.get("전공"));
	}

	public static void getAge(Map<String, Integer> m) {
		Set<String> keySet = m.keySet();
		for (String ky : keySet) {
			Integer value = m.get(ky);
			System.out.println("이름은 " + ky + "이고 나이는 " + value + "입니다.");
		}
	}
}
