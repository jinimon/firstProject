package com.yedam.generic;

public class Box<T> {
	private T obj;	// 모든 type을 받을 수 있다. 모든 클래스의 최상위 클래스이기 때문.

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return this.obj;
	}
}
