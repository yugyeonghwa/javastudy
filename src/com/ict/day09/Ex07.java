package com.ict.day09;

public class Ex07 {
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 호출 가능
		// 호출방법 : 클래스이름.멤버필드, 클래스이름.멤버메서드
		System.out.println(Ex06.kor);
		System.out.println(Ex06.eng);
		System.out.println(Ex06.math);
		
		// 메서드도 동일
		Ex06.play01();
		
		int k = Ex06.play02();
		System.out.println(k);
		
	}
}
