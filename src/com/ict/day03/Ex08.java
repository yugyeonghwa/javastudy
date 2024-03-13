package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초일까?
		
		int total = 3989;
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0; //나머지 저장
		
		h = total/(60 * 60);
		res = total % (60 * 60);
		
		m = res/(60);
		s = res%(60);
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		
		System.out.println("3989초는 " + h + "시간 " + m + "분 " + s + "초입니다.");
		
	}
}
