package task;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex03_Baseball {
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
			// 스트라이크, 볼, 아웃 초기화
			int strike = 0;
			int ball = 0;
			int out = 0;
			try {
				esc: while (true) {
					System.out.println("0 ~ 9 중 서로 다른 숫자 3개를 입력하세요");
					
					// 유저 숫자 3개 입력 받기
					System.out.print("첫번째 숫자 입력 : ");
					user[0] = scan.nextInt(); // try catch 에 의해 정수가 아니면 예외처리
					System.out.print("두번째 숫자 입력 : ");
					user[1] = scan.nextInt();
					System.out.print("세번째 숫자 입력 : ");
					user[2] = scan.nextInt();

					// 받은 정수가 0 ~ 9 사이의 수인지 검사
					for (int j = 0; j < user.length; j++) {
						if (user[j] < 0 || user[j] > 9) {			
							continue esc; // 0 보다 작거나 9 보다 큰 정수를 입력하면 다시 받기
						}
					}

					// 3개의 숫자가 모두 다를 때 while 문 탈출
					if (user[0] != user[1] && user[1] != user[2] && user[2] != user[0]) {
						break esc;
					} 
				}

				// 일단 값이 같으면 strike 또는 ball
				//	그중 자리값도 같으면 strike
				for (int j = 0; j < user.length; j++) {
					for (int k = 0; k < user.length; k++) {
						if(com[j]==user[k]) {
							if (j==k) {
								strike ++;
							}else {
								ball++;
							}
						}
					}
				}
				
				// 스트라이크, 볼, 아웃 개수로 출력
				out = 3 - strike - ball;
				System.out.println("strike : " + strike + "개, ball : " + ball + "개, out : " + out + "개");
				System.out.println();

				// strike 3개 > 승리 > for 문 탈출
				if (strike == 3) {
					System.out.println("승리하셨습니다");
					break;
				}
				
				// for 문이 10번 돌아 갈때까지 못맞추면 > 패배 (i 는 0부터 시작 9에서 끝)
				if (i == 9) {
					System.out.println("패배하셨습니다");	 
				}
			} catch (InputMismatchException e) { // int 형이 아니면 예외처리
				scan.nextLine(); // enter 치고 값이 남아있어서 무한루프 도는데 그걸 방지
				i--;
			}
		} // 10번 돌면 자동으로 끝남 > 횟수가 정해져서 for 문 사용
		
		// 컴퓨터가 가진 숫자 배열 > 정답 출력
		System.out.println("정답");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}

	}
}
