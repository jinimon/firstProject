package com.yedam.database;

import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.리스트 | 2.입력 | 3.수정 | 4.삭제 | 9.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 > ");

			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				EmpDAO dao = new EmpDAO();
				Employee[] emps = dao.getEmpList(); // 배열 타입 불러와서 배열 emps에 삽입
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
//				System.out.print("Job > ");
//				String empJob = scn.next();

				EmpDAO dao = new EmpDAO();
				Employee emp = new Employee(empId, empName, empEmail, empHire, "IT_PROG");
				dao.addEmployee(emp);
			} else if (selectNo == 3) {
				EmpDAO dao = new EmpDAO();
				System.out.print("수정 할 사원번호 > ");
				int empId = scn.nextInt();
				System.out.print("변경될 월급 > ");
				int salary = scn.nextInt();
				dao.updateEmp(empId, salary);
			} else if (selectNo == 4) {
				EmpDAO dao = new EmpDAO();
				System.out.print("삭제 할 사원번호 > ");
				int empId = scn.nextInt();
				dao.removeEmp(empId);
			} else if (selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	} // end of main()
}
