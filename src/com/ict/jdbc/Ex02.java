package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
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
			// 4. jdbc 드라이버로딩 : 오라클, MySQ, mariaDB 다 다름
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 오라클과 연결하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			// 6. 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. sql 작성
//			String sql = "select * from book";
			String sql = "select * from book where bookname like '축구%'";
			
			// 8. sql를 보내기 위해 구문을 만듬
			stmt = conn.createStatement();
			
			// 9. 보내서 결과 받기 (select 문인 경우)
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.print(rs.getInt("BOOKID")+"\t");
				System.out.print(rs.getString("BOOKNAME")+"\t");
				System.out.print(rs.getString("PUBLISHER")+"\t");
				System.out.print(rs.getInt("PRICE")+"\n");
			}
			
		} catch (Exception e) {
			System.out.println(e);
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
