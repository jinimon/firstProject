package com.yedam.lambda;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String, String> func1 = (str) -> {
			return str + " is nothing"; // 반환값
		};
		String result = func1.apply("something"); // 매개값
		System.out.println(result);

		// String을 입력받아 Integer를 반환
		Function<String, Integer> func2 = (str) -> {
			return str.length();
		};
		int len = func2.apply("Hello");
		System.out.println(len);
	}
}
