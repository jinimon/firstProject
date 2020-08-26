package com.yedam.test;

import java.util.HashSet;
import java.util.Set;

public class Example0824 {
	public static void main(String[] args) {
		// 배열 크기 3
		// 1~6까지 임의의 숫자가 반복되지 않도록 배열에 저장해보세요
		int[] intAry = new int[3];

		// 방법1
		for (int i = 0; i < intAry.length; i++) {
			int ranNum = (int) (Math.random() * 6) + 1;
			intAry[i] = ranNum;
			for (int j = 0; j < i; j++) {
				if (intAry[j] == intAry[i]) {
					i--;
				}
			}
		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(i + " : " + intAry[i]);
		}
		System.out.println("------");

		// 방법2. Collection 활용
		// Set 컬렉션은 객체 중복 저장이 불가능하다.
		Set<Integer> set = new HashSet<>();
		while (true) {
			int temp = (int) (Math.random() * 6) + 1;
			set.add(temp);
			if (set.size() == 3)
				break;
		}
		for (Integer it : set) {
			System.out.println(it);
		}

		// 값이 중복이라 생각했지만 3개 다 출력 되는걸 보니 중복값이 아니다.
		// .toString()으로 찍어보니 주소값이 다 다르다.
		// 동일한 값이라고 지정해주기위해서는 hashCode, equals를 어찌 정의 하냐에따라 논리적으로 동일한 객체가 될수도있고 아닐수도있고
		// hashCode, equals는 Object 클래스가 가진 메소드
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("Hong1", 22));
		pSet.add(new Person("Hong1", 22));
		pSet.add(new Person("Hong3", 20));
		pSet.add(new Person("Hong3", 20));
		pSet.add(new Person("Hong4", 20));

		for (Person p : pSet) {
			System.out.println(p.name + ", " + p.age + ", " + p.toString());
		}

		System.out.println("------");

		// 방법 3
		int cnt = 0;
		while (true) {
			int temp = (int) (Math.random() * 6) + 1;
			int i = 0;
			for (; i < intAry.length; i++) {
				if (intAry[i] == temp) {
					break;
				}
			}
			if (i != 3)
				break;

			if (cnt == 3)
				break;
			else
				intAry[cnt++] = temp;
		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
	}
}
