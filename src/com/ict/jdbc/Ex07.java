package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		

		try {
			System.out.print("검색번호 : ");
			int custid = scan.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);

			// String sql = "select * from customer";
			// ? : 동적 바인딩 변수 => 현재는 값을 모르고 실행할 때 값을 알 수 있음
			String sql = "select * from customer where custid = ?";

			pstmt = conn.prepareStatement(sql);
			
			// ?를 처리하자
			pstmt.setInt(1, custid);
			
			// 보내서 결과 받기
			// select 문인 경우
			rs = pstmt.executeQuery();
			
			// select 문이 아닌 경우
			// result = pstmt.executeUpdate();

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (Exception e) {
		} finally {
			try {
				scan.close();
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}

	}
}
