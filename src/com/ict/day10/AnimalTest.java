package com.ict.day10;

public class AnimalTest {
	public static void main(String[] args) {

		Animal t = new Animal();

		System.out.println("이름 : " + t.getName());
		System.out.println("나이 : " + t.getAge());
		if (t.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
				
		System.out.println();
		
		// 펭귄으로 변경하자
		t.setName("펭귄");
		System.out.println("이름 : " + t.getName());
		
		t.setAge(5);
		System.out.println("나이 : " + t.getAge());
	
		if (t.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}

		System.out.println();
		
		
		
		Animal t2 = new Animal();
		System.out.println("이름 : " + t2.getName());
		System.out.println("나이 : " + t2.getAge());
		if (t2.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
		
		
		


	}
}
