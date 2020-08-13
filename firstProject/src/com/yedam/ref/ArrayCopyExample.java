package com.yedam.ref;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int[] { 3, 6, 9, 2, 4 };

		// if) 데이터 값은 5개인데 인덱스 크기[]가 4이면 ERROR(Exception.예외 -> 실행 중 발생한 오류)
		int[] cpyAry = new int[5];

		for (int i = 0; i < origAry.length; i++) {
			cpyAry[i] = origAry[i];
		}

		System.out.println(cpyAry); // 16진수 값이 출력(cpyAry 주소번지)

		System.arraycopy(origAry, 0, cpyAry, 0, 5);
		// 복사할배열(원본), 복사시작번호, 붙여넣을배열, 붙여넣을 시작번호, 5개
		for (int i = 0; i < origAry.length; i++) {
			System.out.println(">> " + cpyAry[i]);
		}

		// 확장 for()
		for (int num : cpyAry) {
			System.out.println(num);
		}
	}
}