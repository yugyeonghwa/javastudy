package com.ict.day16;

import java.util.Iterator;
import java.util.Stack;

/*
 	List 인터페이스 : 배열과 흡사한 구조,
 				  삽입, 삭제, 추가 자유로움
 				  크기를 미리 지정하지 않아도 됨
 	구현한 클래스 : Stack, Vector, ArrayList
 	     구조 : LIFO(Last In First Out)
 	      	  마지막에 들어온 데이터가 먼저 나가는 형태
 	add, push, addElement => 추가
 	add(index, E)		 => 삽입
    pop  : 맨 위에 존재하는 객체 반환 후 삭제함
    peak : 맨 위에 존재하는 객체 반환 후 삭제를 하지 않음
    contains(Element e) : boolean => 해당 Element 가 포함되어 있으면 true
    search : 검색 (오른쪽 1부터)
    **indexOf : 검색 (왼쪽 0부터) => 배열형식처럼
 	elementAt(index) : 해당 요소 반환
 	**get(index) : 해당 요소 반환
 	firstElement() : 맨 처음 요소 반환
 	lastElement() : 맨 마지막 요소 반환
 	setElement(Element, index) : 치환
 */

public class Ex01 {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		
		s1.add(1, "고길동");
		s1.add(3, "희동이");
		System.out.println(s1);
		System.out.println();
		
		// 마지막 객체 보기 : pop(삭제), peak, lastElement
		String res = s1.peek();
		System.out.println("가지고 온 객체 : " + res);
		System.out.println(s1);
		System.out.println();
		
		res = s1.pop();
		System.out.println("가지고 온 객체 : " + res);
		System.out.println(s1);
		System.out.println();
		
		res = s1.lastElement();
		System.out.println("가지고 온 객체 : " + res);
		System.out.println(s1);
		System.out.println();
		
		if(s1.contains("둘리")) {
			// 위치값 검색
			System.out.println(s1.indexOf("둘리"));
			System.out.println(s1.search("둘리"));
			
			// 위치값을 이용해서 Element 반환
			System.out.println(s1.get(1));
			System.out.println(s1.elementAt(1));
			
			// 처음 마지막 요소 반환
			System.out.println(s1.firstElement());
			System.out.println(s1.lastElement());
		}else {
			System.out.println("존재하지 않습니다.");
		}
		
		// 고길동을 도우너로 변경하기
		if (s1.contains("고길동")) {
			s1.setElementAt("도우너", s1.indexOf("고길동"));
		}
		System.out.println(s1);
		System.out.println();
		
		// 중복가능
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println();
		
		// 하나씩 꺼내기
		for (String k : s1) {
			System.out.println(k + "님 !!!");
		}
		System.out.println();
		
		Iterator<String> it =  s1.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str + "짱 ^^");
			
		}
		System.out.println();
		
		// 하나씩 꺼낸다 (LIFO)
		while (!s1.isEmpty()) {
			String k = s1.pop();
			System.out.println(k + ", 크기는 " + s1.size() + "이다.");
		}
		
		
		
		
		
		
		
	}
}
