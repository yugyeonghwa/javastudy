 package com.ict.day12;

public class Ex05_Cat extends Ex05_Animal {
	int tail = 10;

	// 부모 메서드를 가져와서 자식 클래스가 마음대로 변경 가능
	// 오버라이딩
	// @Override => 어노테이션
	// @Override => 부모클래스의 메서드를 자식클래스가 가져와서 재정의 함
	@Override
	public void Sound() {
		System.out.println("야옹~ 야옹~");
	}
	public void play() {
		System.out.println("놀기");
	}
}
 