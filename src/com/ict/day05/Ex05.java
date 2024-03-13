package com.ict.day05;

public class Ex05 {
	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		// 형식2)
		//   초기식 또는 현재변수
		//   while(true){
		//     if(빠져나갈 조건) break;
		//     실행할 내용;
		//     증감식
		//   }
		// * while의 끝을 만나면 조건식으로 이동
		
		// 0-10까지 출력
		int k1 = 0;
		while (true) {
			if (k1 >= 11) break; 
			System.out.println(k1);
			k1++;
		}
		
		
		System.out.println();
		
		
		// 10-20까지 짝수만 출력
		int k2 = 10;
		while (true) {
			if (k2%2==0) {
				if (k2 >= 21) break;		
				System.out.println(k2);
			}	
			k2++;
		}
		
		
		System.out.println();
		
		
		// a - h 까지 출력
		char k3 = 'a';
		while (true) {
			if (k3 >= 'i') break;			
			System.out.println(k3);
			k3++;
		}
		
		
		
		
		
	}
}
