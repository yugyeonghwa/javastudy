/*	
 * 자바 과제
 * DATE: 2024-01-12
 * 과제01: 가위 바위 보 게임
 */
package task;

import java.util.*;

public class RPSGame2 {

	public static void main(String[] args) {
		// y/n받을 변수 = msg
		// 컴퓨터 수 = c_RPS
		// 플레이어 수 = p_RPS
		// 승리 = win
		// 패배 = loss
		// 무승부 = draw
		// 판수 = playCount
		// 승률 = rate
		Scanner sc = new Scanner(System.in);
		int c_RPS = 0, p_RPS = 0, win = 0, lose = 0, draw = 0, playCount = 0;
		double rate = 0;
		String msg = "";

		System.out.print("게임을 시작하려면 엔터를 누르세요.");
		sc.nextLine();

		// 게임 실행
		esc: while (true) {
			System.out.println("===================");
			System.out.println("<<<<가위 바위 보 시작>>>>");
			System.out.println();
			// 판수 1 올리기

			// 1 == 가위, 2 == 바위, 3 == 보

			// Computer의 가위 바위 보 저장
			c_RPS = (int) (Math.random() * 3) + 1; // Math.random() 1~3

			// player가 가위 바위 보 선택
			while (true) {
				System.out.println("가위 바위 보를 선택 해주세요.");
				System.out.print("1.가위 2.바위 3.보 ");
				msg = sc.nextLine();
				// player가 선택한 가위 바위 보 출력
				if (msg.contains("가위") || msg.contains("1")) {
					if( msg.contains("바위") || msg.contains("보") 
							||msg.contains("2")||msg.contains("3")) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						System.out.println("===================");
						continue;
					}
					p_RPS = 1;
					System.out.println("가위를 선택하셨습니다.");
					break;
				} else if (msg.contains("바위") || msg.equals("2") ) {
					if( msg.contains("가위") || msg.contains("보") 
							||msg.contains("1")||msg.contains("3")) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						System.out.println("===================");
						continue;
					}
					p_RPS = 2;
					System.out.println("바위를 선택하셨습니다.");
					break;
				} else if (msg.contains("보")||msg.equals("3")) {
					if( msg.contains("바위") || msg.contains("가위") 
							||msg.contains("2")||msg.contains("1")) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						System.out.println("===================");
						continue;
					
					}
					p_RPS = 3;
					System.out.println("보를 선택하셨습니다.");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					System.out.println("===================");
				}
			}
			System.out.println();

			// player와 computer 비교
			switch (p_RPS) {
			case 1: // player가 가위 인 경우
				if (c_RPS == 1) {
					System.out.println("Player: 가위\tComputer: 가위");
					System.out.println("\t<<<패배하셨습니다.>>>");
					lose++;
					playCount++;
					break;
				} else if (c_RPS == 2) {
					System.out.println("Player: 가위\tComputer: 바위");
					System.out.println("\t<<<승리하셨습니다.>>>");
					win++;
					playCount++;
					break;
				} else if (c_RPS == 3) {
					System.out.println("Player: 가위\tComputer: 보");
					System.out.println("\t<<<비기셨습니다.>>>");
					draw++;
					playCount++;
					break;
				}
				break;
			case 2: // player가 바위인 경우
				if (c_RPS == 1) {
					System.out.println("Player: 바위\tComputer: 가위");
					System.out.println("\t<<<승리하셨습니다.>>>");
					win++;
					playCount++;
					break;
				} else if (c_RPS == 2) {
					System.out.println("Player: 바위\tComputer: 바위");
					System.out.println("\t<<<비기셨습니다.>>>");
					draw++;
					playCount++;
					break;
				} else if (c_RPS == 3) {
					System.out.println("Player: 바위\tComputer: 보\n");
					System.out.println("\t<<<패배하셨습니다.>>>");
					lose++;
					playCount++;
					break;
				}
				break;
			case 3: // player가 보인 경우
				if (c_RPS == 1) {
					System.out.println("Player: 보\tComputer: 가위");
					System.out.println("\t<<<패배하셨습니다.>>>");
					lose++;
					playCount++;
					break;
				} else if (c_RPS == 2) {
					System.out.println("Player: 보\tComputer: 바위");
					System.out.println("\t<<<승리하셨습니다.>>>");
					win++;
					playCount++;
					break;
				} else if (c_RPS == 3) {
					System.out.println("Player: 보\tComputer: 보");
					System.out.println("\t<<<비기셨습니다.>>>");
					draw++;
					playCount++;
					break;
				}
				break;
			default:
				break;
			}

			// 승률 계산
			rate = (int) ((win / (playCount * 1.0)) * 1000) / 10.0;

			// 결과 화면 출력
			System.out.println("");
			System.out.println(playCount+"전 "+win + "승 " + lose + "패 " + draw + "무");
			System.out.println("승률:" + rate + "%");
			System.out.println();

			// 계속 할 것인지 확인

			while (true) {
				System.out.print("계속 하시겠습니까?(y/n):");
				msg = sc.next();
				sc.nextLine(); // 버퍼 비우기
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("N")) {
					break esc;
				} else
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}

		}
		System.out.println("===================");
		System.out.println("   가위 바위 보 결과");
		System.out.println(playCount+"전 "+win + "승 " + lose + "패 " + draw + "무");
		System.out.println("승률:" + rate + "%");
		System.out.println("===================");

		System.out.println("프로그램을 종료합니다.");
	}
}
