package com.ict.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex02 {
	public static void main(String[] args) {
		/*
		  List 인터페이스 : 배열과 흡사한 구조, 삽입, 삭제, 추가 자유로움 크기를 미리 지정하지 않아도 됨 
		  구현한 클래스 : Stack, Vector, ArrayList 
		  Vector : 멀티 스레드에서 동기화 지원 
		  ArrayList : 멀티 스레드에서 동기화 지원하지 않음
		 */

		ArrayList<String> list = new ArrayList<String>();
		Vector<String> vector = new Vector<String>();

		list.add("손흥민");
		list.add("이강인");
		list.add("김민제");

		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민제");

		System.out.println(list);
		System.out.println(vector);
		System.out.println();

		// 둘리를 삽입하자
		list.add(1, "둘리");
		vector.add(1, "둘리");
		System.out.println(list);
		System.out.println(vector);
		System.out.println();

		// 중복 가능
		list.add("손흥민");
		list.add("이강인");
		vector.add("이강인");
		vector.add("김민제");
		System.out.println(list);
		System.out.println(vector);
		System.out.println();

		// 검색
		if (list.contains("이강인")) {
			System.out.println(list.indexOf("이강인"));
			System.out.println(list.get(list.indexOf("이강인")));

			// 둘리를 박지성으로 변경
			list.set(list.indexOf("둘리"), "박지성");
			// System.out.println(list.firstElement());
			// System.out.println(list.lastElement());
		}
		System.out.println(list);
		System.out.println();

		if (vector.contains("이강인")) {
			System.out.println(vector.indexOf("이강인"));
			System.out.println(vector.get(vector.indexOf("이강인")));

			// 둘리를 박지성으로 변경
			vector.set(vector.indexOf("둘리"), "박지성");
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		System.out.println(vector);
		System.out.println();

		// 하나씩 꺼내서 출력
		for (String k : list) {
			System.out.println(k + " 골");
		}
		System.out.println();

		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k + " 어시스트");
		}

	}
}
