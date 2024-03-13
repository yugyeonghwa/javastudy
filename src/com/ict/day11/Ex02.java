package com.ict.day11;

public class Ex02 {
	public static void main(String[] args) {
		
		// Ex01 객체 생성
		// 기본생성자를 사용함
		// Ex01의 생성자를 만들자
		Ex01 ex01 = new Ex01("도우너", 5);
		
		// 이름, 나이, 주소 출력
		System.out.println("이름 : " + ex01.getName());
		System.out.println("나이 : " + ex01.getAge());
		System.out.println("주소 : " + ex01.getAddr());
		System.out.println();
		
		// 이름을 임꺽정, 나이를 34, 주소를 함경도로 변경
		ex01.setName("임꺽정");
		System.out.println("이름 : " + ex01.getName());
		
		ex01.setAge(34);
		System.out.println("나이 : " + ex01.getAge());
		
		ex01.setAddr("함경도");
		System.out.println("주소 : " + ex01.getAddr());
		System.out.println();
		
		
	
		
		
	}
}
