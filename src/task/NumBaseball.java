/*	
 * 자바 과제
 * DATE: 2024-01-19
 * 과제02: 숫자야구
 */
package task;

import java.util.*;

public class NumBaseball {
	Scanner sc = new Scanner(System.in);
	private int size = 3;
	private int life = 10;
	private int[] c_num = new int[size];
	private int[] p_num = new int[size];
	
	public static void main(String[] args) {
		// 숫자야구 객체 생성
		NumBaseball numbaseball = new NumBaseball();
		
		// 숫자야구 실행
		numbaseball.play();
			
	}
	// 게임 실행
	public void play() {
		
		// 숫자 자릿수 설정
		System.out.print("맞출 숫자 자릿수 설정: ");
		setSize(sc.nextInt());

		// 맞출 기회 설정
		System.out.print("도전할 기회를 설정하세요. : ");
		setLife(sc.nextInt());
		
		// 컴퓨터가 가진 정답 설정
		setC_num();
		
		// 승리조건 or 패배조건을 만족할 때까지 반복 
		while (true) {
			// 플레이어 정답 입력
			setP_num();

			// 승리 확인 ( 승리시 게임 종료, 아닐경우 기회 -1)
			if (win_Check()) 
				break;
			
			// 기회 감소
			life--;
			
			// 패배 확인
			if (lose_Check(life))
				break;
			
		}
		
	}
	
	// 중복 체크 (중복이라면 true 반환,중복이 없다면 false 반환)
	public boolean isDuplicate(int[] num) {
		boolean isDuplicate = false;
		
		// num[0] ~ num[size-1]까지 서로 비교
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				// 중복이라면 isDuplicate = true;
				if (num[i] == num[j]) {
					isDuplicate = true;
					break;
				}
			}
		}
		return isDuplicate;
	}
	
	// 컴퓨터의 정답과 플레이어의 입력값 비교
	public boolean check(int[] c_num, int[] p_num) {
		int s_cnt = 0;
		int b_cnt = 0;
		int o_cnt = size;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0 ; j < size; j++) {
				if(i==j){
					if(c_num[i]==p_num[j]) {
						s_cnt++;
						break;
					}
				}
				if(c_num[i] == p_num[j]) {
						b_cnt++;
					break;
				}
			}
		}
		o_cnt = size - s_cnt - b_cnt;
		
		System.out.println(s_cnt + "스트라이크 " + b_cnt + "볼 " + o_cnt + "아웃");
		
		// 모두 스트라이크시 check 성공 반환
		if(s_cnt == getSize())
			return true;
		
		// 기본은 check 실패 반환 
		return false;
	}
	
	// 승리 조건 설정
	public boolean win_Check() {
		if(check(c_num,p_num) == true) {
			System.out.println("승리하셨습니다.");
			return true;
		}
		else
			return false;
	}
	
	// 패배 조건 설정
	public boolean lose_Check(int life) {
		if (life == 0) {
			System.out.println();
			System.out.println("남은 기회를 모두 소진하였습니다.");
			System.out.print("정답은 : ");
			for (int i = 0; i < c_num.length; i++) {
				System.out.print(getC_num()[i] + " ");
				
			}
			return true;
		}
		System.out.println();
		System.out.println("남은 기회는 " + life + "입니다.");

		return false;
	}

	// 숫자야구 숫자 갯수 지정
	public void setSize(int size) {
		this.size = size;
		this.c_num = new int[size];
		this.p_num = new int[size];
	}
	
	// 숫자야구 숫자 갯수 호출
	public int getSize() {
		return size;
	}
	
	// 목숨 설정
	public void setLife(int life) {
		this.life = life;
	}
	
	// 목숨 확인
	public int getLife() {
		return life;
	}
	
	// 컴퓨터에게 숫자 배정
	public void setC_num() {
		while (true) {
			// 컴퓨터에게 숫자 3개 배정
			for (int i = 0; i < getSize(); i++) {
				c_num[i] = (int) (Math.random() * 10); // 0~9 c_num[i]에 입력 size만큼
			}
			
			// 중복확인
			if (!isDuplicate(c_num)) {
				break;
			}
		}
	}

	// 컴퓨터가 가진 숫자 호출
	public int[] getC_num() {
		return c_num;
	}
	
	// 플레이어 숫자 입력
	public void setP_num() {
		while(true) {
			System.out.println("숫자 0~9까지 숫자를 "+getSize()+"번 입력해 주세요. : ");
			for (int i = 0; i < p_num.length; i++) {
				p_num[i] = sc.nextInt();
			}
			System.out.print("입력한 숫자는 :");
			for (int i = 0; i < p_num.length; i++) {
				System.out.print(p_num[i] + " ");
			}
			System.out.println();
			
			if(isDuplicate(p_num)) {
				System.out.println("숫자가 중복 입력되었습니다. 다시 입력해 주세요.");
				
			}else 
				break;
		}
	}
	
	// 플레이어 숫자 호출
	public int[] getP_num() {
		return p_num;
	}
		
}
