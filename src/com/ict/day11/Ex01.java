package com.ict.day11;

public class Ex01 {
	// 생성자 : 클래스를 객체로 만들 때 한번 호출됨
	// 클래스이름 참조변수 = new 생성자([인자]);
	// 생성자의 목적 : 멤버필드(변수와 상수)의 초기값 지정
	// 생성자의 특징 : 클래스이름 = 저장이름 = 생성자이름
	// 			  반환형이 없는 메서드와 같음 (void 마냥)
	//			  메서드처럼 기능, 동작을 할 수 있음
	//			  클래스의 생성자가 없으면 기본생성자로 객체를 생성함
	//			  기본생성자란 인자가 없는 생성자
	//			  생성자도 오버로딩이 가능(여러개의 생성자를 만들 수 있음)
	//			  생성자는 다른 생성자를 호출할 수 있음
	
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";
	/*
	public Ex01() {
		System.out.println("Ex01 생성자");
		name = "희동이";
		// 멤버필드의 값을 지정(초기값)
		// 메서드처럼 다른 기능을 만들 수도 있음
		// 메서드처럼 다른 메서드를 호출할 수 있음
		// 다른 생성자를 호출할 수 있음
	}
	*/
	/*
	public Ex01(String name) {
		this.name = name;
	}
	*/
	
	public Ex01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
}
