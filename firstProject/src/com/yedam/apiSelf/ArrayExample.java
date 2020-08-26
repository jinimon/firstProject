package com.yedam.apiSelf;

import java.util.Arrays;

class User implements Comparable<User> {
	String name;
	int grade;

	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(User o) {
		return this.grade - o.grade;
//		return this.name.compareTo(o.name); // 오름차순. this.name을 기준으로 o.name이랑 비교했을 때 음수
	}
}

public class ArrayExample {
	public static void main(String[] args) {
		int[] scores = { 95, 80, 36, 88 };

		Arrays.sort(scores);

		// abc 순으로 정렬.. -> Choi, Hong, Park
		String[] names = { "Hong", "Park", "Choi" };

		System.out.println("--- 정렬 전 ---");
		for (String i : names) {
			System.out.println(i);
		}

		Arrays.sort(names);

		System.out.println("--- 정렬 후 ---");
		for (String i : names) {
			System.out.println(i);
		}
		System.out.println();

		User[] users = { new User("user5", 5), new User("user2", 2), new User("user1", 3) };
		Arrays.sort(users);
		for (User user : users) {
			System.out.println(user.name + ", " + user.grade);
		}
	}
}
