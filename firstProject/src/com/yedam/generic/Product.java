package com.yedam.generic;

public class Product<T, M> { // Product의 필드 2개의 타입을 지정
	// 필드
	private T type;
	private M model;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
}
