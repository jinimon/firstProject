package com.yedam.database;

public interface EmpService {
	public Employee[] showList(); // 전체 리스트

	public void addEmp(Employee emp); // 입력

	public void modEmp(Employee emp); // 수정

	public void delEmp(int empId); // 삭제
}
