package com.ict.day08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 학생 수 받기
		System.out.print("학생 수를 입력하시오 : ");
		int su = scan.nextInt();

		double[][] arr = new double[su][8];
		for (int i = 0; i < arr.length; i++) {
			// 한사람의 정보를 담고 있는 배열?
			double[] p = new double[8];

			System.out.print("번호를 입력하시오 : ");
			p[0] = scan.nextInt();

			System.out.print("국어 점수를 입력하시오 : ");
			p[1] = scan.nextInt();

			System.out.print("영어 점수를 입력하시오 : ");
			p[2] = scan.nextInt();

			System.out.print("수학 점수를 입력하시오 : ");
			p[3] = scan.nextInt();

			p[4] = p[1] + p[2] + p[3]; // 총점

			p[5] = (int) (p[4] / 3.0 * 10) / 10.0; // 평균

			// 학점
			if (p[5] >= 90) {
				p[6] = 'A';
			} else if (p[5] >= 80) {
				p[6] = 'B';
			} else if (p[5] >= 70) {
				p[6] = 'C';
			} else
				p[6] = 'F';

			// 순위의 초기값은 무조건 1
			p[7] = 1;
			// **다차원 배열에 넣기
			arr[i] = p;
		}

		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j)continue;
				if (arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}
		
		
		// 정렬
		// 임시 저장할 배열
		double[] tmp = new double[8]; 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		
		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 국어, 영어, 수학 출력에서 제외
				if (j == 1 || j == 2 || j == 3)
					continue;

				// 평균이므로 실수
				if (j == 5) {
					System.out.print(arr[i][j] + "\t");
				// 학점 char으로 형변환
				} else if (j == 6) {
					System.out.print((char) (arr[i][j]) + "\t");
				// 번호 총점 순위는 정수로
				} else {
					System.out.print((int)(arr[i][j]) + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
