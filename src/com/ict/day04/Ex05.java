package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		// if ~ else 문
		// 삼항연산자와 비슷하게 처리
		// 즉, 조건식이 참일 때와 거짓일 때 각각 나눠서 처리함
		// 주의사항 : 한줄은 블록 생략 가능
		// if(조건식){
		//    조건식이 참일 때 실행;
		//    조건식이 참일 때 실행;
		//    조건식이 참일 때 실행;
		// }else{
		//    조건식이 거짓일 때 실행;
		//    조건식이 거짓일 때 실행;
		//    조건식이 거짓일 때 실행;
		// }
		
		// int k1이 홀수인지 짝수인지 판별하자
		int k1 = 10;
		String result = "";
		if (k1%2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println("k1는 " + result + "입니다.");
		
		
		// int k2가 60이상이면 합격 아니면 불합격
		int k2 = 70;
		String result2 = "";
		if (k2 >= 60) {
			result2 = "합격";
		} else {
			result2 = "불합격";
		}
		System.out.println("결과 : " + result2 + "입니다.");
				
		
		// k3가 1이면 가격에 0.1 (10%) 할인한다. 얼마에 살 수 있나?
		int k3 = 1;
		int price = 1000;
		int result3 = 0;
		if (k3 == 1) {
			result3 = price - (int)(price*0.1);
		} else {
			result3 = price;
		}
		System.out.println("금액 : " + result3 + "원");
		
		
		// char k4 = 대문자인지, 대문자가 아닌지 판별하자
		char k4 = 'A';
		String result4 = "";
		if (k4 >= 'A' && k4 <= 'Z') {
			result4 = "대문자";
		} else {
			result4 = "대문자 아님";
		}
		System.out.println("결과 : " + result4);
		
		
		// 근무시간이 8시간까지는 시간당 9860이고
		// 8시간 초과한 시간만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int dan = 9860;
		int result5 = 0;
		int lmit = 8;
		if (time > lmit) {
			result5 = (int)(dan*1.5*(time-lmit))+(lmit*dan);
		} else {
			result5 = time*dan;
		}
		System.out.println(result5 + "원");
				
	}
}
