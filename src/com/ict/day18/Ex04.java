package com.ict.day18;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 정수 배열을 스트림으로 활용하기
		int[] arr = { 1, 2, 3, 4, 5 };
		int sumVal = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();

		System.out.println("sum : " + sumVal);
		System.out.println("count : " + count);
	}
}
