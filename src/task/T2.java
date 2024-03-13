package task;

import java.util.Random;
import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		// 숫자야구게임
		
		Scanner scan = new Scanner(System.in);

		System.out.println("게임을 시작합니다." + "\n");

		Random ran = new Random();

		int[] com = new int[3]; // 컴퓨터
		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(10); // 0~9까지 랜덤으로 수 3개 뽑아내기
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}

		int[] p = new int[3]; // 플레이어

		for (int i = 0; i < 10; i++) {

			while (true) {
				System.out.print("첫번째 숫자 입력 : ");
				p[0] = scan.nextInt();

				System.out.print("두번째 숫자 입력 : ");
				p[1] = scan.nextInt();

				System.out.print("세번째 숫자 입력 : ");
				p[2] = scan.nextInt();

				// 입력 숫자 중 중복 없을 때
				if (p[0] != p[1] && p[1] != p[2] && p[2] != p[0]) {
					break;
				} else {
					System.out.println("중복되지 않은 숫자를 입력하세요.");
				}
			}

			int strike = 0;
			int ball = 0;
			int out = 0;

			// 컴퓨터 수랑 플레이어 수랑 비교하기
			for (int j = 0; j < com.length; j++) {
				for (int j2 = 0; j2 < p.length; j2++) {
					// 숫자가 같고, 자리까지 같으면 strike
					if (com[j] == p[j2] && j == j2) {
						strike++;
					// 숫자는 같은데, 자리가 다르면 ball
					} else if (com[j] == p[j2] && j != j2) {
						ball++;
					}
				}
			}
			// out 구하기
			out = 3 - (strike + ball); 
			System.out.println(strike + "strike " + ball + "ball " + out + "out");
			
			// 게임 결과
			if (strike == 3) {
				System.out.println(">> WIN <<");
				break;
			} else if (i == 9) {
				System.out.println(">> lose <<");
				break;
			}
			System.out.println((9 - i) + "회 남았습니다." + "\n");

		}

		// 정답 출력
		System.out.print("정답 공개!! >> ");
		System.out.print(com[0]);
		System.out.print(com[1]);
		System.out.println(com[2]);

	}

}
