package com.yedam.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

// Comparator에 생성자를 매개값으로 주거나 Comparable을 implements 해주거나 두가지 방법 중 하나
class Fruit { // 얘는 크다작다 기준이 없다(Comparable X). 그래서 아래에 Comprator를 구현해주는 클래스를 생성했다.
	String name;
	int price;

	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

// Comparator(generic 타입)를 재정의
class FruitComp implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.price - o2.price; // 오름차순(음수), 내림차순(양수)
	}
}

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Fruit, Integer> map = new TreeMap<>(new FruitComp()); // new FruitComp()이 기준이된다.
		// TreeMap : 키 값을 기준으로 크다 작다 비교
		map.put(new Fruit("Orange", 1000), 1);
		map.put(new Fruit("Grape", 3000), 2);
		map.put(new Fruit("Banana", 2000), 3);
		Set<Fruit> set = map.keySet(); // keySet : key에 해당하는 인스턴스가 set에 담겼다.
		NavigableSet<Fruit> dSet = map.descendingKeySet(); // descendingKeySet(역순)으로 NavigableSet(정렬)
		dSet = map.navigableKeySet(); // navigableKeySet : 정렬되어있는 set
		Iterator<Fruit> iter = dSet.iterator();
	}
}
