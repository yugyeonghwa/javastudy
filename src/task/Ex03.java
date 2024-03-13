package task;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		// 야구게임

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		// 컴퓨터 3개의 숫자 배열
		int[] com = new int[3];

		while (true) {
			for (int i = 0; i < com.length; i++) {
				// 0 ~ 9 임의의 숫자 배정
				com[i] = ran.nextInt(10);
			}
			// 3개의 숫자가 모두 다를 때 while 문 탈출
			if (com[0] != com[1] && com[1] != com[2] && com[2] != com[0])
				break;
		}

		// 유저 3개의 숫자 배열
		int[] user = new int[3];

		for (int i = 0; i < 10; i++) {
			// 스트라이트 3개면 승리
			int strike = 0;

			while (true) {
				// 유저 숫자 3개 입력 받기
				System.out.print("숫자 입력 : ");
				user[0] = scan.nextInt();
				System.out.print("숫자 입력 : ");
				user[1] = scan.nextInt();
				System.out.print("숫자 입력 : ");
				user[2] = scan.nextInt();

				// 3개의 숫자가 모두 다를 때 while 문 탈출
				if (user[0] != user[1] && user[1] != user[2] && user[2] != user[0]) {
					break;
				} else {
					System.out.println("서로 다른 숫자를 입력하세요");
				}
			}

			// 자리와 값이 같으면 strike , 자리는 다르고 값이 같으면 ball , 같은 값이 어디에도 없으면 out
			if (com[0] == user[0]) {
				strike++;
				System.out.print("strike ");
			} else if (com[0] == user[1] || com[0] == user[2]) {
				System.out.print("ball ");
			} else if (com[0] != user[0] && com[0] != user[1] && com[0] != user[2]) {
				System.out.print("out ");
			}

			if (com[1] == user[1]) {
				strike++;
				System.out.print("strike ");
			} else if (com[1] == user[0] || com[1] == user[2]) {
				System.out.print("ball ");
			} else if (com[1] != user[0] && com[1] != user[1] && com[1] != user[2]) {
				System.out.print("out ");
			}

			if (com[2] == user[2]) {
				strike++;
				System.out.print("strike ");
			} else if (com[2] == user[1] || com[2] == user[0]) {
				System.out.print("ball ");
			} else if (com[2] != user[0] && com[2] != user[1] && com[2] != user[2]) {
				System.out.print("out ");
			}

			System.out.println();

			// 3 strike > 승리 > 탈출
			if (strike == 3) {
				System.out.println("승리하셨습니다");
				break;
			}
			// 10번 끝날때까지 못맞추면 > 패배
			if (i == 9) {
				System.out.println("패배하셨습니다");
			}

		} // for 문

		// 컴퓨터가 가진 숫자 배열 > 정답 출력
		System.out.println("정답");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}

	}
}
