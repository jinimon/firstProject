package com.yedam.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NewExample2 {
	// Member는 기본적으로 Object를 상속하고있어서 .equals() 사용 가능
	class Member {
		String id; // 필드

		// 생성자
		Member(String id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object obj) {
			// Object : 어떤 타입이든 가능하다.
			// 이 obj가 타입을 변경할수있는지 확인
			if (obj instanceof Member) { // obj가 Member 타입이면 형변환한다.
				Member mem = (Member) obj;
				return id.equals(mem.id); // 1.id 값 비교. id값 같으면 같은 id
//				return super.equals(obj);	// 부모가 가진 값을 비교
			} else {
				return false;
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(id); // 1.String type. 문자열이 같으면 같은 hashcode
//			return super.hashCode();
		}
	}

	public static int hashCode(Object[] a) {
		if (a == null)
			return 0;
		int result = 1;
		for (Object element : a)
			result = 31 * result + (element == null ? 0 : element.hashCode());
		return result;
//		return super.hashCode();
	}

	public void printMember() {// 메소드
		Member m1 = new Member("Yoon");
	}

	public static void main(String[] args) {
		NewExample2 ne = new NewExample2();
		// static 클래스 안에 클래스(Member)를 생성해 사용하는 경우 상위클래스.클래스로 생성해야한다.규칙.
		Member m1 = ne.new Member("Lee"); // 인스턴스 선언
		Member m2 = ne.new Member("Lee");
//		System.out.println(m1 == m2); // 참조 주소값 비교
		System.out.println(m1.equals(m2)); // 값 비교

//		Objects.hash(1); // hash 값을 만들어주는 메소드
		System.out.println(Objects.hash(1));
//		System.out.println(hashCode(new Integer(1)));

		System.out.println("-----------");
		// set 컬렉션은 중복값 제외
		Set<Member> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		// 1. 조건에 의해 hashCode랑 equals 해서 m1, m2는 동일한 값
		for (Member m : set) {
			System.out.println(m.id);
		}
	}
}
