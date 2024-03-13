package com.ict.day09;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Ex17 t = new Ex17();

		Scanner scan = new Scanner(System.in);

		// 첫번째 숫자
		System.out.print("첫번째 숫자 입력 : ");
		int k1 = scan.nextInt();

		// 두번째 숫자
		System.out.print("두번째 숫자 입력 : ");
		int k2 = scan.nextInt();

		// 연산자 : + - * /
		System.out.print("연산자 입력 : + - * /  >> ");
		String str = scan.next();

		switch (str) {
		case "+":
			t.plus(k1, k2);
			System.out.println(k1 + str + k2 + "=" + t.res);
			break;
		case "-":
			t.sub(k1, k2);
			System.out.println(k1 + str + k2 + "=" + t.res);
			break;
		case "*":
			int k = t.mul(k1, k2);
			System.out.println(k1 + str + k2 + "=" + k);
			break;
		case "/":
			double s = t.div(k1, k2);
			System.out.println(k1 + str + k2 + "=" + s);
			break;

		}

	}

}
