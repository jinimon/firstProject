package com.yedam.exam;

public class Member {

	private String memId;
	private String memPwd;
	private String name;
	private String regDt;

	public Member() {

	}

	public Member(String memId, String memPwd, String name, String regDt) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.name = name;
		this.regDt = regDt;
	}

	public String getMemId() {
		return memId;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public String getName() {
		return name;
	}

	public String getRegDt() {
		return regDt;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	@Override
	public String toString() {
		return "Member [memId=" + memId + ", memPwd=" + memPwd + ", name=" + name + ", regDt=" + regDt + "]";
	}
}
