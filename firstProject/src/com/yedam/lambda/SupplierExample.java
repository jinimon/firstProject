package com.yedam.lambda;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			return "HELL";
		};
		String result = supplier.get();
		System.out.println(result);

		IntSupplier intSup = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println(intSup.getAsInt());

		BooleanSupplier boolSup = () -> {
			class Member { // 이 인터페이스 내에서만 사용
				// 필드
				String name;
				int age;

				public Member(String name, int age) {
					this.name = name;
					this.age = age;
				}
			}
			Member m1 = new Member("Lee", 23);
			Member m2 = new Member("Yoon", 24);

			return m1.age == m2.age;
		};
		boolSup.getAsBoolean();
	}
}
