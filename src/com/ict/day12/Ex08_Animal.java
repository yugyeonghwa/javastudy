package com.ict.day12;

// 추상클래스 : 하나 이상의 추상메서드를 가지고 있는 클래스
//			일반적인 변수와 상수, 메서드도 가질 수 있음
//			반드시 abstract 가 붙음
//			추상클래스는 new 예약어를 사용해서 인스턴스 객체를 만들 수 없음(?)
//			익명 내부클래스 타입으로는 생성 가능
public abstract class Ex08_Animal {
	int leg = 4;
	boolean live = true;
	
	public void play() {
		System.out.println("열심히 달린다.");
	}
	
	// 추상메서드 : body를 가지고 있지 않는 메서드를 말함(블록이 없음)
	//			즉, 구체적으로 실행하는 실제가 없음(실행하는 수행문이 없음)
	public abstract void sound();
	
}
