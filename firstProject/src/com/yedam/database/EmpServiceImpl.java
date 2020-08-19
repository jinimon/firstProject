package com.yedam.database;

// EmpService를 구현하는 클래스
public class EmpServiceImpl implements EmpService {

	EmpDAO dao = new EmpDAO();

	@Override
	public Employee[] showList() {
		dao.getEmpList();	// dao에 있는 해당 메소드 호출
		return null;
	}

	@Override
	public void addEmp(Employee emp) {
		dao.addEmployee(emp);
	}

	@Override
	public void modEmp(Employee emp) {
		dao.updateEmp(emp);
	}

	@Override
	public void delEmp(int empId) {
		dao.removeEmp(empId);
	}
}
