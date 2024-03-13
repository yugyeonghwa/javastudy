package com.ict.day10;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 t = new Ex11();
		
		System.out.println(t.getName());
		// 홍길동 이름을 둘리로 변경하자
		t.setName("둘리");
		System.out.println(t.getName());
		
		System.out.println();
		
		// 둘리 나이 바꾸기
		System.out.println(t.getAge());
		t.setAge(15000);
		System.out.println(t.getAge());
		
		
		
		
		
		
 		
		
		
		
		
	}
}
