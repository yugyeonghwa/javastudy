package com.ict.day14;

import com.ict.day14.Ex04.Inner03;

public class Ex04_Main {
	public static void main(String[] args) {
		// static 별도의 객체 생성없이 사용 가능
		System.out.println(Inner03.room);
		
		// 별로도 만들어짐
		Ex04 t = new Ex04();
		t.play();
		Inner03 inner03 = new Inner03();
		inner03.prn(); 
	}
}
