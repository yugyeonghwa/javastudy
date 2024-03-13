package com.ict.day03;

public class Ex09 {
	public static void main(String[] args) {
		// 카페모카 6,500원이다
		// 친구와 둘이서 15,000원을 내고 주문했다
		// 잔돈은 얼마인가? (단, 부가세 10% 포함)
		
		int su1 = 6500;
		int su2 = su1*2;
		int su3 = su2/10;
		int su4 = su2 + su3;
		int su5 = 15000;
		int result = su5 - su4;
		System.out.println(result + "원");

		
		//쌤
		String coff = "카페모카";
		int input = 15000;
		int dan = 6500;
		int su = 2;
		
		int total = dan * su;
		int vat = total/10;
		//int vat2 = (int)(total*0.1);
		int sum = total + vat;
		
		// 다른 방법
		//int sum2 = (int)(total * 1.1);
		
		int output = input - sum;
		
		System.out.println(output + "원");
		
	}
}
