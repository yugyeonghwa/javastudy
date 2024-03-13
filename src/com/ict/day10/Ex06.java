package com.ict.day10;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수 : ");
		int su = scan.nextInt();

		// 학생 수 만큼 배열 크기를 만들자
		// 해당 배열 안에는 클래스가 들어감
		// Ex05 클래스로 만든 객체를 배열에 자료형으로 사용
		// 즉, 해당 배열 안에는 Ex05로 만든 객체의 주소만 존재함
		Ex05[] arr = new Ex05[su];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = scan.next();

			System.out.print("국어 : ");
			int kor = scan.nextInt();

			System.out.print("영어 : ");
			int eng = scan.nextInt();

			System.out.print("수학 : ");
			int math = scan.nextInt();

			Ex05 p = new Ex05();
			p.process(name, kor, eng, math);

			arr[i] = p;

		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}

		// 정렬
		// 임시저장 (클래스)
		Ex05 tmp = new Ex05();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].sum + "\t");
			System.out.print(arr[i].avg + "\t");
			System.out.print(arr[i].hak + "\t");
			System.out.print(arr[i].rank + "\n");
		}

	}
}
