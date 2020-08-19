package com.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
		// DataAccessObject는 new로 생성 안됨
//		DataAccessObject dao = new OracleDb();
		
		MySqlDb dao = new MySqlDb(); // oracleDb -> mysqlDb로 교환(대체)
		
		dao.select();
		dao.insert();
		dao.update();
	}
}
