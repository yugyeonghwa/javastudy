package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어 90, 영어 80, 수학 80 이다
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 첫째자리까지 구하자)
		
		String s1 = "홍길동";
		
		int su1 = 90;
		int su2 = 80;
		int su3 = 60;
		
		int sum = su1 + su2 + su3;
	
		// 정수를 실수로 만들어주고 형변환으로 다시 정수로 만들어줌 또다시 정수에 소수점 만들어줌??
		double av = (int) (sum / 3.0 * 10)/10.0;
		double av2 = (int) (sum / 3.0 * 100)/100.0;
		
		System.out.println("이름 : " + s1);
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + av + "점");
		System.out.println("평균 : " + av2 + "점");
		
		
		// 끝의 5를 버리고자 함
		int k1 = (198745/10)*10;
		int k2 = (198745/100)*100;
		System.out.println(k1);
		System.out.println(k2);
		
	}
}
