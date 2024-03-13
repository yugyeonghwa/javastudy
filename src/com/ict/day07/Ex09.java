package com.ict.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열의 크기
		int size = 5;

		// 배열 선언
		String name[] = new String[size];
		int kor[] = new int[size];
		int eng[] = new int[size];
		int math[] = new int[size];

		int sum[] = new int[size];
		double avg[] = new double[size];
		String hak[] = new String[size];
		int rank[] = new int[size];

		Arrays.fill(rank, 1);

		// size 만큼 반복해서 정보를 입력받음
		for (int i = 0; i < size; i++) {
			// 정확한 이름 국어 영어 수학 점수를 입력받으면 탈출
			while (true) {
				// 숫자입력에 다른 값 입력 받으면 try catch 문을 통해 에러를 검출하고 다시 실행
				try {
					System.out.print("이름을 입력하세요: ");
					name[i] = sc.next();
					System.out.print("국어점수를 입력하세요: ");
					kor[i] = sc.nextInt();
					System.out.print("영어점수를 입력하세요: ");
					eng[i] = sc.nextInt();
					System.out.print("수학점수를 입력하세요: ");
					math[i] = sc.nextInt();
					System.out.println();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("잘못 입력했습니다." + e.getMessage());
					System.out.println("다시 입력해주세요.");
					sc.nextLine(); // 버퍼 비우기
					System.out.println();
				}
			}
		}

		// 총점, 평균, 학점, 구하기
		for (int i = 0; i < size; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}

		// 등수 구하기
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (sum[i] == sum[j])
					continue;
				if (sum[i] < sum[j])
					rank[i]++;
			}
		}

		// 결과 출력
		for (int i = 0; i < size; i++) {
			System.out.println(
					name[i] + "의 총점은 " + sum[i] + " 평균은 " + avg[i] + " 학점은 " + hak[i] + " 등수는 " + rank[i] + "입니다.");
		}

		sc.close();
	}
}
