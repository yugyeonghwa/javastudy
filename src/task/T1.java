package task;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int total = 0;		// 총 실행 횟수
		int win = 0;		// 승리
		int loss = 0;		// 패배
		int draw = 0;		// 무승부
		int p_Num = 0;		// 플레이어 수
		String str = "";	// 플레이어 수 입력결과?
		String res = "";	// 컴퓨터 수와 플레이어 수 비교 결과
		
		System.out.println("게임을 시작합니다.");
		
		esc: while (true) {
			// 랜덤으로 수 0~2 뽑아내서 컴퓨터 수(int c_Num)에 저장
			int c_Num = (int) (Math.random() * 3);

			// 플레이어 수(int p_Num) 입력받기
			System.out.println();
			System.out.print("입력하시오. (가위, 바위, 보) >> ");
			str = scan.next();

			// 0가위 1바위 2보
			// 무승부 00 11 22 ==
			// 승리 01 12 20 -1 -1 2
			// 패배 02 10 21 -2 1 1

			switch (str) {
			case "가위":
				p_Num = 0;
				break;
			case "바위":
				p_Num = 1;
				break;
			case "보":
				p_Num = 2;
				break;
			default:
				System.out.println("다시 입력하세요.");
				continue esc;
			}
			total++;

			// 플레이어 수와 컴퓨터 수 비교 (if문)
			if (c_Num == p_Num) {
				res = "draw";
				draw++;
			} else if (c_Num - p_Num == -1 || c_Num - p_Num == 2) {
				res = "win";
				win++;
			} else {
				res = "loss";
				loss++;
			}
			// 비교 결과 출력 (승리,패배)
			System.out.println("결과는 " + res + "입니다");

			// 계속할 것인지 아닌지 (y/n)(대소문자 구분 x) 입력 받음
			// (Y/y)입력 1부터 반복, (N/n)입력 반복문 탈출(break)
			while (true) {
				System.out.print("계속할까요? (y, n) >> ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				}
				if (msg.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("다시 입력하세요.");
			}

		}

		// (총 실행 횟수, 몇승 몇패, 승률) 출력
		System.out.println();
		System.out.println("총 실행 횟수 : " + total);
		System.out.println("전적 : " + win + "승 " + loss + "패 " + draw + "무");
		double rate = (win / (total * 1.0)) * 100;
		System.out.println("승률 : " + ((int) (rate * 10) / 10.0) + "%");
		// 종료 메시지 출력
		System.out.println("게임이 종료되었습니다.");

	}
}
