package com.ict.day16;
	/*
	스레드(일꾼) : 현재 실행중인 프로그램 내에서 실행되는 세부 작어 단위
	
	싱글 스레드 : 스레드가 하나, 일꾼이 하나
	멑티 스레드 : 스레드가 여러매, 일꾼이 여러개, 병행처리
	자바에서 스레드 생성 : start() => run()
	1. Thread 클래스 상속받기 : start(), run() 메서드는 모두 있음
	2. Runnable 인터페이스 상속 : run()만 존재 (추상메서드)
	
	스레드 생성자 : Thread(), Thread(Runnable 인터페이스를 상속받은 객체)
			   Thread(), Thread(Runnable 인터페이스를 상속받은 객체, 스레드 이름)
	*/
	
public class Ex07 {
	public void play() {
		System.out.println("2:" + Thread.currentThread().getName());
	}
	public void start() {
		System.out.println("4:" + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// 현재 사용중인 스레드 이름 구하기
		System.out.println("1:" + Thread.currentThread().getName());
		
		Ex07 test = new Ex07();
		test.play();
		
		System.out.println("3:" + Thread.currentThread().getName());
		test.start();
		
		System.out.println("5:" + Thread.currentThread().getName());
		System.out.println("수고하셨습니다.");
		
	}
}
