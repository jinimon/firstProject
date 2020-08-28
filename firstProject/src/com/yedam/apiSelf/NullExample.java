package com.yedam.apiSelf;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;

		System.out.println(Objects.requireNonNull(str1));

		try {
			String name = Objects.requireNonNull(str2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// 람다식. 원래는 아래 형식인데 축소시킴
//		Objects.requireNonNull(obj, messageSupplier)
		try {
			String name = Objects.requireNonNull(str2, () -> "이름이 없다고.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
