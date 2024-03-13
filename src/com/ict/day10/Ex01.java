package com.ict.day10;

public class Ex01 {
	// 메서드 인자를 기본자료형의 값은 인자로 전달하면 
	// 값 호출 (Call By Value)
	// 원본값은 변하지 않음
	public int add(int k) {
		++k;
		return k;
	}
	
	// 메서드 인자를 배열이나 객체를 인자로 전달하면 
	// 참조 호출 (Call By Reference)
	// 원본값이 변함
	public void add2(int[] k) {
		// 받은 배열을 하나씩 꺼내서 10씩 증가하자
		for (int i = 0; i < k.length; i++) {
			k[i] = k[i] + 10; // 대입연산자로도~ k[i] += 10
			
		}
		
	}
}
