package com.yedam.inherit;

public class Vehicle {
	void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Bus extends Vehicle {

	@Override	// 부모꺼를 자식이 받아서 재정의
	void run() {
		System.out.println("버스가 달립니다.");
	}
	
}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("택시가 달립니다.");
	}
}