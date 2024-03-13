package com.ict.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex01_Main {
	public static void main(String[] args) {
		Ex01 p1 = new Ex01("이순신", 40, 100);
		Ex01 p2 = new Ex01("김유신", 20, 100);
		Ex01 p3 = new Ex01("홍길동", 13, 50);
		
		List<Ex01> list = new ArrayList<Ex01>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		// 컬렉션으로 처리하기
		System.out.println("=== 고객명단 순서대로 출력 ===");
		for (Ex01 k : list) {
			System.out.println(k.getName() + "고객");
		}
		
		
		System.out.println("총 비용은 입니다.");
		
		
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		for (Ex01 k2 : list) {
			System.out.println();
		}
		
		
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
		
		System.out.println("====================================");
		
		// 스트림으로 처리하기
		System.out.println("=== 고객명단 순서대로 출력 ===");
		Stream<Ex01> stream = list.stream();
		stream.map(i -> i.getName()).forEach(i -> System.out.println(i + "고객"));
		
		// 위에서 최종처리를 했으므로 다시 Stream 만들어 사용
		int sum = list.stream().mapToInt(i -> i.getPrice()).sum();
		System.out.println("총 비용은 " + sum + "입니다.");
		
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		stream = list.stream();
		stream.filter(i -> i.getAge() >= 20).map(i -> i.getName()).forEach(i -> System.out.println(i));
		
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
		stream = list.stream();
		stream.filter(i -> i.getAge() >= 20).map(i -> i.getName()).sorted().forEach(i -> System.out.println(i));
		
		
		
	}
}
