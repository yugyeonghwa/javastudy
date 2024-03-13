package com.ict.jdbc;

import java.util.Scanner;

public class Ex11_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체 데이터 보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 변경");
		System.out.print(">>>>>>>>>>>>>>>>>>>>  ");

		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			Ex11_DAO.getInstance().getSelectAll();
			break;
		case 2:
			System.out.print("검색할 custid : ");
			int custid = scan.nextInt();
			scan.nextLine();
			Ex11_DAO.getInstance().getSelectOne(custid);
			break;
		case 3:
			System.out.println("삽입 정보를 입력하세요.");
			System.out.print("번호 : ");
			int custid2 = scan.nextInt();
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("주소 : ");
			String address = scan.next();
			System.out.print("전화번호 : ");
			String phone = scan.next();

			int result = Ex11_DAO.getInstance().getInsert(custid2, name, address, phone);
			// 성공하면 전체보기를 하자
			if (result > 0) {
				Ex11_DAO.getInstance().getSelectAll();
			}
			break;
		case 4:
			System.out.print("삭제할 custid : ");
			custid = scan.nextInt();
			Ex11_DAO.getInstance().getDelete(custid);
			break;
		case 5:
			System.out.println("변경할 정보를 입력하세요.");
			System.out.print("번호 : ");
			int custid4 = scan.nextInt();
			System.out.print("이름 : ");
			String name2 = scan.next();
			System.out.print("주소 : ");
			String address2 = scan.next();
			System.out.print("전화번호 : ");
			String phone2 = scan.next();
			Ex11_DAO.getInstance().getUpdate(custid4, name2, address2, phone2);
			break;
		}

	}
}
