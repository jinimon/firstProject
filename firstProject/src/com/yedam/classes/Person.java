package com.yedam.classes;

public class Person {
	String name; // 필드
	int age; // 필드

	public Person() { // 매개값 없는 생성자를 기본 생성자(default Constructor)
		name = "anonymous"; 	// name 필드에 anonymous 값을 기본적으로 담아두겠다는 의미
		age = 10;
	}
	// 메소드들은 return 같은 반환 타입에대해서 반드시
	// 생성자는 반환 같은거 없음(void, type..) 클래스 이름으로 기능을 담겟다 하는것은 생성자

	public Person(String name) {	// 매개값 있는 생성자
		this.name = name;
		// this.name : 클래스의 필드
		// 클래스의 필드와 매개변수의 변수(매개값)와 비교해주기 위해 필드에 .this를 붙여준다.
	}
	
	public Person(String name, int age) {	// 매개값 있는 생성자
		this.name = name;
		this.age = age;
	}

	public String introduce() { // method
		return "이름은 " + name + " 나이는 " + age;
	}

	public String getName() { // method
		return name;
	}

	public void setName(String name) { // method
		this.name = name;
	}

	public int getAge() { // method
		return age;
	}

	public void setAge(int age) { // method
		this.age = age;
	}
}
