package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl(); // EmpServiceImpl : 인터페이스 구현 객체

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.리스트 | 2.입력 | 3.수정 | 4.삭제 | 9.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 > ");

			int selectNo = 0;

			try {
				selectNo = scn.nextInt();
				scn.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력했습니다.");
				scn.nextLine();
				continue;
			}

			if (selectNo == 1) {
//				EmpDAO dao = new EmpDAO();	// 이거 대신에 service 사용할거다!
//				Employee[] emps = dao.getEmpList(); // 배열 타입 불러와서 배열 emps에 삽입
				Employee[] emps = service.showList();
				for (Employee emp : emps) { // for 문으로 출력
					// emp : Employee 클래스 변수
					if (emp != null) {
						System.out.println(emp.toString());
					}
				}
			} else if (selectNo == 2) {
				System.out.print("사원번호 > ");
				int empId = scn.nextInt();
				System.out.print("이름 > ");
				String empName = scn.next();
				System.out.print("이메일 > ");
				String empEmail = scn.next();
				System.out.print("입사일 예) 2020-05-05 > ");
				String empHire = scn.next();

//				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee(empId, empName, empEmail, empHire, "IT_PROG");
				service.addEmp(emp);
//				dao.addEmployee(emp);
			} else if (selectNo == 3) {
				Employee emp = new Employee();
//				EmpDAO dao = new EmpDAO();
				System.out.print("수정 할 사원번호 > ");
				int empId = scn.nextInt();
				System.out.print("변경될 월급 > ");
				int salary = scn.nextInt();
				emp.setEmployeeId(empId);
				emp.setSalary(salary);
//				dao.updateEmp(emp);
				service.modEmp(emp);
			} else if (selectNo == 4) {
				System.out.print("삭제 할 사원번호 > ");
				int empId = scn.nextInt();
//				EmpDAO dao = new EmpDAO();
//				Employee emp = new Employee();
//				emp.setEmployeeId(empId);
				service.delEmp(empId);
//				dao.removeEmp(empId);
			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	} // end of main()
}
