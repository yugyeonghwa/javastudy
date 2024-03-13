package com.ict.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList를 스트림으로
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i -> System.out.print(i + " "));
		System.out.println();
		 
		// 중간처리 : 오름차순 정렬 => sorted()
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 내림차순 정렬 => sorted(Comparator.reverseOrder()) 
		Stream<String> stream3 = sList.stream();
		stream3.sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 오름차순 : 숫자 -> 대문자 -> 소문자 -> 한글
		Stream<String> stream4 = Stream.of(new String[] {"bb", "a", "0", "CC", "3", "dd", "BB", "aaa", "가"});
		stream4.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 내림차순
		Stream<String> stream5 = Stream.of(new String[] {"bb", "a", "0", "CC", "3", "dd", "BB", "aaa", "가"});
		stream5.sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 오름차순 알파벳 정렬 (같은 단어에 대소문자만 다를 때는 먼저 생성된 것이 먼저 출력됨 bb BB)
		Stream<String> stream6 = Stream.of(new String[] {"bb", "a", "0", "CC", "3", "dd", "BB", "aaa", "가"});
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 내림차순 알파벳 정렬
		Stream<String> stream7 = Stream.of(new String[] {"bb", "a", "0", "CC", "3", "dd", "BB", "aaa", "가"});
		stream7.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		
	}
}
