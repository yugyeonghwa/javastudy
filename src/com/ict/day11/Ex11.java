package com.ict.day11;

public class Ex11 {
	// this 와 this([인자])
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//		  지역변수와 전역변수의 이름이 같을 때
	//		  전역변수 앞에 this을 붙임
	
	// this([인자]) : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	//			    객체 내부 생성자에서 다른 생성자를 호출할 때 사용
	//				반드시 생성자의 첫번째 줄에 존재해야 함
	
	private String name = "홍길동";
	private int age = 37;
	
	public Ex11() {
		System.out.println("기본생성자 : " + this);
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
	
	
	
	
	
	
	
}
