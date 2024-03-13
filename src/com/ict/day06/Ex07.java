package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체 횟수, 짝수 횟수, 퍼센트(소수점 둘째자리까지)

		int total = 0; // 전체횟수
		int su = 0; // 짝수횟수
		int su1 = 0; // 홀수횟수
		esc: while (true) {
			total++;
			System.out.print("숫자 입력 : ");
			int k1 = scan.nextInt();
			String res = "";
			if (k1 % 2 == 0) {
				res = "짝수";
				su++;
			} else {
				res = "홀수";
				su1++;
			}
			System.out.println(k1 + "는 " + res + "입니다.");
			
			while (true) {
				System.out.print("계속할까요? (1.yes, 2.no) >>");
				int res2 = scan.nextInt();
				if (res2 == 1)continue esc;
				if (res2 == 2)break esc;

				System.out.println("다시 입력하세요.");
			}
		}
		System.out.println("수고하셨습니다.");
		double per = (su/(total*1.0))*100;
		System.out.println("전체횟수 : " + (total));
		System.out.println("짝수횟수 : " + su );
		System.out.println("퍼센트 : " + ((int)(per*100)/100.0) + "%" );
		
	
		
		
		
		
		
		
		

	}
}
