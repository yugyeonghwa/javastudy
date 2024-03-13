package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// jar : 자바로 압축한 파일. 보통 라이브러리에 사용, 클래스들로 이루어짐
// 1. 자바와 오라클을 연결해주는 드라이버(ojdbcXXX.jar)가 필요
// 	  그런데 sqldevloper에 존재함. 해당 드라이버를 찾아서 util 폴더에 넣자
// 2. 이클립스에서 프로젝트에서 마우스 오른쪽 Build Path -- Configure Build Path

public class Ex01 {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 구문 작성
		Statement stmt = null;
		// 3-1. 결과를 받은 클래스(select 일 때)
		ResultSet rs = null;
		// 3-2. 결과를 받은 변수(select 가 아닐 때)
		int result = 0;
		
		try {
			// 4. jdbc 드라이버로딩 : 오라클, MySQL, mariaDB 다 다름
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 오라클과 연결하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			// 6. 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. SQL 작성
//			String sql = "select * from customer";
			String sql = "select * from customer where custid = 3";
			
			// 8. sql를 보내기 위해 구문을 만듬
			stmt = conn.createStatement();
			
			// 9. 보내서 결과 받기
			// 9-1. select 문인 경우
			rs = stmt.executeQuery(sql);
			
			// 9-2. insert, update, delete 인 경우
			// result = stmt.executeUpdate(sql);
			// rs.getXXXX(index => 1부터)
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
			
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
	}
}
