package com.yedam.generic;

import com.yedam.classes.Person;

public class ProductExample {
	public static void main(String[] args) {
		// 앞에 선언하면서 <String, Person> 했으니까 뒤에는 생략해도됨
		Product<String, Person> pr1 = new Product();
		pr1.setModel(new Person());
		pr1.setType("유형"); // String 클래스만 new 안하고 바로 리터럴 삽입해도 ok

		// Utils.java
		Product<String, Integer> p1 = new Product<>();
		p1.setModel(10);
		p1.setType("이화진");

		Product<String, Integer> p2 = new Product<>();
		p2.setModel(10);
		p2.setType("이화진");

		// p1, p2는 인스턴스가 다르다. 주소값이 다르다. p1, p2 비교시 비교되는건 안에 들어있는 데이터(주소값)
		// 인스턴스 주소값이 다르지만 들어있는 값은 같아서 논리적인 객체로 여기고 싶다고 만들어진게 .compare
		
		boolean tof = Utils.compare(p1, p2);
		if(tof)
			System.out.println("논리적으로 동등");
		else
			System.out.println("논리적으로 다름");
	}
}
