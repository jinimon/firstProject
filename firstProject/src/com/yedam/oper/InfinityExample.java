package com.yedam.oper;

public class InfinityExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

		double z = x / y;
		System.out.println("z1 : " + z);

		z = x % y;
		System.out.println("z2 : " + z);
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println(z + " : 의미없는 값입니다.");
		} else {
			System.out.println("z : " + z);
		}
	}
}
