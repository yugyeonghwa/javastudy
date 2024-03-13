package com.ict.day08;

import java.util.Scanner;

public class EE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("학생 수를 입력하시오 : ");
		int su = scan.nextInt();

		double[][] arr = new double[su][8];

		for (int i = 0; i < su; i++) {
			double p[] = new double[8];

			System.out.print("번호 입력하시오 : ");
			p[0] = scan.nextDouble();
			System.out.print("국어점수를 입력하시오 : ");
			p[1] = scan.nextDouble();
			System.out.print("영어점수를 입력하시오 : ");
			p[2] = scan.nextDouble();
			System.out.print("수학점수를 입력하시오 : ");
			p[3] = scan.nextDouble();

			p[4] = p[1] + p[2] + p[3];
			p[5] = (int) (p[4] / 3.0 * 10) / 10.0;

			if (p[5] >= 90) {
				p[6] = 'A';
			} else if (p[5] >= 80) {
				p[6] = 'B';
			} else if (p[5] >= 70) {
				p[6] = 'C';
			} else {
				p[6] = 'F';
			}
			
			p[7] = 1;
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
		double[] tmp = new double[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		
		
		
		
		
	}
}
