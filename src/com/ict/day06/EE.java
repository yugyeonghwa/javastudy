package com.ict.day06;

import java.util.Scanner;

public class EE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 숫자를 받아서 홀수인지, 짝수인지 출력하자
		// 전체 횟수, 짝수 횟수, 퍼센트(소수점 둘째자리까지)
		int total = 0;
		int even = 0;
		double per = 0;		
		
		esc: while (true) {
			total++;
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String res = "";
			if (su % 2 == 0) {
				res = "짝수";
				even++;
			} else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다.");

			while (true) {
				System.out.print("계속할까요? (1.yes, 2.no) >>");
				int res2 = scan.nextInt();
				if (res2 == 1)
					continue esc;
				if (res2 == 2)
					break esc;
				System.out.println("다시 입력하세요.");
			}
			
		}
		System.out.println("다시 입력하세요.");
		per = (even*(total*1.0))*100;
		System.out.println(per);
		
	}
}
