package com.ict.day05;

import java.util.Iterator;

public class EEE {
	public static void main(String[] args) {
		// int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일쥬스
		int k1 = 3;
		
		switch (k1) {
		case 1:
			System.out.println("카페모카");
			break;
		case 2:
			System.out.println("카페라떼");
			break;
		case 3:
			System.out.println("아메리카노");
			break;
		case 4:
			System.out.println("과일쥬스");
			break;
		}
		
		// char k2이 A이면 아프리카, B이면 브라질, C이면 캐나다, 나머지 한국
		char k2 = 'k';
		String res = "";
		
		switch (k2) {
		case 'A':
			res = "아프리카";
			break;
		case 'B':
			res = "브라질";
			break;
		case 'C':
			res = "캐나다";
			break;
		default: 
			res = "한국";
			break;
		}
		System.out.println(res);
		
		System.out.println();
		
		// 10-20 출력
		
		for (int i = 10; i < 21; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 10-20까지 짝수만 출력
		for (int i = 10; i < 21; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		// 10-20까지 홀수만 출력
		for (int i = 10; i < 21; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		
		
		System.out.println();
		
		// 5단 출력
		for (int i = 1; i < 9; i++) {
				System.out.println("5*" + i + "=" + (5*i));
			
		}
		
		System.out.println();

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println();
		
		// 0-10의 누적합(합계 구하기)
		int sum = 0;
		
		for (int i = 0; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		
	}
}
