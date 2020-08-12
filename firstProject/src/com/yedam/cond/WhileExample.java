package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {
		// 1~10 합
		int i = 0;
		int sum = 0;
		while (i < 10) {
			i++;
			sum += i;
//			System.out.println("i : " + i);
		}
		System.out.println("sum : " + sum);

		// 구구단
		int a = 2;
		int b = 1;
		while (a < 10) {
			while (b < 10) {
//				System.out.println(a + " * " + b + " = " + a * b);
				System.out.print(a + " * " + b + " = " + a * b + "\t");
				b++;
			}
			System.out.println();
			b = 1;
			a++;
		}
	}
}
