package com.yedam.exam;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<>();
		container1.set("홍길동", "도적");
		String name1 = container1.getM();
		String job = container1.getT();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getT();
		int age = container2.getM();
	}
}
