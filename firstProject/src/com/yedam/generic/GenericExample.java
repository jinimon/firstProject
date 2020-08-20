package com.yedam.generic;

import java.util.HashMap;
import java.util.HashSet;

import com.yedam.classes.Person;

public class GenericExample {
	public static void main(String[] args) {
		// 선언하는 순간 type이 정해진다.
		// HashSet은 type parameter가 한개짜리
		HashSet<String> set = new HashSet<String>();
		set.add("이화진");
		set.add("윤땡땡");

		HashSet<Person> set2 = new HashSet<>();
		set2.add(new Person());
		set2.add(new Person());

		// 우리가 만든게 아니기 때문에 이미 지정되어있는 메소드를 사용해야한다.
		HashMap<String, Integer> map = new HashMap<>();
		map.put("이화진", 24);
		map.put("윤땡땡", 20);
	}
}