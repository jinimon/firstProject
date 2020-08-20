package com.yedam.exam;

public class Container<T, M> {
	private T type;
	private M model;

	public void set(T type,  M model) {
		this.type = type;
		this.model = model;
	}

	public T getT() {
		return this.type;
	}

	public M getM() {
		return this.model;
	}
}
