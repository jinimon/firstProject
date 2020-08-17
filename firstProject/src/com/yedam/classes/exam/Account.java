package com.yedam.classes.exam;

public class Account {
	static int MAX_BALANCE = 1000000;
	static int MIN_BALANCE = 0;
	private String ano;
	private String owner;
	private int balance;

	public Account() {

	}

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance <= MAX_BALANCE && balance >= MIN_BALANCE) {
			this.balance = balance;
		}
	}
}
