package com.yedam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class People {
	String name;
	int age;
	Pet[] petAry;
	Fruit[] fruAry;

	public People(String name, int age, Pet[] petAry, Fruit[] fruAry) {
		this.name = name;
		this.age = age;
		this.petAry = petAry;
		this.fruAry = fruAry;
	}

	@Override
	public String toString() {
		return "{" + name + ", " + age + ", " + Arrays.toString(petAry) + ", " + Arrays.toString(fruAry) + "}";
	}
}

class Pet {
	String name;
	int age;
	String gender;

	public Pet(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "{" + name + ", " + age + ", " + gender + "}";
	}
}

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "{" + name + ", " + price + "}";
	}
}

public class LastExample {
	public static void main(String[] args) {
		Pet[] petA = { new Pet("야옹이", 2, "수컷"), new Pet("멍멍이", 1, "암컷") };
		Fruit[] fruA = { new Fruit("사과", 500), new Fruit("키위", 100) };

		People per1 = new People("이화진", 24, petA, fruA);
		People per2 = new People("익명이", 20, petA, fruA);

		People[] personData = { per1, per2 };

//		System.out.println(Arrays.toString(personData));
		for (int i = 0; i < personData.length; i++) {
			System.out.println(personData[i].toString());
		}
		System.out.println("---------------------------------------------------------------------");

		List<People> perList = new ArrayList<>();

		perList.add(per1);
		perList.add(per2);

		for (People p : perList) {
			System.out.println(p);
		}
	}
}
