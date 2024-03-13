package com.ict.day14;

public class Ex02_Main {
	public static void main(String[] args) {
		// 멤버내부클래스는 별도로 객체 생성 안됨
		// Inner01 t1 = new Inner01();
		
		// 외부클래스를 통해서 내부클래스 객체를 생성
		Ex02 t1 = new Ex02();
		// t2 주소에 반드시 $가 존재함 (내부클래스라는 것)
		Ex02.Inner01 t2 = t1.new Inner01();
		
		t2.play();
		
		
	}
}
