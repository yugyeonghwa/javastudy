package com.ict.day07;

import java.util.Iterator;

public class EE {
	public static void main(String[] args) {
		// String 클래스
		// 1. String.getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환시킴
		// 보통 입출력에 사용(대문자, 소문자, 숫자, 영어 이외에는 안됨)
		String s1 = "java 대한 JAVA";
		byte[] b1 = s1.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}

		System.out.println();

		// String.toCharArray(): char[]
		// 해당 문자열을 char[]로 변환시킴
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}

		System.out.println();

		// 2. split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// String regex => 구분자(나눌 기준)
		// int limit => 나눌 배열의 크기
		
		String s2 = "사과, 딸기 망고, 오렌지, 두리안 용과";
		String[] s3 = s2.split(",");
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		System.out.println();
		
		
		
		
		
		
		

	}
}
