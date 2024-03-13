package com.ict.day10;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 t = new Ex01();
		int var1 = 100;
		// 인자가 기본자료형 : Call By Value
		// 값이 변하지 않음
		int var2 = t.add(var1);
		
		// 값이 변하지 않음
		System.out.println("값1 : " + var1); //100
		System.out.println("값2 : " + var2); //101
		System.out.println();
		
		int[] su = {1,10,100,1000};
		// 인자가 객체(배열도 포함)자료형 : Call By Reference
		// 참조되는 값이 변할 수도 있음
		t.add2(su);
		// 배열 안에 값이 변함
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
		
	}
}
