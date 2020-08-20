package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();

		box.set(new String("Hello"));
		String result = box.get();

		Box<Person> box2 = new Box<>();
		box2.set(new Person());
//		result = box2.get(); // box2.get()은 Person type이라 result(String)에 넣을 수 없다.
		Person p1 = box2.get();

		// Person 타입으로 정해진다.
		Box<Person> box3 = Utils.boxing(new Person());

		// 매개값으로 들어오는 타입에 따라 리턴 타입도 같이 정해진다.
		Box<String> box4 = Utils.boxing(new String("haha"));

		/*
		 * Box box = new Box(); String str1 = new String("Hello"); box.set(str1);
		 * 
		 * String result = (String) box.get(); // box.get()은 Object 타입을 return // Object
		 * 타입을 String 타입으로 형변환 해줘야 한다.
		 * 
		 * Person p1 = new Person(); // Person은 패키지 달라서 import 해주기 box.set(p1); Person
		 * p2 = (Person) box.get();
		 * 
		 * result = (String) box.get(); // box.get()에는 Person 타입이 들어있어서 형변환 // 실행하는 시점에
		 * ERROR(runtime error) 발생.. 코드에서는 오류 안뜸. 이런 상황때문에 제네릭을 사용한다.
		 */
	}
}
