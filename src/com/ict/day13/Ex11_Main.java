package com.ict.day13;

public class Ex11_Main {
	public static void main(String[] args) {
		toplay2("홍이");
		
		// 인터페이스는 객체로 생성 못함
		// Ex11_IBehavior ibe = new Ex11_IBehavior();
		
		// 둘 다 가능~~
		//Ex11_Soccer soccer = new Ex11_Soccer();
		//Ex11_BassGuitar bassGuitar = new Ex11_BassGuitar();
		Ex11_IBehavior soccer = new Ex11_Soccer();
		// 방법 1. 객체 생성을 하고 호출한 메서드 인자값에? 생성한 거 넣어주기?
		Ex11_IBehavior bassGuitar = new Ex11_BassGuitar();
		toplay(bassGuitar);
		System.out.println();
		
		// 방법 2. 호출한 메서드 인자값에 바로 생성하기??
		toplay(new Ex11_Soccer());
	}
	
	
	
	public static void toplay(Ex11_IBehavior ib) {
		ib.play();
	}
	
	
	public static void toplay2(String str) {
		System.out.println(str + "님 성공");
	}
	
	
}
