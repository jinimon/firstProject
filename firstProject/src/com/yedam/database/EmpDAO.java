package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	// 입력
	// employee의 모든 정보를 담아서 보내줘야하기 때문에 매개변수로 Employee를 줬다.
	public void addEmployee(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)" + "values("
				+ emp.getEmployeeId() + ",\'" + emp.getLastName() + "\',\'" + emp.getEmail() + "\',\'"
				+ emp.getHireDate() + "\',\'" + emp.getJobId() + "\')";
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 조회
	public Employee[] getEmpList() {
		Connection conn = DBConnection.getConnection(); // DB 연결
		Employee[] employees = new Employee[100];

		try {
			String sql = "select * from emp_temp order by employee_id";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int idx = 0; // 인덱스

			while (rs.next()) {
				// 인스턴스 emp 생성을 위해 default 생성자 추가
				Employee emp = new Employee();
				String firstName = rs.getString("first_name");
				emp.setFirstName(firstName);
				// last_name은 추가로 변수 생성 하지 않고 필드 값 바로 삽입
				emp.setLastName(rs.getNString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));

				// 배열에 필드값들 삽입할것. 인덱스 번호 하나씩 증가해야함
				employees[idx++] = emp;
			}
			System.out.println("-- end of data --");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees; // employees 배열을 반환
	} // end of getEmpList()

	public void updateEmp(Employee emp) {
		Connection conn = DBConnection.getConnection();
		String sql = "update emp_temp set salary = \'" + emp.getSalary() + "\' where employee_id = " + emp.getEmployeeId();
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeEmp(int empId) {
		Connection conn = DBConnection.getConnection();
		String sql = "delete from emp_temp where employee_id = " + empId;
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} // end of class