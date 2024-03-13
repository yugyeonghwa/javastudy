package com.ict.day18;

import java.util.stream.IntStream;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3 };
		
		IntStream intStream1 = IntStream.of(arr);
		intStream1.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 중간처리 : distinct() => 중복 제거
		IntStream intStream2 = IntStream.of(arr);
		intStream2.distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// filter(조건) : 조건에 안 맞는 요소 제외
		// 짝수만 출력
		IntStream intStream3 = IntStream.range(0, 10);			// 마지막 포함 X
		intStream3.filter(i -> i%2==0).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// limit(수) : 수만큼 자르기
		IntStream intStream4 = IntStream.rangeClosed(0, 10);	// 마지막 포함 O
		intStream4.limit(3).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// skip(수) : 수만큼 제외
		IntStream intStream5 = IntStream.rangeClosed(0, 10);	// 마지막 포함 O
		intStream5.skip(3).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		
		
		
	}
}
