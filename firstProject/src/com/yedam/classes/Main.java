package com.yedam.classes;

public class Main {
	public static void main(String[] args) {
		Student std = new Student(111, "홍길동", "역사"); // 객체 생성
		Student std2 = new Student();
		Student std3 = new Student(333, "이화진", "역사");
		Student std4 = new Student(444, "윤땡땡", "역사");
//		std2.hakbun = 222;	// private 때문에 hakbun에 접근 불가
		std2.setHakbun(222); // method의 매개값으로 hakbun 입력
		std2.name = "김유신";
		std2.major = "말타기";

		String searchName = "김유신";
		String searchMajor = "역사";

		Student[] StudAry = { std, std2, std3, std4 }; // [2][3]
		for (Student s : StudAry) {
//			s.toString().contains(searchName)	// 이렇게하는 방법도 있다.
			if (s.getMajor().equals(searchMajor)) {
				System.out.println(s.toString());
				// 주소값으로 나오던걸 Student.java에 toString()을 추가하니까 변환된 데이터
				// toString()에서 return하는 형식에 따라 출력된다.
			}
		}
	}
}
