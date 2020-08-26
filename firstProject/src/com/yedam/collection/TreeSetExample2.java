package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1", 10));
		set.add(new Person("Hong2", 14));
		set.add(new Person("Hong3", 12));
		set.add(new Person("Hong4", 11));
		// ClassCastException 형변환 예외 발생
		// Comparable가 구현된 클래스가 되어야 크다 작다를 구분할 수 있다. 그래서 Person 클래스에 implements
		// Comparable<Person> 추가해서 해결.

		// SortedSet : 원소들이 정렬되어 있는 Set
		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 12)); // headset : 기준보다 작은 값(앞의 범위). 기준값 포함 x
		sSet = set.tailSet(new Person("So", 12)); // tailSet : 기준보다 크다(뒤의 범위). 기준값 포함x
		sSet = set.subSet(new Person("Temp", 10), new Person("Temp2", 12)); // subSet() : 범위 지정 가능. 10(inclusive) < N <= 12(exclusive)
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("--------------------------");

		NavigableSet<Person> nSet = set.headSet(new Person("Sorted", 12), true); // 기준값, 포함 유무
		nSet = set.tailSet(new Person("Sorted",12 ),false);
		set.subSet(new Person("SSS", 10), true, new Person("TTT", 12), true);
		for (Person person : nSet) {
			System.out.println(person.name + ", " + person.age);
		}

		Iterator<Person> iter = set.iterator();
		while (iter.hasNext()) { // hasNext() : 가져올 요소가 있는지 확인
			// 3개를 add하고 sout하면 첫번째에 next하면서 2개를 가지고오고
			// 그 다음번에 3번째를 next하고 다음 next할게 없어서 error가 발생했음.
//			System.out.println(iter.next().name + ", " + iter.next().age); // .next() : 요소 하나씩 가져옴
		}
	}
}
