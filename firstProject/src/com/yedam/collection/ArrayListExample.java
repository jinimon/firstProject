package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

// ArrayList 대신 Vector 사용해도 ok. 기능은 같음. 멀티스레드 환경에서는 Vector가 더 유용
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("이화진");
		list.add("윤땡땡"); // 이전에 입력된 이후에 순서대로 저장된다.
		list.add(1, "이땡땡"); // 1번에 삽입하면서 기존에 있던 윤땡땡이 2번으로 밀려남

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (String str : list) { // 인덱스 순번대로 출력
			System.out.println(str);
		}
	}
}
