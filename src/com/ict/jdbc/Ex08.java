package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// Scanner 로 번호, 이름, 주소, 전화번호 받아서 customer 테이블에 삽입하기

		Scanner scan = new Scanner(System.in);

		System.out.print("번호 : ");
		int custid = scan.nextInt();

		System.out.print("이름 : ");
		String name = scan.next();

		System.out.print("주소 : ");
		String address = scan.next();

		System.out.print("전화번호 : ");
		String phone = scan.next();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uesr = "c##ictedu";
			String password = "1111";

			conn = DriverManager.getConnection(url, uesr, password);

			String sql = "insert into customer (custid, name, address, phone) " + "values (?,?,?,?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);

			result = pstmt.executeUpdate();

			if (result > 0) {
				sql = "select * from customer";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}

			} else {
				System.out.println("삽입 실패");
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
