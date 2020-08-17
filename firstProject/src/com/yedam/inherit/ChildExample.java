package com.yedam.inherit;

public class ChildExample {
	public static void main(String[] args) {
		// Child는 Parent를 상속받아서 ChildExample 역시 Parent의 기능까지 사용 가능
		Child child = new Child("홍길동", 15, 10);
		child.getName(); // 부모 Parent getName()
		child.getAge(); // 부모 Parent getAge()
		child.getGrade(); // 자신 getGrade()

		Parent parent = new Child("김유신", 20, 20);
		parent.getName();
		parent.getAge();
//		parent.getGrade();	// 자식 Class라서 사용 불가능

		// Vehicle.java
		// 담기는 인스턴스(Taxi(), Bus()..)에 따라 출력되는 내용이 달라진다.
		Vehicle v1 = new Taxi();
		v1.run();
		v1 = new Bus();
		v1.run();

		// Driver.java
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());

		Parent parent1 = new Parent();
		// toString() 형태에 따라 출력
		System.out.println("parent1 : " + parent1.toString());
	}
}
