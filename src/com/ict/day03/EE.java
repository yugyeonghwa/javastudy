package com.ict.day03;

public class EE {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 7;
		boolean res;
		
		// 참 = 참 || 참
		res = (su1 >= 7) || (su2 >= 3);
		System.out.println(res);
		
		// 참 = 거짓 || 참
		res = (su1 <= 7) || (su2 >= 3);
		System.out.println(res);
		
		// 참 = 참 || 거짓
		res = (su1 >= 7) || (su2 <= 3);
		System.out.println(res);
		
		// 거짓 = 거짓 || 거짓
		res = (su1 <= 7) || (su2 <= 3);
		System.out.println(res);
		
		System.out.println();
		
		// 참이 나오기 전까진 연산함. 참이 나온 이후에는 연산하지 않음.
		res = ((su1 = su1 + 2) < su2) || ((su2 = su2 + 7)> su1);
		System.out.println("결과 : " + res);
		System.out.println("결과 : " + su1);
		System.out.println("결과 : " + su2);
		
		
		
		
	}
}
