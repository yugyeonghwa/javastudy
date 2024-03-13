package com.ict.day14;

// Member 외부클래스
public class Ex02 {
	String name = "홍이";
	private int age = 24;
	static boolean gender = true;
	
	// 외부생성자
	public Ex02() {
		System.out.println("외부 : " + this);
	}
	
	// 외부클래스의 메서드
	public void sound() {
		// 외부클래스의 멤버들은 불러올 수 있음 (name, age, gender)
		// 내부클래스의 멤버들은 불러올 수 없음 (addr, room)
		System.out.println("외부클래스의 메서드");
	}
	
	// 내부클래스
	public class Inner01{
		String addr = "서울 마포구 백범로";
		int room = 5;
		// 내부생성자
		public Inner01() {
			System.out.println("내부 : " + this);
		}
		
		public void play() {
			System.out.println(addr);
			System.out.println(room);
			
			// 외부클래스의 멤버필드를 마음대로 사용 가능(private 가능)
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			// 외부클래스의 멤버메서드를 마음대로 사용 가능
			sound();
			
		}
	}
}
